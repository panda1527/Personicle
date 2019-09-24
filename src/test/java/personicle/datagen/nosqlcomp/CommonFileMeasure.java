package personicle.datagen.nosqlcomp;

import asterix.recordV2.wrapper.DateTime;
import asterix.recordV2.wrapper.Uuid;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class CommonFileMeasure extends GeneralMeasurement{
    private String file_category;
    private String filepath;
    private String comments;


    public String getFile_category() {
        return file_category;
    }

    public void setFile_category(String file_category) {
        this.file_category = file_category;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
