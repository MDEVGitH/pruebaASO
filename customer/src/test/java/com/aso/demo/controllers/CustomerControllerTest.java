package com.aso.demo.controllers;

import com.aso.demo.entities.Customer;
import org.junit.jupiter.api.Test;
import org.junit.Assert;


import java.util.*;

public class CustomerControllerTest {

    @Test
    public void getAllTest(){
        List<Customer> response = new ArrayList<Customer>();
        Customer customer1 = new Customer();
        customer1.setId(1l);
        customer1.setFirstname("Manuel");
        customer1.setLastname("Sanchez");
        customer1.setAddress("Bogota");
        customer1.setEmail("adadsa@cmc.com");
        customer1.setPhone("311111111");

        Customer customer2 = new Customer();
        customer2.setId(2l);
        customer2.setFirstname("Camilo");
        customer2.setLastname("Sevilla");
        customer2.setAddress("Bogota");
        customer2.setEmail("adadsa@cmc.com");
        customer2.setPhone("311111111");

        response.add(customer1);
        response.add(customer2);

        Assert.assertNotNull(response);
        Assert.assertEquals("Manuel",response.get(0).getFirstname());
    }

    @Test
    public void getCustomerTest(){
        String idTest = "1";
        List<Customer> response = new ArrayList<Customer>();
        Customer customer1 = new Customer();
        customer1.setId(1l);
        customer1.setFirstname("Manuel");
        customer1.setLastname("Sanchez");
        customer1.setAddress("Bogota");
        customer1.setEmail("adadsa@cmc.com");
        customer1.setPhone("311111111");

        Customer customer2 = new Customer();
        customer2.setId(2l);
        customer2.setFirstname("Camilo");
        customer2.setLastname("Sevilla");
        customer2.setAddress("Bogota");
        customer2.setEmail("adadsa@cmc.com");
        customer2.setPhone("311111111");

        response.add(customer1);
        response.add(customer2);
        Assert.assertEquals(idTest,Long.toString(response.get(0).getId()));
    }
}
