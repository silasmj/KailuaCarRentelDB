package com.example.kailuacarrenteldb.Repository;

import com.example.kailuacarrenteldb.Model.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RentalRepo {
    @Autowired
    JdbcTemplate template;

    public List<Rental> showRental(){
        /*String sql = "SELECT rental.id, rental.rental_start, rental.rental_end, customer.first_name, customer.last_name, rental.car_id, rental.customer_id" +
                "FROM rental" +
                "JOIN car ON car.rental_id=rental.id" +
                "JOIN customer ON customer.id=rental.customer_id;";*/
        String sql = "SELECT * rental";
        RowMapper<Rental> rowMapper = new BeanPropertyRowMapper<>(Rental.class);
        return template.query(sql, rowMapper);
    }

    public Rental addRental(Rental r){
        String sql = "INSERT INTO rental VALUES (?, ?, ?, ?, ?, ?)";
        template.update(sql, r.getId(), r.getRental_start(), r.getRental_end(), r.getFirst_name(), r.getCustomer_id(), r.getCar_id());
        return null;
    }

    public Rental findRentalById(int id){
        String sql = "SELECT * FROM rental WHERE id = ?;";
        RowMapper<Rental> rowMapper = new BeanPropertyRowMapper<>(Rental.class);
        Rental r = template.queryForObject(sql, rowMapper, id);
        return r;
    }

    public Boolean deleteRental(int id){
        String sql = "DELETE FROM rental WHERE id = ?;";
        return template.update(sql, id) > 0;
    }

    public Rental updateRental(int id, Rental r){
        String sql = "UPDATE rental SET rental_start = ?, rental_end = ? WHERE id = ?;";
        template.update(sql, r.getId(), r.getRental_start(), r.getRental_end());
        return null;
    }
}