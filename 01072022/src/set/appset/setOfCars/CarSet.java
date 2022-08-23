package set.appset.setOfCars;

// Написать свой пример класса у которого переопределить
// методы equals и hashCode, так что, при создании 5 -ти
// экземпляров этого класса с различными значениями полей,
// в сет добавится только один, остальные буду считаться
// идентичными тому что добавился.

import java.util.*;

public class CarSet {
    public static void main(String[] args) {

        Car carOne = new Car("Micra", "Nissan", 5000);
        Car carTwo = new Car("Patrol", "Nissan", 5000);
        Car carThree = new Car("Navara", "Nissan", 5000);
        Car carFour = new Car("350Z", "Nissan", 5000);
        Car carFive = new Car("Zafira", "Opel", 5000);

        List<Car> cars = new ArrayList<>(Arrays.asList(carOne, carTwo, carThree, carFour, carFive));

        CarSet carSet = new CarSet();
        Set<Car> uniqueCars = carSet.getUniqueCars(cars);
        Iterator<Car> iterator = uniqueCars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car);
        }
        
    }

    private Set<Car> getUniqueCars(List<Car> carList) {
        Set<Car> carSet = new HashSet<>();
        for (Car car : carList) {
            carSet.add(car);
        }
        return carSet;
    }
}