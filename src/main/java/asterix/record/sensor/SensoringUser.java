package asterix.record.sensor;

import com.alibaba.fastjson.JSONObject;

public class SensoringUser {
    private String userId; //userId: string, --guarantee identification in application, e.g., UUID
    private String userName; //userName: string?,
    private String password; //password: string,
    private String phonenumber; //phonenumber: string,
    private int age; //age: int,
    private int gender; //gender: int

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

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
