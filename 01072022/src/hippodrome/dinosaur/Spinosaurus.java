package hippodrome.dinosaur;

import hippodrome.Raceable;

public class Spinosaurus extends Dinosaur implements Raceable {
    @Override
    public void setPosition(int spinosaurusPosition) {
        startPosition=spinosaurusPosition;
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
        System.out.println("Spinosaurus won");
    }
}
