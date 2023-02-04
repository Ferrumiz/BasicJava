package hippodromethread;

import java.util.List;

public class Circle implements Runnable{

    public static volatile boolean isNeedStop = false;

    private int length;

    List<Participant> participants;

    public Circle(int length, List<Participant> participants) {
        this.length = length;
        this.participants = participants;
    }

    @Override
    public void run() {
        participants.forEach(participant -> participant.setFinishPosition(length));
        for (Participant participant : participants) {
            new Thread((Runnable) participant).start();
        }
    }
}
