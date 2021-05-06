package com.example.kailuacarrenteldb.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rental {
    @Id
    private int id;
    private String rental_start;
    private String rental_end;
    private String first_name;
    private int customer_id;
    private int car_id;

    public Rental() {
    }

    public Rental(int id, String rental_start, String rental_end, String first_name, int customer_id, int car_id) {
        this.id = id;
        this.rental_start = rental_start;
        this.rental_end = rental_end;
        this.first_name = first_name;
        this.customer_id = customer_id;
        this.car_id = car_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRental_start() {
        return rental_start;
    }

    public void setRental_start(String rental_start) {
        this.rental_start = rental_start;
    }

    public String getRental_end() {
        return rental_end;
    }

    public void setRental_end(String rental_end) {
        this.rental_end = rental_end;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }
}