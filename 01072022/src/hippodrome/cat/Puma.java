package hippodrome.cat;

import hippodrome.Raceable;

public class Puma extends Cat implements Raceable {

    @Override
    public void setPosition(int pumaPosition) {
        startPosition = pumaPosition;
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
        System.out.println("Puma won");
    }
}
