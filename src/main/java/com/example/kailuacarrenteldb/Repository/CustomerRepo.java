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
    public Boolean deleteCustomers(int customer_id) {
        String sql = "DELETE FROM customers where customer_id = ?";
        return template.update(sql, customer_id) > 0;
    }
    public Customer updateCustomer(int customer_id, Customer c) {
        String sql = "UPDATE customers SET first_name = ?, last_name = ?, email = ?, phone_num = ?, address = ?, postal_code = ?, customer_type = ?, drivers_license_num = ?";
        template.update(sql, c.getFirstName(), c.getLastName(), c.getEmail(), c.getPhoneNum(), c.getAddress(), c.getPostalCode(), c.getCustomerType(), c.getLicenseNum());
        return null;
    }
    public Customer findCustomerById(int customer_id) {
        String sql = "SELECT * FROM customers WHERE customer_id = ?";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        Customer c = template.queryForObject(sql, rowMapper, customer_id);
        return c;
    }
}

