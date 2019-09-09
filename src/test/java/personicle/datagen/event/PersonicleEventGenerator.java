package personicle.datagen.event;

import java.util.UUID;

import asterix.recordV2.events.PersonicleEvent;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.*;

public class PersonicleEventGenerator {
    private static final int eventCount = 10000000;

    private static final int userCount = 1000000;

    private static final int subEventPer = 10;

    private static final int informationCount = 10000000;

    private static final int informationPerEvent = 5;

    private static Random rand = new Random();

    public static void main(String[] args) throws IOException {
        List<UUID> users = new ArrayList<>();
        for (int i = 0; i < userCount; i++) {
            users.add(UUID.randomUUID());
        }

        for (int i = 0; i < eventCount; i++) {
            PersonicleEvent event = new PersonicleEvent();
        }

        BufferedReader bw = new BufferedReader(new FileReader("./events.adm"));
        bw.close();
    }
}
