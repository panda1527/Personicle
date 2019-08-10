package personicle.datagen.observation.Food;

import asterix.recordV1.Address;
import asterix.recordV1.EmailDetail;
import asterix.recordV1.PhoneDetail;
import asterix.recordV1.Users;
import asterix.recordV1.food.Food;
import asterix.recordV1.food.FoodLog;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.*;

public class FoodLogFlatten {
    private static void flattenFood() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("e:/Food.adm"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:/Food.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String wline = "";
            Food food = JSONObject.parseObject(line, Food.class);
            wline += food.getFoodname();
            wline += "|";
            wline += food.getCalories();
            wline += "|";
            wline += food.getCarbohydrate();
            wline += "|";
            wline += food.getFat();
            wline += "|";
            wline += food.getProtein();
            wline += "|";
            wline += "\n";
            bw.write(wline);
        }
        br.close();
        bw.close();
    }

    private static void flattenUsers() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("e:/pseudo_users.adm"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:/pseudo_users.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String wline = "";
            Users user = JSONObject.parseObject(line, Users.class);
            wline += user.getUserId();
            wline += "|";
            wline += user.getUserName();
            wline += "|";
            List<Address> addresses = user.getAddresses();
            wline += JSONArray.toJSONString(addresses);
            wline += "|";
            List<PhoneDetail> pones = user.getPhones();
            wline += JSONArray.toJSONString(pones);
            wline += "|";
            List<EmailDetail> emails = user.getEmails();
            wline += JSONArray.toJSONString(emails);
            wline += "|";
            wline += JSON.toJSONString(user.getCharacter());
            wline += "|";
            wline += "\n";
            bw.write(wline);
        }
        br.close();
        bw.close();
    }

    private static void flattenFoodLog(BufferedWriter bw, String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            String wline = "";
            FoodLog foodlog = JSONObject.parseObject(line, FoodLog.class);
            wline += foodlog.getUserId();
            wline += "|";
            wline += foodlog.getTimestamp();
            wline += "|";
            wline += foodlog.getUserName();
            wline += "|";
            wline += foodlog.getFoodname();
            wline += "|";
            wline += foodlog.getLatitude();
            wline += "|";
            wline += foodlog.getLongitude();
            wline += "|";
            wline += foodlog.getTotal_calories();
            wline += "|";
            wline += foodlog.getWeight();
            wline += "|";
            wline += foodlog.getPreference_star();
            wline += "|";
            wline += foodlog.getComments();
            wline += "|";
            wline += "\n";
            bw.write(wline);
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        flattenFood();
        flattenUsers();
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:/FoodLog.txt"));
        for (char c = 'a'; c <= 'j'; c++) {
            flattenFoodLog(bw, "e:/xa" + c);
        }
        bw.close();
    }
}
