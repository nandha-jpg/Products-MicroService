package com.nandha.products_microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @GetMapping("/")
    public String getProducts(){
        return "List of products available : Mobile, pen, Scale, Tablet, Cycle";
    }

    @GetMapping("/tablet")
    public String returnTablet(){
        return "Chosen product is tablet";
    }
}
