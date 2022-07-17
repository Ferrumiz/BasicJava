package Cars;

import java.util.Arrays;

public class Transporter extends Car {

    private String[] listOfThings = {"Flashlight", "Mirror", "Hammer", "Radio"};
    private int fuel;

    public Transporter(String name, int speed, int weight, int passengers, int consumption){
        super(name, speed, weight, passengers, consumption);
    }

    @Override
    public String carSet(String name) {
        return
        getName() + " goes with: " + Arrays.toString(listOfThings);
    }

    public String toString() {
        return  getName() + "'s stats:" +
                " speed=" + getSpeed() +
                ", weight=" + getWeight() +
                ", passengers=" + getPassengers() +
                ", consumption=" + getConsumption();
    }

}
