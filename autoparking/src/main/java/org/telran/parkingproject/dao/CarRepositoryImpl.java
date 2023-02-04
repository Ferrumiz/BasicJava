package org.telran.parkingproject.dao;

import org.springframework.stereotype.Component;
import org.telran.parkingproject.model.Car;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Component
public class CarRepositoryImpl implements CarRepository {

    private List<Car> carList = new ArrayList<>();

    private AtomicInteger carId = new AtomicInteger(5);

    @PostConstruct
    private void init(){
        carList.add(new Car("Lada", 1950,1,"Red"));
        carList.add(new Car("MAZ", 1952,2,"Blue"));
        carList.add(new Car("ZAZ", 1921,3,"Yellow"));
        carList.add(new Car("VAZ", 1959,4,"Pink"));
    }

    @Override
    public List<Car> list() {
        return carList;
    }

    @Override
    public Car getCar(int id){
        return carList.stream().filter(car -> car.getId() == id).findFirst().get();
    }

    @Override
    public Car save(Car car) {
        car.setId(carId.incrementAndGet());
        carList.add(car);
        return car;
    }

    @Override
    public boolean remove(int id) {
        carList = carList.stream().filter(car -> car.getId() != id).collect(Collectors.toList());
        return true;
    }
}
