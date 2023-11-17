package com.example.hackathonbackend.controller;

import com.example.hackathonbackend.model.BaseInfo;
import com.example.hackathonbackend.model.Intern;
import com.example.hackathonbackend.service.internservice.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/intern")
public class InternController {

    @Autowired
    InternService internService;
    @PostMapping("/addbybase")
    ResponseEntity<?> addInternByBaseInfo(@RequestBody BaseInfo info){
        internService.addInternByBase(info);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/add")
    ResponseEntity<?> addIntern(@RequestBody Intern intern){
        internService.addIntern(intern);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<?> updateIntern(@PathVariable String id, @RequestBody Intern intern){
        internService.updateIntern(id, intern);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<Intern> getInternById(@PathVariable String id){
        return ResponseEntity.ok(internService.getIntern(id).get());
    }
    @GetMapping("/all")
    ResponseEntity<List<Intern>> getAllIntern(){
        return ResponseEntity.ok(internService.getAllIntern());
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> deleteInternById(@PathVariable String id){
        internService.deleteIntern(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
