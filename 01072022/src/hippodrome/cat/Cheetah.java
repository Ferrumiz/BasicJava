package hippodrome.cat;

import hippodrome.Raceable;

public class Cheetah extends Cat implements Raceable {

    @Override
    public void setPosition(int сheetahPosition) {
        startPosition = сheetahPosition;
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
        System.out.println("Сheetah won");
    }
}
