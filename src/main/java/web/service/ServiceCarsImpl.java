package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCarsImpl implements ServiceCars{

    List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public ServiceCarsImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("KIA", "RIO", 15000));
        cars.add(new Car("Toyota", "Prius", 18000));
        cars.add(new Car("Reno", "Logan", 13500));
        cars.add(new Car("BMW", "X6", 100000));
        cars.add(new Car("Audi", "A6", 45000));
    }

    @Override
    public List<Car> getListCars(int count) {

        return cars.stream().limit(count).toList();
    }
}
