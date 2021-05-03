package com.example.kailuacarrenteldb.Repository;

import com.example.kailuacarrenteldb.Model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class CarModelRepo {

    @Autowired
    JdbcTemplate template;

    public CarModel addCarModel(CarModel cModel){
        String sql = "INSERT INTO model (model_id, model_name, gear_type, engine_size_litres, horse_power, seats, cruise_control, aircondition) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, cModel.getModel_id(), cModel.getModelName(), cModel.getGearType(), cModel.getEngineSize(), cModel.getHp(), cModel.getSeats(), cModel.getAircon());
        return null;
    }

    public List<CarModel> showCarModel() {
        String sql = "SELECT * FROM model";
        RowMapper<CarModel> rowMapper = new BeanPropertyRowMapper<>(CarModel.class);
        return template.query(sql, rowMapper);
    }
    public CarModel findCarModelById(int carModel_id) {
        String sql = "SELECT * FROM model WHERE id =?";
        RowMapper<CarModel> rowMapper = new BeanPropertyRowMapper<>(CarModel.class);
        CarModel cModel = template.queryForObject(sql, rowMapper, carModel_id);
        return cModel;
    }

    public boolean deleteCarModel(int carModel_id){
        String sql = "DELETE FROM model WHERE id = ?";
        return template.update(sql, carModel_id) > 0;
    }

    public CarModel updateCarModel(int id, CarModel cModel){
        String sql = "UPDATE model SET model_name = ?, gear_type = ?, engine_size_litres = ?, horse_power = ?, seats = ?, cruise_control = ?, aircondition = ?, WHERE model_id = ?";
        template.update(sql, cModel.getModel_id(), cModel.getModelName(), cModel.getGearType(), cModel.getEngineSize(), cModel.getHp(), cModel.getSeats(), cModel.getCruiseControl(), cModel.getAircon());
        return null;
    }
}