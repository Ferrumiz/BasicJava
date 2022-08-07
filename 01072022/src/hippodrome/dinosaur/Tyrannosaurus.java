package hippodrome.dinosaur;

import hippodrome.Raceable;

public class Tyrannosaurus extends Dinosaur implements Raceable {

    @Override
    public void setPosition(int tyrannosaurusPosition) {
        startPosition=tyrannosaurusPosition;
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
        System.out.println("Tyrannosaurus won");
    }
}
