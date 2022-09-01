package hippodrome.cat;


public class Cheetah extends Cat {

    public Cheetah(int age, double speed) {
        super(age, speed);
    }

    @Override
    public void setPosition(int сheetahPosition) {
        startPosition = сheetahPosition;
    }


    @Override
    public void printInformation() {
        System.out.println("Сheetah won");
    }
}
