package com.aso.demo.controllers;

import com.aso.demo.entities.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ICustomerController {

    @GetMapping("/api/customer")
    List<Customer> getAll();

    @GetMapping("/api/customer/{id}")
    Customer getCustomer(@PathVariable String id);

    @PutMapping("/api/customer/{id}")
    void updateCustomer(@RequestBody Customer customer, @PathVariable String id);

    @DeleteMapping("/api/customer/{id}")
    void deleteCustomer(@PathVariable String id);

    @PostMapping("/api/customer")
    void saveCustomer(@RequestBody Customer customer);
}
