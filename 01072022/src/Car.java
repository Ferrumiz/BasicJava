public class Car {
    private String name;
    private int speed, weight, passengers;
    private int consumption;

    public Car(String name, int speed, int weight, int passengers, int consumption) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.passengers = passengers;
        this.consumption = consumption;
    }

    /*public Car() {
    }
    Car Destroyer = new Car(Spacetruck);
    Car Icecreamvan = new Car(Rockercar);*/
    // Создать в классе Car так называемый "конструктор копирования" и создать еще
    // два дополнительных объекта используя этот конструктор на основании уже созданных объектов.<= Не разобрался

    public String getName() {
        return name;
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

}
