package com.aso.demo.repository;

import com.aso.demo.entities.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository

public class CustomerRepositoryImp implements ICustomerRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public void update(Customer customer, Long id) {
        customer.setId_customer(id);
        entityManager.merge(customer);
    }

    @Transactional
    @Override
    public List<Customer> findAll() {
        String query = "FROM customers";
        return entityManager.createQuery(query)
                .getResultList();

    }

    @Transactional
    @Override
    public Customer findById(Long id) {
        String query = "FROM customers WHERE id_customer = :id";
        List<Customer> result = entityManager.createQuery(query)
                .setParameter("id", id)
                .getResultList();
        return result.size() == 0 ? null: result.get(0);
    }


    @Transactional
    @Override
    public void deleteById(Long id) {
        entityManager.remove(findById(id));
    }

    @Transactional
    @Override
    public void save(Customer customer) {
        entityManager.merge(customer);
    }


}
