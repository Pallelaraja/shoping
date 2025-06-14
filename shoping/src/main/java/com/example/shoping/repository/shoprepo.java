package com.example.shoping.repository;

import com.example.shoping.entity.shopentity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface shoprepo extends MongoRepository<shopentity, String> {

}
