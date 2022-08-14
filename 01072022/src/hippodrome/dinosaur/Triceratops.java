package hippodrome.dinosaur;

import hippodrome.Raceable;

public class Triceratops extends Dinosaur implements Raceable {

    protected int age = 120;
    protected double speed = 100;

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
        System.out.println("Triceratops won");
    }
}