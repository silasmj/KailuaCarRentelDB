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

    public List<Car> showLuxury(){
        String sql = "SELECT car.id, registration_num, km, firstregistration, model_id, model.model_name, brand FROM car join model on model_id=model.id WHERE model.type_id = 1;";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);
        return template.query(sql, rowMapper);
    }

    public List<Car> showFamily(){
        String sql = "SELECT car.id, registration_num, km, firstregistration, model_id, model.model_name, brand\n" +
                "FROM car\n" +
                "join model on model_id=model.id\n" +
                "WHERE model.type_id = 2;";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);
        return template.query(sql, rowMapper);
    }

    public List<Car> showSport(){
        String sql = "SELECT car.id, registration_num, km, firstregistration, model_id, model.model_name, brand\n" +
                "FROM car\n" +
                "join model on model_id=model.id\n" +
                "WHERE model.type_id = 3;";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);
        return template.query(sql, rowMapper);
    }
    public Car addCar(Car car){
        String sql = "INSERT INTO car (car_id, car_registrationNumber, car_km, car_model, car_firstRegistration) VALUES(?, ?, ?, ?, ?)";
        template.update(sql, car.getId(), car.getRegistration_num(), car.getKm(), car.getModel(), car.getFirstregistration());
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
        template.update(sql, car.getId(), car.getFirstregistration(), car.getKm(), car.getModel(), car.getModel_id(), car.getRegistration_num(), car.getBrand());
        return null;
    }
}