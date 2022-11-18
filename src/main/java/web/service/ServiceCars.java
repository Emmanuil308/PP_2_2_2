package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;


public interface ServiceCars {

    public List<Car> getListCars(int count);
}
