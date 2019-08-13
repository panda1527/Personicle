package asterix.config;

import java.nio.file.Files;
import java.nio.file.Paths;

public class AsterixConfTest {
    private static void queryPattern(String query) throws Exception {
        AsterixConf conf = new AsterixConf("http://127.0.0.1:19002");
        AsterixConn conn = new AsterixConn();
        conf.setDataverse("Personicle");
        conf.setBody(query);
        System.out.println(conf.getBasicUrl());
        System.out.println(conf.getUrl(AsterixConf.OpType.QUERY));
        System.out.println(conf.getQuery());
        String ret = conn.handleRequest(conf, AsterixConf.OpType.QUERY);
        System.out.println(ret);
    }

    public static void main(String[] args) throws Exception {
        {
            AsterixConf conf = new AsterixConf("http://127.0.0.1:19002/");
            String sql = new String(Files.readAllBytes(Paths.get("./resources/personicle-schema.sqlpp")));
            System.out.println(sql);
            conf.setBody(sql);
        }
        {
            String simpleQuery = "\nSELECT COUNT(*) from users;";
            long begin = System.currentTimeMillis();
            queryPattern(simpleQuery);
            System.out.println("Runtime: " + (System.currentTimeMillis() - begin));
        }
        {
            String indexnlQuery = "\nSELECT f.foodname as fn, count(*) as counter" + "\nFROM users u, FoodLog f"
                    + "\nWHERE u.userName = \"匡书鹏\"" + "\nAND u.userId /*+ indexnl */ = f.userId"
                    + "\ngroup by f.foodname\n" + "order by counter desc;";
            long begin = System.currentTimeMillis();
            queryPattern(indexnlQuery);
            System.out.println("Runtime: " + (System.currentTimeMillis() - begin));
        }
        {
            String indexnlQuery = "\nSELECT f.foodname as fn, count(*) as counter" + "\nFROM FoodLog f, users u"
                    + "\nWHERE u.userName = \"匡书鹏\"" + "\nAND u.userId /*+ indexnl */ = f.userId"
                    + "\ngroup by f.foodname\n" + "order by counter desc;";
            long begin = System.currentTimeMillis();
            queryPattern(indexnlQuery);
            System.out.println("Runtime: " + (System.currentTimeMillis() - begin));
        }
    }
}