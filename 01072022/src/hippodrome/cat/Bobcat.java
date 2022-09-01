package hippodrome.cat;


public class Bobcat extends Cat {

    public Bobcat(int age, double speed) {
        super(age, speed);
    }

    @Override
    public void setPosition(int bobcatPosition) {
        this.startPosition = bobcatPosition;
    }


    @Override
    public void printInformation() {
        System.out.println("Bobcat won");
    }
}
