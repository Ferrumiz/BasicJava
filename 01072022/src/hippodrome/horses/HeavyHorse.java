package hippodrome.horses;


import hippodrome.Raceable;

public class HeavyHorse extends Horse implements Raceable {

    public HeavyHorse(int age, double speed) {
        super(age, speed);
    }

    @Override
    public void setPosition(int bobcatPosition) {
        this.startPosition = bobcatPosition;
    }

    @Override
    public void printInformation() {
        System.out.println("HeavyHorse won");
    }
}



