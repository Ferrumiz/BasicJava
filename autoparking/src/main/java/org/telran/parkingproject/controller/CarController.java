package org.telran.parkingproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.telran.parkingproject.model.Car;
import org.telran.parkingproject.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/cars") ///  //localhost:8080/cars
public class CarController {

    @Autowired
    private CarService service;

    //localhost:8080/cars
    @GetMapping
    public List<Car> list() {
        return service.list();
    }

    //localhost:8080/cars/4
    @GetMapping("/{id}")
    public Car getCar(@PathVariable(name = "id") int id) {
        return service.getCar(id);
    }

    @PostMapping
    public Car create(@RequestBody Car car) {
        return service.save(car);
    }

    //localhost:8080/c ars/4
    @DeleteMapping("/{id}")
    public Boolean remove(@PathVariable(name = "id") int id){
        return service.remove(id);
    }

}
