package com.example.hackathonbackend.controller;

import com.example.hackathonbackend.model.Intern;
import com.example.hackathonbackend.model.Internship;
import com.example.hackathonbackend.service.internshipservice.InternshipService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/internship")
@Tag(name = "Контроллер стажировок", description = "Содержит CRUD операции для модели стажировки")
public class InternshipController {

    @Autowired
    InternshipService internshipService;
    @PostMapping("/add")
    ResponseEntity<?> addedInternship(@RequestBody Internship internship){
        System.out.println(internship);
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
