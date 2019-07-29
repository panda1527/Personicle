package asterix.record;

import com.alibaba.fastjson.JSONObject;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatasetsTest {
    public static void main(String[] args) {
        {
            Users user = new Users("张三");
            List<Address> addresses = new ArrayList<>();

            Address address = new Address();
            address.setState("湖北");
            address.setCity("武汉");
            address.setPostalCode("430072");
            address.setAddress("珞瑜路129号");
            addresses.add(address);

            address = new Address();
            address.setState("湖北");
            address.setCity("武汉");
            address.setPostalCode("430074");
            address.setAddress("珞瑜路1037号");
            addresses.add(address);

            user.setAddresses(addresses);

            List<PhoneDetail> phones = new ArrayList<>();
            PhoneDetail phone = new PhoneDetail();
            phone.setCatetory("联通");
            phone.setPhone("18986211330");
            phones.add(phone);

            user.setPhones(phones);

            List<EmailDetail> emails = new ArrayList<>();
            EmailDetail email = new EmailDetail();
            email.setCategory("校园邮箱");
            email.setEmail("hello@hust.edu.cn");
            emails.add(email);

            user.setEmails(emails);

            Map<String, String> character = new HashMap<>();
            character.put("国家", "中国");
            user.setCharacter(character);

            System.out.println(user.toJSONString());

            Users user1 = JSONObject.parseObject(user.toJSONString(), Users.class);
            System.out.println(user1.toJSONString());
        }

        Events events = new Events("心跳异常");
        System.out.println(events.toJSONString());

        DataSources dataSources = new DataSources("心跳异常");
        System.out.println(dataSources.toJSONString());

        Observations observations = new Observations("张三的新浪微博", dataSources.getId());
        System.out.println(observations.toJSONString());
    }
}
