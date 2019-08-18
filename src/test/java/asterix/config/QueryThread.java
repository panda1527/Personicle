package asterix.config;

import java.util.List;
import java.util.Random;

public class QueryThread implements Runnable {
    private final int BATCH_SIZE;
    private final List<String> users;
    private final AsterixConf conf;
    private final AsterixConn conn;

    public QueryThread(int BATCH_SIZE, List<String> users) {
        this.BATCH_SIZE = BATCH_SIZE;
        this.users = users;
        this.conf = new AsterixConf("http://127.0.0.1:19002");
        this.conn = new AsterixConn();
    }

    @Override public void run() {
        Random rand = new Random(System.currentTimeMillis());
        conf.setDataverse("PersonicleServer");
        for (int i = 0; i < BATCH_SIZE; i++) {
            String indexnlQuery = "\nSELECT f.foodname as fn, count(*) as counter" + "\nFROM users u, FoodLog f"
                    + "\nWHERE u.userName = \"" + users.get(rand.nextInt(users.size())).trim() + "\""
                    + "\nAND u.userId /*+ indexnl */ = f.userId" + "\ngroup by f.foodname\n" + "order by counter desc;";
            conf.setBody(indexnlQuery);
            try {
                conn.handleRequest(conf, AsterixConf.OpType.QUERY);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
