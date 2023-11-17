package com.example.hackathonbackend.controller;

import com.example.hackathonbackend.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RegisterService registerService;

//    @PostMapping("/email")
//    ResponseEntity<Answer> sendCodeToEmail(@RequestBody Email email){
//        System.out.println(email.getEmail());
//        return ResponseEntity.ok(registerService.sendToEmail(email.getEmail()));
//    }

    @GetMapping("/test")
    String test(){
        return "tester";
    }




}
