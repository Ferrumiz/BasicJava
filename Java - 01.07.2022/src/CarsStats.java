public class CarsStats {
    public static void main(String[] args) {

        Car Bus = new Car();
        Bus.speed = 100;
        Bus.weight = 8000;
        Bus.passengers = 30;
        Bus.consumption = 25;

        Car RockerCar = new Car();
        RockerCar.speed = 150;
        RockerCar.weight = 3000;
        RockerCar.passengers = 8;
        RockerCar.consumption = 18;

        Car SportCar = new Car();
        SportCar.speed = 300;
        SportCar.weight = 950;
        SportCar.passengers = 2;
        SportCar.consumption = 20;

        Car HoverCar = new Car();
        HoverCar.speed = 800;
        HoverCar.weight = 500;
        HoverCar.passengers = 2;
        HoverCar.consumption = 23;

        Car SpaceTruck = new Car();
        SpaceTruck.speed = 100000;
        SpaceTruck.weight = 80000;
        SpaceTruck.passengers = 8;
        SpaceTruck.consumption = 1200;

        Car[] ListOfCars = {Bus, RockerCar, SportCar, HoverCar, SpaceTruck};

        for (Car num : ListOfCars) {
            System.out.print(" " + num);
        }
    }
}
