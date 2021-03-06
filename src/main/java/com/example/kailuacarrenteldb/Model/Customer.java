package com.example.kailuacarrenteldb.Model;

public class Customer {
    private int customer_id;
    private String firstName;
    private String lastName;
    private String customerType;
    private String email;
    private int phoneNum;
    private String address;
    private int postalCode;
    private String city;
    private int licenseNum;
    private String driverSinceDate;


    public Customer() {

    }

    public Customer(int customer_id, String firstName, String lastName, String customerType, String email, int phoneNum, String address, int postalCode, String city, int licenseNum, String driverSinceDate) {
        this.customer_id = customer_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerType = customerType;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.licenseNum = licenseNum;
        this.driverSinceDate = driverSinceDate;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(int licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getDriverSinceDate() {
        return driverSinceDate;
    }

    public void setDriverSinceDate(String driverSinceDate) {
        this.driverSinceDate = driverSinceDate;
    }
}

