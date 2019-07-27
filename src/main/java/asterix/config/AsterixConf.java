package asterix.config;

/**
 * @author michael
 */
public class AsterixConf {
    private String basic_url = "http://127.0.0.1:19002";

    public String getBasicUrl() {
        return basic_url;
    }

    private String beforeDataverse = "";
    private String dataverse = "";
    protected String body = "";
    private String tailer = "";

    public enum OpType {
        QUERY, UPDATE, INSERT, DELETE, LOAD, DDL, RESULT, STATUS
    }

    public AsterixConf(String my_url) {
        this.basic_url = my_url;
    }

    /**
     * default url:127.0.0.1:19002
     */
    public AsterixConf() {
    }

    /**
     * for example: drop dataset tweets if exists;
     *
     * @param beforeDataverse
     */
    public AsterixConf setBeforeDataverse(String beforeDataverse) {
        this.beforeDataverse = beforeDataverse;
        return this;
    }

    public String getBeforeDataverse() {
        return this.beforeDataverse;
    }

    /**
     * set dataverse
     *
     * @param dataverse
     */
    public AsterixConf setDataverse(String dataverse) {
        this.dataverse = "use dataverse " + dataverse + ";";
        return this;
    }

    public String getDataverse() {
        return this.dataverse;
    }

    public AsterixConf setBody(String body) {
        this.body = body;
        return this;
    }

    public String getBody() {
        return this.body;
    }

    public AsterixConf setTail(String tailer) {
        this.tailer = tailer;
        return this;
    }

    public String getTail() {
        return this.tailer;
    }

    public String getQuery() throws Exception {
        if (!"".equals(this.body) && "".equals(this.dataverse))
            return "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.beforeDataverse);
        sb.append(this.dataverse);
        sb.append(this.body);
        sb.append(this.tailer);
        return sb.toString();
    }

    /**
     * get url
     *
     * @param type
     * @return
     */
    public String getUrl(OpType type) {
        switch (type) {
            case QUERY:
                return basic_url + "/query";
            case INSERT:
            case DELETE:
            case UPDATE:
                return basic_url + "/update";
            case DDL:
                return basic_url + "/ddl";
            case RESULT:
                return basic_url + "/query/result";
            case STATUS:
            default:
                return null;
        }
    }
}
