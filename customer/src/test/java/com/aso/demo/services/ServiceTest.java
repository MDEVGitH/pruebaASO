package com.aso.demo.services;

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
public class ServiceTest {

    @Mock
    CustomerService customerService;


    @Test
    public void getAllTest(){
        when(customerService.getAll()).thenReturn(DummyMock.getCustomers());
        List<Customer> response = customerService.getAll();
        Assert.assertNotNull(response);
    }
    @Test
    public void getCustomerTest(){
        when(customerService.getCustomer(1l)).thenReturn(DummyMock.getCustomer());
        Customer response = customerService.getCustomer(1l);
        Assert.assertNotNull(response);
    }


}
