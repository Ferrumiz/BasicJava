package hippodrome.cat;


public class Puma extends Cat {

    public Puma(int age, double speed) {
        super(age, speed);
    }

    @Override
    public void setPosition(int bobcatPosition) {
        this.startPosition = bobcatPosition;
    }


    @Override
    public void printInformation() {
        System.out.println("Puma won");
    }
}
