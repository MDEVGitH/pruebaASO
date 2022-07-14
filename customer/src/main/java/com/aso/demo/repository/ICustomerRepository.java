package com.aso.demo.repository;

import com.aso.demo.entities.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository {

    void update(Customer customer, Long id);

    List<Customer> findAll();

    Customer findById(Long id);

    void deleteById(Long id);

    void save(Customer customer);
}
