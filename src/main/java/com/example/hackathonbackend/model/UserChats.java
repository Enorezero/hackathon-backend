package com.example.hackathonbackend.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("userchatsid")
public class UserChats {
    List<String> chatId;
}
