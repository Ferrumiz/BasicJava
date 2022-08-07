package ippodrome;

public class Pony extends Horse implements Raceable{
    @Override
    public void setPosition(int ponyPosition) {
        startPosition = ponyPosition;
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
