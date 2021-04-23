package com.example.user1service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyOrders {
    private Customer customer;
    private Product product;
}
