package hippodrome.spider;


public class HuntsmanSpider extends Spider {

    public HuntsmanSpider(int age, double speed) {
        super(age, speed);
    }

    @Override
    public void setPosition(int bobcatPosition) {
        this.startPosition = bobcatPosition;
    }


    @Override
    public void printInformation() {
        System.out.println("Huntsman Spider won");
    }
}
