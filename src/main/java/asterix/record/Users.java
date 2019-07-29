package asterix.record;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.alibaba.fastjson.JSONObject;

public class Users {
    private final UUID id;
    private String name;
    private List<Address> addresses;
    private List<PhoneDetail> phones;
    private List<EmailDetail> emails;
    private Map<String, String> character;

    public Users() {
        this.id = UUID.randomUUID();
    }

    public Users(UUID uuid, String name) {
        this.id = uuid;
        this.name = name;
    }

    public Users(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return this.addresses;
    }

    public List<PhoneDetail> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneDetail> phones) {
        this.phones = phones;
    }

    public List<EmailDetail> getEmails() {
        return emails;
    }

    public void setEmails(List<EmailDetail> emails) {
        this.emails = emails;
    }

    public Map<String, String> getCharacter() {
        return character;
    }

    public void setCharacter(Map<String, String> character) {
        this.character = character;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
