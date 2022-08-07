package hippodrome.cat;

import hippodrome.Raceable;

public class Bobcat extends Cat implements Raceable {

    @Override
    public void setPosition(int bobcatPosition) {
        this.startPosition = bobcatPosition;
    }

    @Override
    public double step() {
        this.age = 5;
        this.speed = 35;
        this.currentPosition = this.startPosition + this.speed * this.age / 10;
        this.distanceTraveled = this.currentPosition + 1;
        return this.distanceTraveled;
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
