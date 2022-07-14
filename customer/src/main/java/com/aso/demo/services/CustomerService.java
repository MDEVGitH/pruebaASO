package com.aso.demo.services;

import com.aso.demo.entities.Customer;
import com.aso.demo.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerRepository repository;


    @Override
    public List<Customer> getAll(){
        return (List<Customer>) repository.findAll();
    }

    @Override
    public Customer getCustomer(Long id) {
        try{
            return repository.findById(id);
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

    @Override
    public void updateCustomer(Customer customer,Long id) {
        try{
            repository.update(customer, id);
        }catch(Exception e){

        }
    }
}
