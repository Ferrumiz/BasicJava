package hippodrome.spider;

import hippodrome.Raceable;

public class HouseSpider extends Spider implements Raceable {
    @Override
    public void setPosition(int houseSpiderPosition) {
        startPosition = houseSpiderPosition;
    }

    @Override
    public double step() {

        return 0;
    }

    @Override
    public boolean isFinished(int length) {
        return false;
    }

    @Override
    public void printInformation() {
        System.out.println("HouseSpider won");
    }
}
