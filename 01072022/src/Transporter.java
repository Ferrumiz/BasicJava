public class Transporter extends Car{

    private String[] ListOfThings = {"Flashlight", "Mirror", "Hammer", "Radio"};
    private int fuel;

    public Transporter(String name, int speed, int weight, int passengers, int consumption){
        super(name, speed, weight, passengers, consumption);
    }
}
