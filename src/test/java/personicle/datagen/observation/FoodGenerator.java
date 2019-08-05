package personicle.datagen.observation;

import asterix.record.food.Food;
import asterix.record.food.FoodLog;
import asterix.record.Users;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.*;

public class FoodGenerator {
    private static final int gran = 100;

    private static final double minY = 30.0;

    private static final double maxY = 31.0;

    private static final double minX = 117;

    private static final double maxX = 118;

    private static Random randompos = new Random();

    private static Random randomnum = new Random();

    private static List<String> genFoods() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./resources/food_samples/raw.dat"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("./food.adm"));

        String line;
        Set<String> lfoods = new HashSet<>();
        while ((line = br.readLine()) != null) {
            String[] fields = line.split(" ");
            lfoods.add(fields[3]);
        }
        br.close();
        List<String> foods = new ArrayList<>();
        for (String food : lfoods) {
            foods.add(food);
            Food fent = new Food();
            fent.setFoodname(food);
            fent.setCalories(randompos.nextDouble() * 500);
            fent.setCarbohydrate(randomnum.nextInt(200));
            fent.setFat(randomnum.nextInt(180));
            fent.setProtein(randomnum.nextInt(120));
            bw.write(fent.toJSONString() + "\n");
        }
        bw.close();
        return foods;
    }

    public static void main(String[] args) throws IOException {
        List<Users> users = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("./pseudo_users.adm"));
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            Users user = JSONObject.parseObject(line, Users.class);
            if (count++ < 100) {
                System.out.println(user.toJSONString());
            }
            users.add(user);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("./foodlog.adm"));
        List<String> foodNames = genFoods();
        for (Users user : users) {
            long begintick = randomnum.nextInt(user.hashCode());
            double minx = minX + randompos.nextDouble() * 0.5;
            double maxx = minx + randompos.nextDouble() * 0.25;
            double miny = minY + randompos.nextDouble() * 0.5;
            double maxy = miny + randompos.nextDouble() * 0.25;
            double delx = (maxx - minx) / gran;
            double dely = (maxy - miny) / gran;
            for (int i = 0; i < gran; i++) {
                FoodLog log = new FoodLog();
                log.setUserId(user.getUserId().toString());
                log.setUserName(user.getUserName());
                log.setTimestamp(begintick + i);
                log.setFoodname(foodNames.get(randomnum.nextInt(foodNames.size())));
                log.setTotal_calories(randompos.nextDouble() * 500);
                log.setWeight(randomnum.nextInt(400));
                log.setComments(log.getFoodname() + " eaten by " + log.getUserName());
                double x = minx + i * delx;
                double y = miny + i * dely;
                log.setLatitude(x);
                log.setLongitude(y);
                log.setPreference_star(randomnum.nextInt(4) + 1);
                //System.out.println(log.toJSONString());
                bw.write(log.toJSONString() + "\n");

            }
        }
        bw.close();
    }
}
