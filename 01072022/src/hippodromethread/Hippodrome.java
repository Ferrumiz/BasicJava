package hippodromethread;

import java.util.*;
import java.util.stream.Collectors;

public class Hippodrome {

    public static void main(String[] args) {
        Hippodrome hippodrome = new Hippodrome();

        List<Participant> participants = new ArrayList<>();
        participants.add(new Pony(10));
        participants.add(new Puma(15));
        participants.add(new Pony(5));

        int length = 1000;

        //Start race
        new Thread(new Circle(length, participants)).start();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Map<Long, Participant> collected = participants.stream()
                .sorted(Comparator.comparing(Participant::getDeltaTime))
                .collect(Collectors.toMap(participant -> participant.getDeltaTime(), participant -> participant, (oldValue, newValue) -> oldValue, TreeMap::new));

        List<Participant> participants1 = new ArrayList<Participant>(map.values());

        List<Participant> participants1 = new ArrayList<>();
        participants1.forEach(participant -> participants1.add(collected.get()));
    }

}
