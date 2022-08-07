package hippodrome.dinosaur;

import hippodrome.Raceable;

public class Stegosaurus extends Dinosaur implements Raceable {
    @Override
    public void setPosition(int stegosaurusPosition) {
        startPosition=stegosaurusPosition;
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
        System.out.println("Stegosaurus won");
    }
}
