package hippodrome.horses;

import hippodrome.Raceable;

public abstract class Horse implements Raceable {

    protected double age;

    protected double speed;

    protected int startPosition;

    protected double currentPosition;

    protected double distanceTraveled;

    public Horse(double age, double speed) {
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
