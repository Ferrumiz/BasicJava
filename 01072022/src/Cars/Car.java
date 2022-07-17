package Cars;

public class Car {
    private String name;
    private int speed;
    private int weight;
    private int passengers;
    private int consumption;

    //3.Создать в классе Car так называемый “конструктор копирования” и создать еще два дополнительных
    //объекта используя этот конструктор на основании уже созданных объектов. Добавить их в массив.
    public Car(Car oldCar) {
        this.name = oldCar.getName();
        this.speed = oldCar.getSpeed();
        this.weight = oldCar.getWeight();
        this.passengers = oldCar.getPassengers();
        this.consumption =oldCar.getConsumption();
    }

    public Car(String name, int speed, int weight, int passengers, int consumption) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.passengers = passengers;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
            return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed below 0");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight below 0");
        }
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if(passengers > 0) {
            this.passengers = passengers;
        } else {
            System.out.println("Passengers below 0");
        }
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        if(consumption > 0) {
            this.consumption = consumption;
        } else {
            System.out.println("Consumption below 0");
        }
    }

    public String carSet(String name) {
        return this.name + " goes with common accessories";
    }
}
