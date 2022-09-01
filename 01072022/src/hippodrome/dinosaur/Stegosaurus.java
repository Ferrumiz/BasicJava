package hippodrome.dinosaur;



public class Stegosaurus extends Dinosaur  {

    public Stegosaurus(int age, double speed) {
        super(age, speed);
    }

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
    public void printInformation() {
        System.out.println("Stegosaurus won");
    }
}

