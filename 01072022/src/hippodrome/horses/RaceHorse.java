package hippodrome.horses;

import hippodrome.Raceable;

public class RaceHorse extends Horse implements Raceable {

    @Override
    public void setPosition(int raceHorsePosition) {
        startPosition = raceHorsePosition;
    }

    @Override
    public double step() {

        return 0;
    }

    @Override
    public boolean isFinished(int length) {
        return false;
    }

    @Override
    public void printInformation() {
        System.out.println("RaceHorse won");
    }
}
