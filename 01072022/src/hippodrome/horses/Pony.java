package hippodrome.horses;

import hippodrome.Raceable;

public class Pony extends Horse implements Raceable {
    @Override
    public void setPosition(int ponyPosition) {
        startPosition = ponyPosition;
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
        System.out.println("Pony won");
    }
}
