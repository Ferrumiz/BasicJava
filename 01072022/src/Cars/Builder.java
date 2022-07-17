package Cars;

public class Builder extends Car {

    private String instruments;
    private int fuel;

    public Builder(String name, String instruments, int speed, int weight, int passengers, int consumption){
        super(name, speed, weight, passengers, consumption);
        this.instruments = instruments;
    }

    public String getInstruments() {
        return instruments;
    }

    @Override
    public String carSet(String name) {
        return getName() + " goes with: " + getInstruments();
    }

    @Override
    public String toString() {
        return  getName() + "'s stats:" +
                " speed=" + getSpeed() +
                ", weight=" + getWeight() +
                ", passengers=" + getPassengers() +
                ", consumption=" + getConsumption();
    }
}
