package hippodrome.spider;

import hippodrome.Raceable;

public class BirdEater extends Spider implements Raceable {

    @Override
    public void setPosition(int birdEaterPosition) {
        startPosition = birdEaterPosition;
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
        System.out.println("BirdEater won");
    }
}
