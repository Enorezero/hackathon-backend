package com.example.hackathonbackend.repository;

import com.example.hackathonbackend.model.Internship;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipRepository extends MongoRepository<Internship, String> {
}
