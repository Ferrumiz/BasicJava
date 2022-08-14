package hippodrome.cat;

import hippodrome.Raceable;

public class Bobcat extends Cat implements Raceable {

    protected int age = 5;
    protected double speed = 35;

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
        System.out.println("Bobcat won");
    }
}
