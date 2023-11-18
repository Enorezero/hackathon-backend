package com.example.hackathonbackend.controller;

import com.example.hackathonbackend.model.BaseInfo;
import com.example.hackathonbackend.model.Company;
import com.example.hackathonbackend.service.companyservice.CompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
@Tag(name = "Контроллер заказчиков", description = "Содержит CRUD операции для модели заказчика")
public class CompanyController {

    @Autowired
    CompanyService companyService;


    @Operation(summary = "Добавление заказчика")
    @PostMapping("/add")
    ResponseEntity<?> addCompany(@RequestBody Company company){
        companyService.addCompany(company);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/addbybase")
    ResponseEntity<?> addCompany(@RequestBody BaseInfo info){
        companyService.addCompanyByBaseInfo(info);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(summary = "Обновление заказчика")
    @PutMapping("/update/{id}")
    ResponseEntity<?> updateCompany(@PathVariable String id, @RequestBody Company company){
        companyService.updateCompany(id, company);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Operation(summary = "Получение заказчика по ID")
    @GetMapping("/{id}")
    ResponseEntity<Company> getCompanyById(@PathVariable String id){
        return ResponseEntity.ok(companyService.getCompany(id).get());
    }

    @Operation(summary = "Получение списка всех заказчиков")
    @GetMapping("/all")
    ResponseEntity<List<Company>> getAllCompanies(){
        return ResponseEntity.ok(companyService.getAllCompanies());
    }

    @Operation(summary = "Удаление заказчика по ID")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> deleteCompanyById(@PathVariable String id){
        companyService.deleteCompany(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
