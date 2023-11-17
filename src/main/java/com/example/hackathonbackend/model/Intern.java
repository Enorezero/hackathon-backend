package com.example.hackathonbackend.model;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Document("Intern")
public class Intern {
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    @Field("baseinfo")
    private BaseInfo info;
    private String sex;
    private int age;
    private String speciality;
    private List<String>preferences;
    private String position;
    private List<String>internships;
    private List<String> skills;

    public BaseInfo getInfo() {
        return info;
    }

    public void setInfo(BaseInfo info) {
        this.info = info;
    }
}
