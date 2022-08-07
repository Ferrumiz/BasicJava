package ippodrome;

public class WingedHorse extends Horse implements Raceable {

    @Override
    public void setPosition(int wingedHorsePosition) {
        startPosition = wingedHorsePosition;
    }

    @Override
    public void step() {

    }

    @Override
    public boolean isFinished(int length) {
        return false;
    }

    @Override
    public void printInformation() {

    }
}
