package com.example.hackathonbackend.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document("Key")
public class Key {
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    String email;
    String code;
}
