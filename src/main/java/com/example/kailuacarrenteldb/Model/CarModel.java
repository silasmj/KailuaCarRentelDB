package com.example.kailuacarrenteldb.Model;

public class CarModel {
    private int model_id;
    private String modelName;
    private String modelType;
    private String gearType;
    private int hp;
    private int engineSize;
    private int seats;
    private boolean aircon;
    private boolean cruiseControl;

    public CarModel() {
    }

    public CarModel(int model_id, String modelName, String modelType, String gearType, int hp, int engineSize, int seats, boolean aircon, boolean cruiseControl) {
        this.model_id = model_id;
        this.modelName = modelName;
        this.modelType = modelType;
        this.gearType = gearType;
        this.hp = hp;
        this.engineSize = engineSize;
        this.seats = seats;
        this.aircon = aircon;
        this.cruiseControl = cruiseControl;
    }

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean getAircon() {
        return aircon;
    }

    public void setAircon(boolean aircon) {
        this.aircon = aircon;
    }

    public boolean getCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }
}

