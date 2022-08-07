package hippodrome.dinosaur;

import hippodrome.Raceable;

public class Triceratops extends Dinosaur implements Raceable {
    @Override
    public void setPosition(int triceratopsPosition) {
        startPosition=triceratopsPosition;
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
        System.out.println("Triceratops won");
    }
}
