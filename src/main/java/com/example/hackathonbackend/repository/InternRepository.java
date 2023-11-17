package com.example.hackathonbackend.repository;

import com.example.hackathonbackend.model.Intern;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InternRepository extends MongoRepository<Intern,String> {
}
