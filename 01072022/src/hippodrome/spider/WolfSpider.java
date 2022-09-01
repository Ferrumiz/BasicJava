package hippodrome.spider;

public class WolfSpider extends Spider {

    public WolfSpider(int age, double speed) {
        super(age, speed);
    }

    @Override
    public void setPosition(int bobcatPosition) {
        this.startPosition = bobcatPosition;
    }


    @Override
    public void printInformation() {
        System.out.println("Wolf Spider won");
    }
}
