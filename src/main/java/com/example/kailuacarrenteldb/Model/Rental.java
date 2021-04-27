package com.example.kailuacarrenteldb.Model;

public class Rental {
    private int rental_id;
    private String rentalStart;
    private String rentalEnd;

    public Rental() {
    }

    public Rental(int rental_id, String rentalStart, String rentalEnd) {
        this.rental_id = rental_id;
        this.rentalStart = rentalStart;
        this.rentalEnd = rentalEnd;
    }

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public String getRentalStart() {
        return rentalStart;
    }

    public void setRentalStart(String rentalStart) {
        this.rentalStart = rentalStart;
    }

    public String getRentalEnd() {
        return rentalEnd;
    }

    public void setRentalEnd(String rentalEnd) {
        this.rentalEnd = rentalEnd;
    }
}
