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
        String sql = "SELECT * FROM rental";
        RowMapper<Rental> rowMapper = new BeanPropertyRowMapper<>(Rental.class);
        return template.query(sql, rowMapper);
    }

    public Rental addRental(Rental r){
        String sql = "INSERT INTO rental (rental_id, rental_start, rental_end) VALUES (?, ?, ?)";
        template.update(sql, r.getRental_id(), r.getRental_start(), r.getRental_end());
        return null;
    }

    public Rental findRentalById(int rental_id){
        String sql = "SELECT * FROM rental WHERE id = ?";
        RowMapper<Rental> rowMapper = new BeanPropertyRowMapper<>(Rental.class);
        Rental r = template.queryForObject(sql, rowMapper, rental_id);
        return r;
    }

    public Boolean deleteRental(int id){
        String sql = "DELETE FROM renal WHERE id = ?";
        return template.update(sql, id) > 0;
    }

    public Rental updateRental(int rental_id, Rental r){
        String sql = "UPDATE person SET rental_start = ?, rental_end = ? WHERE rental_id";
        template.update(sql, r.getRental_id(), r.getRental_start(), r.getRental_end());
        return null;
    }
}