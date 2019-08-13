package asterix.config;

public class AsterixIndexnlQuery {
    public static void main(String[] args) throws Exception {
        AsterixConf conf = new AsterixConf("http://127.0.0.1:19002");
        AsterixConn conn = new AsterixConn();
        conf.setDataverse("PersonicleServer");
        String indexnlQuery = "\nSELECT f.foodname as fn, count(*) as counter" + "\nFROM users u, FoodLog f"
                + "\nWHERE u.userName = \"匡书鹏\"" + "\nAND u.userId /*+ indexnl */ = f.userId"
                + "\ngroup by f.foodname\n" + "order by counter desc;";
        conf.setBody(indexnlQuery);
        System.out.println(conf.getBasicUrl());
        System.out.println(conf.getUrl(AsterixConf.OpType.QUERY));
        System.out.println(conf.getQuery());
        String ret = conn.handleRequest(conf, AsterixConf.OpType.QUERY);
        System.out.println(ret);
    }
}
