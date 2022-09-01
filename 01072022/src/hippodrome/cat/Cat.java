package hippodrome.cat;

import hippodrome.Raceable;

public abstract class Cat implements Raceable {

    protected int age;

    protected double speed;

    protected double startPosition;

    protected double currentPosition;

    protected double distanceTraveled;

    public Cat(int age, double speed) {
        this.age = age;
        this.speed = speed;
    }

    @Override
    public boolean isFinished(int length) {
        return !(this.distanceTraveled < length);
    }

    @Override
    public double step() {
        currentPosition = startPosition + speed - age;
        distanceTraveled = currentPosition + distanceTraveled + this.speed;
        return this.distanceTraveled;
    }

}
