package com.example.kailuacarrenteldb.Model;

public class Car {
    int car_id;
    String registration_num;
    int km;
    String model;
    String firstregistration;
    int model_id;
    String brand;

    public Car(int car_id, String registration_num, int km, String model, String firstregistration, int model_id, String brand) {
        this.car_id = car_id;
        this.registration_num = registration_num;
        this.km = km;
        this.model = model;
        this.firstregistration = firstregistration;
        this.model_id = model_id;
        this.brand = brand;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getRegistration_num() {
        return registration_num;
    }

    public void setRegistration_num(String registration_num) {
        this.registration_num = registration_num;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFirstregistration() {
        return firstregistration;
    }

    public void setFirstregistration(String firstregistration) {
        this.firstregistration = firstregistration;
    }

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
