package hippodrome.spider;

import hippodrome.Raceable;

public class HuntsmanSpider extends Spider implements Raceable {

    @Override
    public void setPosition(int huntsmanSpiderPosition) {
        startPosition = huntsmanSpiderPosition;
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
        System.out.println("HuntsmanSpider won");
    }
}
