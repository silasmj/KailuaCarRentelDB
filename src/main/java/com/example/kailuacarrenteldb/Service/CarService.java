package com.example.kailuacarrenteldb.Service;

import com.example.kailuacarrenteldb.Model.Car;
import com.example.kailuacarrenteldb.Repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepo carRepo;

    public List<Car> showCar(){
        return carRepo.showCar();
    }
    public Car addCar(Car car){
        return carRepo.addCar(car);
    }
    public Car findCarById(int car_id){
        return carRepo.findCarById(car_id);
    }
    public Boolean deleteCar(int car_id){
        return carRepo.deleteCar(car_id);
    }
    public Car updateCar(int id, Car car){
        return carRepo.updateCar(id, car);
    }
}