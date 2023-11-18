package com.example.hackathonbackend.controller;

import com.example.hackathonbackend.model.Email;
import com.example.hackathonbackend.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @GetMapping("/{email}")
    ResponseEntity<?> sendCodeToEmail(@PathVariable String email){
        System.out.println(email);
        registerService.sendToEmail(email);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/test")
    String test(){
        return "tester";
    }




}
