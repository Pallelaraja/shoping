package com.example.shoping.controller;

import com.example.shoping.entity.shopentity;
import com.example.shoping.service.shopservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {

    @Autowired
    private shopservice shopservice;

    @GetMapping("/")
    public List<shopentity> getAll() {
        return shopservice.getall();
    }

    @PostMapping("/shop")
    public String upload(@RequestBody shopentity shop) {
        shopservice.upload(shop);
        return "Shop data uploaded successfully";
    }
}
