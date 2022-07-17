package Cars;

public class CarsStats {
    public static void main(String[] args) {
        //3.Создать в классе Car так называемый “конструктор копирования” и создать еще два дополнительных
        //объекта используя этот конструктор на основании уже созданных объектов. Добавить их в массив.

        //Задаю параметры для экземпляра oldCar:
        Car oldCar = new Car("Oldcar", 90, 1500, 4, 17);
        //Создаю экземпляры на основе конструктора "oldCar":
        Car newCar = new Car(oldCar);

        Car newestCar = new Car(oldCar);

        Car JCB = new Builder("JCB","Hammer, Drill, Saw", 1, 1, 1, 1);

        Car Caravelle = new Transporter("Caravelle", 1,1,1,1);

        //Задаю параметры для остальных экземпляров:
        Car Bus = new Car("Bus", 100, 16000, 30, 30);

        Car Rockercar = new Car("Rockercar", 150, 3000, 8, 18);

        Car Sportcar = new Car("Sportcar", 300, 900, 2, 20);

        Car Hovercar = new Car("Hovercar", 800, 600, 4, 25);

        Car Spacetruck = new Car("Spacetruck", 120000, 800000, 8, 1);

        //Создаю массив объектов типа Car:
        Car[] listOfCars = {Rockercar, Sportcar, Hovercar, Spacetruck, Bus, oldCar, newCar, newestCar};
        //Создаю печатающий метод:
        //printCars(listOfCars);

        System.out.println(JCB.toString());
        System.out.println(JCB.carSet(JCB.getName()));
        System.out.println(Caravelle.toString());
        System.out.println(Caravelle.carSet(Caravelle.getName()));

    }

    /*public static void printCars(Car[] listOfCars) {
        for (Car num : listOfCars) {
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
    }*/
}

