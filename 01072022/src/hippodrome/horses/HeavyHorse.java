package hippodrome.horses;

import hippodrome.Raceable;

public class HeavyHorse extends Horse implements Raceable {
    @Override
    public void setPosition(int heavyHorsePosition) {
        startPosition = heavyHorsePosition;
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
        System.out.println("HeavyHorse won");
    }
}
