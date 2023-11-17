package com.example.hackathonbackend.controller;

import com.example.hackathonbackend.model.Answer;
import com.example.hackathonbackend.model.BaseInfo;
import com.example.hackathonbackend.model.Intern;
import com.example.hackathonbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/addintern")
    ResponseEntity<Answer> addTrainee(@RequestBody BaseInfo info){
        userService.addIntern(info);
        Answer answer = new Answer();
        return ResponseEntity.ok(answer);
    }

    @GetMapping("/intern/{id}")
    ResponseEntity<Intern> getInternById(@PathVariable String id){
        System.out.println(id);
        return ResponseEntity.ok(userService.getIntern(id).get());
    }
    @GetMapping("/interns")
    ResponseEntity<List<Intern>> getAllIntern(){
        return ResponseEntity.ok(userService.getAllIntern());
    }



}
