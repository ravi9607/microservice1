package com.example.productservice.service;

import com.example.productservice.entity.Product;
import com.example.productservice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;


    public Product addProduct(@RequestBody Product product){
        return productRepo.save(product);
    }

    public List<Product> getProduct(){
        return productRepo.findAll();
    }

    public Optional<Product> getProductById(int id){
        return productRepo.findById(id);
    }

}
