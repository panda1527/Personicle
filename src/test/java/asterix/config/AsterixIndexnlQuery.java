package asterix.config;

import asterix.record.users.PersonicleUser;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AsterixIndexnlQuery {
    private static int TOTAL_SIZE = 1000000;
    private static int PDEGREE = 2;
    private static int BATCH_SIZE = 10000;
    private static List<String> users = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("./pseudo_users.adm"));
        String line;
        while ((line = br.readLine()) != null) {
            PersonicleUser user = JSONObject.parseObject(line, PersonicleUser.class);
            if (users.size() == TOTAL_SIZE) {
                break;
            }
            users.add(user.getUserName());
        }
        br.close();
        int threadNum = PDEGREE;
        if (args.length >= 1) {
            threadNum = Integer.parseInt(args[0]);
        }
        System.out.println("Thread: " + threadNum + " total: " + TOTAL_SIZE + " batch: " + BATCH_SIZE);
        Thread[] threads = new Thread[threadNum];

        for (int i = 0; i < threadNum; i++) {
            threads[i] = new Thread(new QueryThread(BATCH_SIZE, users));
            threads[i].start();
        }
    }
}
