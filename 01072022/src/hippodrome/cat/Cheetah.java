package hippodrome.cat;

import hippodrome.Raceable;

public class Cheetah extends Cat implements Raceable {

    protected int age = 2;
    protected double speed = 95;

    @Override
    public double step() {
        this.currentPosition = this.startPosition + this.speed - this.age;
        this.distanceTraveled = this.currentPosition + this.distanceTraveled + this.speed;
        return this.distanceTraveled;
    }

    @Override
    public void setPosition(int сheetahPosition) {
        startPosition = сheetahPosition;
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
        System.out.println("Сheetah won");
    }
}
