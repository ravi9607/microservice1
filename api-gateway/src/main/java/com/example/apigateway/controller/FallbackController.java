package com.example.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("customerService")
    public String customerFallback(){
        return "Customer Service Not Working At a Time..... ";
    }
    @GetMapping("productService")
    public String productFallback(){
        return "Product Service Not Working At a Time..... ";
    }
}
