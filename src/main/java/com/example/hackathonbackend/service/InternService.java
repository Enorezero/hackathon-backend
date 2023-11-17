package com.example.hackathonbackend.service;

import com.example.hackathonbackend.model.BaseInfo;
import com.example.hackathonbackend.model.Intern;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addIntern(BaseInfo baseInfo);
    Optional<Intern> getIntern(String id);
    List<Intern> getAllIntern();

    void deleteIntern(String id);


}
