package com.example.hackathonbackend.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Document("Internship")
public class Internship {
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private String owner_id;
    private String name;
    private String description;
    private String duration;
    private int people;
    private int salary;
    private String internshipType;
    private String internshipStatus;
    private String image;
    private String teamLead;
    private List<String>images;
    private List<String> specialities;
    //id юзеров, оставивших комментарии
    private List<String>responed;
    private List<String>reviews;
}
