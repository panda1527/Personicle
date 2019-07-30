package asterix.config;

import java.nio.file.Files;
import java.nio.file.Paths;

public class AsterixConfTest {

    public static void main(String[] args) throws Exception {
        {
            AsterixConf conf = new AsterixConf("http://127.0.0.1:19002/");
            String sql = new String(Files.readAllBytes(Paths.get("./resources/personicle-schema.sqlpp")));
            System.out.println(sql);
            conf.setBody(sql);
        }
        {
            AsterixConf conf = new AsterixConf("http://127.0.0.1:19002/");
            AsterixConn conn = new AsterixConn();
            conf.setDataverse("Personicle");
            String simpleQuery = "\n for $d in dataset users\n return $d;";
            conf.setBody(simpleQuery);
            String ret = conn.handleRequest(conf, AsterixConf.OpType.QUERY);
            System.out.print(ret);
        }
    }
}