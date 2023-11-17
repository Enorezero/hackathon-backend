package com.example.hackathonbackend.model;


import lombok.Data;

import java.util.List;

@Data
public class TraineePersonalInfo {
    String surname;
    String name;
    String lastname;
    String institut;
    String commercialExpirience;
    String expirience;
    String image;
    String specialize;
    String contacts;
    List<Orders> orders;
    String city;
    String sex;
    int age;

}
