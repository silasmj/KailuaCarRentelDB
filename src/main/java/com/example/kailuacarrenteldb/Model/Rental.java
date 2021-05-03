package com.example.kailuacarrenteldb.Model;

public class Rental {
    private int rental_id;
    private String rental_start;
    private String rental_end;

    public Rental() {
    }

    public Rental(int rental_id, String rentalStart, String rentalEnd) {
        this.rental_id = rental_id;
        this.rental_start = rentalStart;
        this.rental_end = rentalEnd;
    }

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
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
}