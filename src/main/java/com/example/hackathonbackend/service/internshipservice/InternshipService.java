package com.example.hackathonbackend.service.internshipservice;

import com.example.hackathonbackend.model.Intern;
import com.example.hackathonbackend.model.Internship;

import java.util.List;
import java.util.Optional;

public interface InternshipService {
    void addInternship(Internship internship);
    void updateInternship(String id, Internship internship);
    Optional<Internship> getInternship(String id);
    List<Internship> getAllInternships();
    void deleteInternship(String id);
}
