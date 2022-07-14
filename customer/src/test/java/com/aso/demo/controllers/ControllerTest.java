package com.aso.demo.controllers;


import com.aso.demo.DummyMock;
import com.aso.demo.entities.Customer;
import com.aso.demo.repository.CustomerRepositoryImp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

    @Mock
    CustomerController customerController;


    @Test
    public void ControllerGetAllTest(){
        when(customerController.getAll()).thenReturn(DummyMock.getCustomers());
        List<Customer> response = customerController.getAll();
        Assert.assertNotNull(response);
        Assert.assertEquals(1,response.get(0).getId_customer());
    }

    @Test
    public void ControllerGetCustomerTest(){
        when(customerController.getCustomer("1")).thenReturn(DummyMock.getCustomer());
        Customer response = customerController.getCustomer("1");
        Assert.assertNotNull(response);
        Assert.assertEquals(1,response.getId_customer());
    }

}
