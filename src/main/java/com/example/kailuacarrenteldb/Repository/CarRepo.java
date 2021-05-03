package com.example.kailuacarrenteldb.Repository;

import com.example.kailuacarrenteldb.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepo {
    @Autowired
    JdbcTemplate template;

    public List<Car> showCar(){
        String sql = "SELECT * FROM car";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);
        return template.query(sql, rowMapper);
    }
    public Car addCar(Car car){
        String sql = "INSERT INTO car (car_id, car_registrationNumber, car_km, car_model, car_firstRegistration) VALUES(?, ?, ?, ?, ?)";
        template.update(sql, car.getCar_id(), car.getRegistration_num(), car.getKm(), car.getModel(), car.getFirstregistration());
        return null;
    }
    public Car findCarById(int id){
        String sql = "SELECT * FROM car WHERE id =?";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);
        Car car = template.queryForObject(sql, rowMapper, id);
        return car;
    }
    public Boolean deleteCar(int id){
        String sql = "DELETE FROM person WHERE id = ?";
        return template.update(sql, id) > 0;
    }
    public Car updateCar(int car_id, Car car){
        String sql = "UPDATE car SET registration_num = ?, km = ?, model = ?, firstregistration = ?, rental_id = ?, model_id = ?, WHERE car_id = ?";
        template.update(sql, car.getCar_id(), car.getFirstregistration(), car.getKm(), car.getModel(), car.getModel_id(), car.getRegistration_num(), car.getRental_id());
        return null;
    }
}