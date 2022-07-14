package com.aso.demo;

import com.aso.demo.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class DummyMock {

    public static List<Customer> getCustomers(){
        List<Customer> listaClientes = new ArrayList<>();
        Customer cliente1 = new Customer();

        cliente1.setId_customer(1);
        cliente1.setEmail("ManuelSanchez4780@gmail.com");
        cliente1.setPhone("3197869996");
        cliente1.setAddress("Bogota");
        cliente1.setFirstname("Manuel");
        cliente1.setLastname("Sanchez");
        listaClientes.add(cliente1);

        Customer cliente2 = new Customer();
        cliente2.setId_customer(2);
        cliente2.setFirstname("Camilo");
        cliente2.setLastname("Sevilla");
        cliente2.setAddress("Cll 146 # 52");
        cliente2.setPhone("3157211652");
        cliente2.setEmail("Camilo@gmail.com");
        return listaClientes;
    }

    public static Customer getCustomer(){
        Customer cliente1 = new Customer();
        cliente1.setId_customer(1);
        cliente1.setEmail("ManuelSanchez4780@gmail.com");
        cliente1.setPhone("3197869996");
        cliente1.setAddress("Bogota");
        cliente1.setFirstname("Manuel");
        cliente1.setLastname("Sanchez");
        return cliente1;
    }

}
