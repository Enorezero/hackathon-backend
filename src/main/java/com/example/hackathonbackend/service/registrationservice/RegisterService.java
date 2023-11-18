package com.example.hackathonbackend.service.registrationservice;


import com.example.hackathonbackend.model.BaseInfo;

public interface RegisterService {

    //Answer registerTrainee(BaseInfo info);

    void sendToEmail(String email);

    boolean validate(String email, String code);
}
