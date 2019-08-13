package asterix.config;

import java.nio.file.Files;
import java.nio.file.Paths;

public class PersonicleLoader {

    public static void main(String[] args) throws Exception {
        {
            String sql = new String(Files.readAllBytes(Paths.get("./resources/personicle-server-loader.sqlpp")));
            AsterixConf conf = new AsterixConf("http://127.0.0.1:19002");
            AsterixConn conn = new AsterixConn();
            conf.setDataverse("Metadata");
            conf.setBody(sql);
            System.out.println(conf.getBasicUrl());
            System.out.println(conf.getUrl(AsterixConf.OpType.QUERY));
            System.out.println(conf.getQuery());
            String ret = conn.handleRequest(conf, AsterixConf.OpType.QUERY);
            System.out.println(ret);
        }
    }
}
