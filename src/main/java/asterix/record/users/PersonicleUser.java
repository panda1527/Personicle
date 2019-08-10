package asterix.record.users;

import asterix.recordV1.Address;
import asterix.recordV1.EmailDetail;
import asterix.recordV1.PhoneDetail;
import com.alibaba.fastjson.JSONObject;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class PersonicleUser {
    private UUID userId;
    private String userName;
    private LocalDate dateOfBirth;
    private List<Address> addresses;
    private List<PhoneDetail> phones;
    private List<EmailDetail> emails;
    private Map<String, String> character;

    public PersonicleUser() {
    }

    public PersonicleUser(UUID uuid, String userName) {
        this.userId = uuid;
        this.userName = userName;
    }

    public PersonicleUser(String userName) {
        this.userId = UUID.randomUUID();
        this.userName = userName;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
        if (userId == null)
            userId = UUID.randomUUID();
        return JSONObject.toJSONString(this);
    }
}
