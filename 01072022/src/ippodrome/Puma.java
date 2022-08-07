package ippodrome;

public class Puma extends Cat implements Raceable{

    @Override
    public void setPosition(int pumaPosition) {
        startPosition = pumaPosition;
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
