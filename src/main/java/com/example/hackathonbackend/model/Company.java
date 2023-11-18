package com.example.hackathonbackend.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Document("Company")
public class Company {
    @MongoId(FieldType.OBJECT_ID)
    String id;
    String organization;
    private List<String> internships;
    @Field("baseinfo")
    BaseInfo info;
    private Double rating;
    public BaseInfo getInfo() {
        return info;
    }
    public void setInfo(BaseInfo info) {
        this.info = info;
    }


}
