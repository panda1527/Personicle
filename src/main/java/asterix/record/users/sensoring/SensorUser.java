package asterix.record.users.sensoring;

import asterix.record.users.PersonicleUser;
import com.alibaba.fastjson.JSONObject;

public class SensorUser extends PersonicleUser {
    private String password; //password: string,
    private String phonenumber; //phonenumber: string, common-used phone number.
    private int age; //age: int,
    private int gender; //gender: int

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
