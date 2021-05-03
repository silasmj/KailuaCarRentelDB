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
    public Boolean deleteCustomers(int customer_id) {
        return customerRepo.deleteCustomers(customer_id);
    }
    public Customer findCustomerById(int customer_id) {
        return customerRepo.findCustomerById(customer_id);
    }
    public Customer updateCustomer(int customer_id, Customer c) {
        return customerRepo.updateCustomer(customer_id, c);
    }
}
