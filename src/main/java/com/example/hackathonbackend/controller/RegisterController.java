package com.example.hackathonbackend.controller;

import com.example.hackathonbackend.service.registrationservice.RegisterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")
@Tag(name = "Контроллер регистрации")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @Operation(summary = "Отправка кода на введённую почту")
    @GetMapping("/{email}")
    ResponseEntity<?> sendCodeToEmail(@PathVariable String email){
        registerService.sendToEmail(email);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(summary = "Валидация ввёденного пользователем кода, имеющего почту email")
    @GetMapping("/{email}/{code}")
    ResponseEntity<?> validate(@PathVariable String email, @PathVariable String code){
        boolean result = registerService.validate(email, code);
        if(result){return new ResponseEntity<>(HttpStatus.OK);}
        else  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
