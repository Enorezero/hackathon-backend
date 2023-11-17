package com.example.hackathonbackend.controller;

import com.example.hackathonbackend.model.Intern;
import com.example.hackathonbackend.model.Internship;
import com.example.hackathonbackend.service.internshipservice.InternshipService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/internship")
public class InternshipController {

    InternshipService internshipService;
    @PostMapping("/add")
    ResponseEntity<?> addedInternship(@RequestBody Internship internship){
        internshipService.addInternship(internship);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    ResponseEntity<List<Internship>> getAllInternship(){
        return ResponseEntity.ok(internshipService.getAllInternships());
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> deleteInternshipById(@PathVariable String id){
        internshipService.deleteInternship(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<?> updateInternship(@PathVariable String id, @RequestBody Internship internship){
        internshipService.updateInternship(id, internship);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
