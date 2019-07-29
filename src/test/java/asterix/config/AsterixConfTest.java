package asterix.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AsterixConfTest {

    public static void main(String[] args) throws IOException {
        AsterixConf conf = new AsterixConf("http://127.0.0.1:19002/");
        String sql = new String(Files.readAllBytes(Paths.get("./resources/personicle-schema.sqlpp")));
        System.out.println(sql);
        conf.setBody(sql);
    }
}