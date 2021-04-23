package com.example.user1service.controller;


import com.example.user1service.entity.Customer;
import com.example.user1service.entity.MyOrders;
import com.example.user1service.entity.Test;
import com.example.user1service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addProduct(customer);
    }

    @GetMapping("/myorders/{id}")
    public MyOrders getMyOrder(@PathVariable("id") int id){
        return customerService.myOrders(id);
    }
}
