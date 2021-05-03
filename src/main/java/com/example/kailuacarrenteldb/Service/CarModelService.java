package com.example.kailuacarrenteldb.Service;

import com.example.kailuacarrenteldb.Model.Car;
import com.example.kailuacarrenteldb.Model.CarModel;
import com.example.kailuacarrenteldb.Repository.CarModelRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarModelService {

    @Autowired
    CarModelRepo carModelRepo;

    public CarModel addCarModel(CarModel cModel) {
        return carModelRepo.addCarModel(cModel);
    }
    public List<CarModel> showCarModel() {
        return carModelRepo.showCarModel();
    }
    public CarModel findCarModelById(int carModel_id) {
        return carModelRepo.findCarModelById(carModel_id);
    }
    public boolean deleteCarModel(int carModel_id) {
        return carModelRepo.deleteCarModel(carModel_id);
    }
    public CarModel updateCarModel(int carModel_id, CarModel cModel) {
        return carModelRepo.updateCarModel(carModel_id, cModel);
    }
}