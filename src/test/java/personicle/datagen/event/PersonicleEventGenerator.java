package personicle.datagen.event;

import java.time.LocalDateTime;
import java.util.UUID;

import asterix.recordV2.events.PersonicleEvent;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.*;

public class PersonicleEventGenerator {
    private static final int eventCount = 1000;//0000;

    private static final int userCount = 100;//0000;

    private static final int subEventPer = 10;

    private static final int informationCount = 100;//00000;

    private static final int informationPerEvent = 5;

    private static final int gran = eventCount / userCount;

    private static final double minY = 30.0;

    private static final double maxY = 31.0;

    private static final double minX = 117;

    private static final double maxX = 118;

    private static Random rand = new Random();

    private static Random randomnum = new Random();

    private static LocalDateTime baseTime = LocalDateTime.of(2011, 01, 01, 0, 0, 0, 0);

    public static void main(String[] args) throws IOException {
        List<UUID> userSet = new ArrayList<>();
        for (int i = 0; i < userCount; i++) {
            userSet.add(UUID.randomUUID());
        }
        List<UUID> infoSet = new ArrayList<>();
        for (int i = 0; i < informationCount; i++) {
            infoSet.add(UUID.randomUUID());
        }

        for (UUID user : userSet) {
            double minx = minX + rand.nextDouble() * 0.5;
            double maxx = minx + rand.nextDouble() * 0.25;
            double miny = minY + rand.nextDouble() * 0.5;
            double maxy = miny + rand.nextDouble() * 0.25;
            double delx = (maxx - minx) / gran;
            double dely = (maxy - miny) / gran;
            LocalDateTime begin = baseTime.plusMinutes(rand.nextInt(8 * 365 * 24 * 60 * 60));
            for (int i = 0; i < gran; i++) {
                PersonicleEvent event = new PersonicleEvent();
                double x = minx + i * delx;
                double y = miny + i * dely;
                event.setEventId(UUID.randomUUID());
                event.setUserId(user);
                begin.plusSeconds(10);
                event.setBeginAt(begin);
                event.setEndAt(begin.plusSeconds(10));
                event.setLocation(event.new Point(x, y));
                System.out.println(event.toJSONString());
            }
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("./events.adm"));
        bw.close();
    }
}
