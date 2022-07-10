public class CarsStats {
    public static void main(String[] args) {

        Car Bus = new Car("Bus", 100, 16000, 30, 30);
        String busName = Bus.getName();
        int busSpeed = Bus.getSpeed();
        int busWeight = Bus.getWeight();
        int busPassengers = Bus.getPassengers();
        int busConsumption = Bus.getConsumption();

        Car Rockercar = new Car("Rockercar", 150, 3000, 8, 18);
        String rockercarName = Rockercar.getName();
        int rockercarSpeed = Rockercar.getSpeed();
        int rockercarWeight = Rockercar.getWeight();
        int rockercarPassengers = Rockercar.getPassengers();
        int rockercarConsumption = Rockercar.getConsumption();

        Car Sportcar = new Car("Sportcar", 300, 900, 2, 20);
        String sportcarName = Sportcar.getName();
        int sportcarSpeed = Sportcar.getSpeed();
        int sportcarWeight = Sportcar.getWeight();
        int sportcarPassengers = Sportcar.getPassengers();
        int sportcarConsumption = Sportcar.getConsumption();
        Sportcar.setSpeed(-100);

        Car Hovercar = new Car("Hovercar", 800, 600, 4, 25);
        String hovercarName = Hovercar.getName();
        int hovercarSpeed = Hovercar.getSpeed();
        int hovercarWeight = Hovercar.getWeight();
        int hovercarPassengers = Hovercar.getPassengers();
        int hovercarConsumption = Hovercar.getConsumption();

        Car Spacetruck = new Car("Spacetruck", 120000, 800000, 8, 1);
        String spacetruckName = Spacetruck.getName();
        int spacetruckSpeed = Spacetruck.getSpeed();
        int spacetruckWeight = Spacetruck.getWeight();
        int spacetruckPassengers = Spacetruck.getPassengers();
        int spacetruckConsumption = Spacetruck.getConsumption();

        Car[] ListOfCars = {Rockercar, Sportcar, Hovercar, Spacetruck, Bus};

        for (Car num : ListOfCars) {
            System.out.print(num.getName() + "'s specs:");
            System.out.println();
            System.out.print(" speed:       " + num.getSpeed() + " km/h");
            System.out.println();
            System.out.print(" weight:      " + num.getWeight() + " kgs.");
            System.out.println();
            System.out.print(" passengers:  " + num.getPassengers() + " pers.");
            System.out.println();
            System.out.print(" consumption: " + num.getConsumption() + " l/100 km.");
            System.out.println();
            System.out.println();
        }

        }
    }

