package com.example.kailuacarrenteldb.Service;

import com.example.kailuacarrenteldb.Model.Customer;
import com.example.kailuacarrenteldb.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;

    public Customer addCustomer(Customer c) {
        return customerRepo.addCustomer(c);
    }
    public List<Customer> showCustomers() {
        return customerRepo.showCustomers();
    }
}
