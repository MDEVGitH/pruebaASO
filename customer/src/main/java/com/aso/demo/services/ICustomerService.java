package com.aso.demo.services;

import com.aso.demo.entities.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> getAll();
    public Customer getCustomer(Long id);
    public void deleteCustomer(Long id);
    public void saveCustomer(Customer customer);
    public void updateCustomer(Customer customer, Long id);
}
