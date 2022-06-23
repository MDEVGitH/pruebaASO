package com.aso.demo.services;

import com.aso.demo.entities.Customer;
import com.aso.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> getAll(){
        return (List<Customer>) repository.findAll();
    }

    @Override
    public Customer getCustomer(Long id) {
        try{
            return (Customer) repository.findById(id).get();
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public void deleteCustomer(Long id){
        try{
            repository.deleteById(id);
        }catch(Exception e){

        }
    }

    @Override
    public void saveCustomer(Customer customer){
        repository.save(customer);
    }
}
