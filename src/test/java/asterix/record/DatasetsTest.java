package asterix.record;

public class DatasetsTest {
    public static void main(String[] args) {
        Users user = new Users("张三");
        System.out.println(user.toJSONString());

        Events events = new Events("心跳异常");
        System.out.println(events.toJSONString());

        DataSources dataSources = new DataSources("心跳异常");
        System.out.println(dataSources.toJSONString());

        Observations observations = new Observations("张三的新浪微博", dataSources.getId());
        System.out.println(observations.toJSONString());
    }
}
