package asterix.twitter;

import java.time.LocalDateTime;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import org.apache.asterix.external.generator.DataGenerator;

public class Twitter {
    private LocalDateTime create_at; // create_at : datetime,
    private long id; //id: int64,
    private String text; //text: string,
    private long in_reply_to_status; //in_reply_to_status : int64,
    private long in_reply_to_user; //in_reply_to_user : int64,
    private long favorite_count; //favorite_count : int64,
    private DataGenerator.Point coordinate; //coordinate: point?,
    private long retweet_count; //retweet_count : int64,
    private String lang; //lang : string,
    private boolean is_retweet; //is_retweet: boolean,
    private List<List<String>> hashtags; //hashtags : {{ string }} ?,
    private List<List<Long>> user_mentions; //user_mentions : {{ int64 }} ? ,
    private TwitterUser user; //user : typeUser,
    private TwitterPlace place; //place : typePlace?,
    private GeoTag geo_tag; //geo_tag: typeGeoTag

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getIn_reply_to_status() {
        return in_reply_to_status;
    }

    public void setIn_reply_to_status(long in_reply_to_status) {
        this.in_reply_to_status = in_reply_to_status;
    }

    public long getIn_reply_to_user() {
        return in_reply_to_user;
    }

    public void setIn_reply_to_user(long in_reply_to_user) {
        this.in_reply_to_user = in_reply_to_user;
    }

    public long getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(long favorite_count) {
        this.favorite_count = favorite_count;
    }

    public DataGenerator.Point getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(DataGenerator.Point coordinate) {
        this.coordinate = coordinate;
    }

    public long getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(long retweet_count) {
        this.retweet_count = retweet_count;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean isIs_retweet() {
        return is_retweet;
    }

    public void setIs_retweet(boolean is_retweet) {
        this.is_retweet = is_retweet;
    }

    public List<List<String>> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<List<String>> hashtags) {
        this.hashtags = hashtags;
    }

    public List<List<Long>> getUser_mentions() {
        return user_mentions;
    }

    public void setUser_mentions(List<List<Long>> user_mentions) {
        this.user_mentions = user_mentions;
    }

    public TwitterUser getUser() {
        return user;
    }

    public void setUser(TwitterUser user) {
        this.user = user;
    }

    public TwitterPlace getPlace() {
        return place;
    }

    public void setPlace(TwitterPlace place) {
        this.place = place;
    }

    public GeoTag getGeo_tag() {
        return geo_tag;
    }

    public void setGeo_tag(GeoTag geo_tag) {
        this.geo_tag = geo_tag;
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }
}
