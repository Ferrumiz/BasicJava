package hippodrome.spider;

import hippodrome.Raceable;

public class WolfSpider extends Spider implements Raceable {

    @Override
    public void setPosition(int wolfSpiderPosition) {
        startPosition = wolfSpiderPosition;
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
        System.out.println("WolfSpider won");
    }
}
