package asterix.config;

import asterix.record.users.PersonicleUser;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AsterixIndexnlQuery {
    private static int TOTAL_SIZE = 1000000;
    private static int BATCH_SIZE = 100;

    public static void main(String[] args) throws Exception {
        List<String> users = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("./pseudo_users.adm"));
        String line;
        while ((line = br.readLine()) != null) {
            PersonicleUser user = JSONObject.parseObject(line, PersonicleUser.class);
            if (users.size() == TOTAL_SIZE) {
                break;
            }
            users.add(user.getUserName());
        }
        Random rand = new Random();
        for (int i = 0; i < BATCH_SIZE; i++) {
            AsterixConf conf = new AsterixConf("http://127.0.0.1:19002");
            AsterixConn conn = new AsterixConn();
            conf.setDataverse("PersonicleServer");
            String indexnlQuery = "\nSELECT f.foodname as fn, count(*) as counter" + "\nFROM users u, FoodLog f"
                    + "\nWHERE u.userName = \"" + users.get(rand.nextInt(users.size())).trim() + "\""
                    + "\nAND u.userId /*+ indexnl */ = f.userId" + "\ngroup by f.foodname\n" + "order by counter desc;";
            conf.setBody(indexnlQuery);
            conn.handleRequest(conf, AsterixConf.OpType.QUERY);
        }
    }
}
