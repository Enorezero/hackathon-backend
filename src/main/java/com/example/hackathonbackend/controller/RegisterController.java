package com.example.hackathonbackend.controller;

import com.example.hackathonbackend.service.registrationservice.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @GetMapping("/{email}")
    ResponseEntity<?> sendCodeToEmail(@PathVariable String email){
        registerService.sendToEmail(email);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{email}/{code}")
    ResponseEntity<?> validate(@PathVariable String email, @PathVariable String code){
        boolean result = registerService.validate(email, code);
        if(result){return new ResponseEntity<>(HttpStatus.OK);}
        else  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
