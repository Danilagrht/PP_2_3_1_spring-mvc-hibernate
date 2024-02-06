package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Nissan", 2016, "silver"));
        cars.add(new Car("Mercedes", 1990, "black"));
        cars.add(new Car("Toyota", 2010, "silver"));
        cars.add(new Car("Renault", 2020, "white"));
        cars.add(new Car("Ford", 2023, "red"));

        if (count > 5) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
