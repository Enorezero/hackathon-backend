package com.example.hackathonbackend.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("baseinfo")
public class BaseInfo {
    String surname;
    String name;
    String lastname;
    String city;
    String photo;
    String email;
    String password;
    String status;
    String contact;
    String aboutUser;
    String experince;
}
