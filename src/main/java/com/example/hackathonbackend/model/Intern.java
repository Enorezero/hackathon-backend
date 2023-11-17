package com.example.hackathonbackend.model;

import lombok.Data;

@Data
public class Trainee {
    TraineeCredential credential;
    TraineePersonalInfo info;
    UserChats chats;

}
