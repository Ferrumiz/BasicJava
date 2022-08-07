package hippodrome.cat;

import hippodrome.Raceable;

public class HouseCat extends Cat implements Raceable {

    @Override
    public void setPosition(int houseCatPosition) {
        startPosition=houseCatPosition;
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
        System.out.println("HouseCat won");
    }
}
