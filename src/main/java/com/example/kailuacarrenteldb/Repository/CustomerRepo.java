package com.example.kailuacarrenteldb.Repository;

import com.example.kailuacarrenteldb.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class CustomerRepo {

    @Autowired
    JdbcTemplate template;

    public Customer addCustomer(Customer c) {
        String sql = "INSERT INTO customers (customer_id, first_name, last_name, email, phone_num, address, postal_code, customer_type, drivers_license_num) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, c.getCustomer_id(), c.getFirstName(), c.getLastName(), c.getEmail(), c.getPhoneNum(), c.getAddress(), c.getPostalCode(), c.getCustomerType(), c.getLicenseNum());
        return null;
    }
    public List<Customer> showCustomers() {
        String sql = "SELECT * FROM customers";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return template.query(sql, rowMapper);
    }
}
