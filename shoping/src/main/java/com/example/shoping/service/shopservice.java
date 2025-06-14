package com.example.shoping.service;

import com.example.shoping.entity.shopentity;
import com.example.shoping.repository.shoprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class shopservice {

    @Autowired
    private shoprepo shoprepo;

    public List<shopentity> getall() {
        return shoprepo.findAll();
    }

    public void upload(shopentity shop){
        try{
            shoprepo.save(shop);
        } catch (Exception e){
            System.out.println("Error saving bus: " + e.getMessage());
        }
    }
}
