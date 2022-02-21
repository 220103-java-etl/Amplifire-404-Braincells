package com.revature.controllers;


import com.revature.models.Customer;
import com.revature.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public Customer updateCustomerName(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

}
