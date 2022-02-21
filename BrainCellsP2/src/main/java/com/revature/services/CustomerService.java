package com.revature.services;

import com.revature.models.Customer;
import com.revature.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer updateCustomer(String firstName, String lastName, int age){
        return customerRepository.updateCustomer(firstName, lastName, age);
    }
}
