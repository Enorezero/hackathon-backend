package com.example.hackathonbackend.service.internservice;

import com.example.hackathonbackend.model.BaseInfo;
import com.example.hackathonbackend.model.Intern;

import java.util.List;
import java.util.Optional;

public interface InternService {
    void addInternByBase(BaseInfo baseInfo);
    void addIntern(Intern intern);
    void updateIntern(String id, Intern intern);
    Optional<Intern> getIntern(String id);
    List<Intern> getAllIntern();
    void deleteIntern(String id);


}
