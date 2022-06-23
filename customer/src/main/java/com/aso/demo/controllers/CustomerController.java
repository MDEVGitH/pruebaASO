package com.aso.demo.controllers;

import com.aso.demo.entities.Customer;
import com.aso.demo.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @GetMapping("/api/customer")
    public List<Customer> getAll(){
        return service.getAll();
    }
    @GetMapping("/api/customer/{id}")
    public Customer getCustomer(@PathVariable String id){
        return service.getCustomer(Long.parseLong(id));
    }

    @DeleteMapping("/api/customer/{id}")
    public void deleteCustomer(@PathVariable String id){
        service.deleteCustomer(Long.parseLong(id));
    }

    @PostMapping("/api/customer")
    public void saveCustomer(@RequestBody Customer customer){
        service.saveCustomer(customer);
    }

}
