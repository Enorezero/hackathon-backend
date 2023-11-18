package com.example.hackathonbackend.repository;

import com.example.hackathonbackend.model.Key;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KeyRepository extends MongoRepository<Key,String> {
    Key findByEmail(String email);
}
