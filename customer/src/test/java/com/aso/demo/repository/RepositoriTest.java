package com.aso.demo.repository;

import com.aso.demo.DummyMock;
import com.aso.demo.entities.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RepositoriTest {

    @Mock
    CustomerRepositoryImp customerRepositoryImp;


    @Test
    public void findAllTest(){
        when(customerRepositoryImp.findAll()).thenReturn(DummyMock.getCustomers());
        List<Customer> response = customerRepositoryImp.findAll();
        Assert.assertNotNull(response);
    }

    @Test
    public void findByIdTest(){
        when(customerRepositoryImp.findById(1l)).thenReturn(DummyMock.getCustomer());
        Customer response = customerRepositoryImp.findById(1l);
        Assert.assertNotNull(response);
    }

}
