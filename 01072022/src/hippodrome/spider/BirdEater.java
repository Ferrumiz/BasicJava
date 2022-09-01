package hippodrome.spider;



public class BirdEater extends Spider {

    public BirdEater(int age, double speed) {
        super(age, speed);
    }

    @Override
    public void setPosition(int bobcatPosition) {
        this.startPosition = bobcatPosition;
    }


    @Override
    public void printInformation() {
        System.out.println("Bird Eater won");
    }
}
