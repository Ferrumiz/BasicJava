package hippodrome.spider;



public class HouseSpider extends Spider {

    public HouseSpider(int age, double speed) {
        super(age, speed);
    }

    @Override
    public void setPosition(int bobcatPosition) {
        this.startPosition = bobcatPosition;
    }


    @Override
    public void printInformation() {
        System.out.println("House Spider won");
    }
}
