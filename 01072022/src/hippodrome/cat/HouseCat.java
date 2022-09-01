package hippodrome.cat;


public class HouseCat extends Cat {

    public HouseCat(int age, double speed) {
        super(age, speed);
    }


    @Override
    public void setPosition(int bobcatPosition) {
        this.startPosition = bobcatPosition;
    }


    @Override
    public void printInformation() {
        System.out.println("House Cat won");
    }
}
