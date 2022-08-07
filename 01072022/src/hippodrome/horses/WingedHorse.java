package hippodrome.horses;

import hippodrome.Raceable;

public class WingedHorse extends Horse implements Raceable {

    @Override
    public void setPosition(int wingedHorsePosition) {
        startPosition = wingedHorsePosition;
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
        System.out.println("WingedHorse won");
    }
}
