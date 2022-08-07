package ippodrome;

public class HeavyHorse extends Horse implements Raceable{
    @Override
    public void setPosition(int heavyHorsePosition) {
        startPosition = heavyHorsePosition;
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
