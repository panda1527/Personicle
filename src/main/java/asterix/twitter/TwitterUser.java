package asterix.twitter;

import com.alibaba.fastjson.JSONObject;

import java.time.LocalDateTime;

public class TwitterUser {
    private long id; //id: int64,
    private String name; //name: string,
    private String stream_name; //screen_name : string,
    private String profile_image_url; //profile_image_url : string,
    private String lang; //lang : string,
    private String location; //location: string,
    private LocalDateTime create_at; //create_at: date,
    private String description; //description: string,
    private int follower_count; //followers_count: int32,
    private int friends_count; //friends_count: int32,
    private long statues_counts; //statues_count: int64

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream_name() {
        return stream_name;
    }

    public void setStream_name(String stream_name) {
        this.stream_name = stream_name;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFollower_count() {
        return follower_count;
    }

    public void setFollower_count(int follower_count) {
        this.follower_count = follower_count;
    }

    public int getFriends_count() {
        return friends_count;
    }

    public void setFriends_count(int friends_count) {
        this.friends_count = friends_count;
    }

    public long getStatues_counts() {
        return statues_counts;
    }

    public void setStatues_counts(long statues_counts) {
        this.statues_counts = statues_counts;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
