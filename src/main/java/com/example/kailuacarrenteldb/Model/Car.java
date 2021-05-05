package com.example.kailuacarrenteldb.Model;

public class Car {
    int id;
    String registration_num;
    int km;
    String model;
    String firstregistration;
    int model_id;
    String brand;
    String model_name;

  /*  public Car(int id, String registration_num, int km, String model, String firstregistration, int model_id, String brand, String model_name) {
        this.id = id;
        this.registration_num = registration_num;
        this.km = km;
        this.model = model;
        this.firstregistration = firstregistration;
        this.model_id = model_id;
        this.brand = brand;
        this.model_name = model_name;
    } */
    public Car() {
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
