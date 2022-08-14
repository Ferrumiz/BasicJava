package hippodrome.dinosaur;

import hippodrome.Raceable;

public class Tyrannosaurus extends Dinosaur implements Raceable {

    protected int age = 110;
    protected double speed = 53;

    @Override
    public double step() {
        this.currentPosition = this.startPosition + this.speed - this.age;
        this.distanceTraveled = this.currentPosition + this.distanceTraveled + this.speed;
        return this.distanceTraveled;
    }

    @Override
    public void setPosition(int bobcatPosition) {
        this.startPosition = bobcatPosition;
    }

    @Override
    public boolean isFinished(int length) {
        if (this.distanceTraveled < length) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void printInformation() {
        System.out.println("Tyrannosaurus won");
    }
}
