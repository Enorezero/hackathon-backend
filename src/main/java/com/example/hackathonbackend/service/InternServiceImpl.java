package com.example.hackathonbackend.service;

import com.example.hackathonbackend.model.BaseInfo;
import com.example.hackathonbackend.model.Intern;
import com.example.hackathonbackend.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    InternRepository internRepository;
    @Override
    public void addIntern(BaseInfo baseInfo) {
        Intern intern = new Intern();
        intern.setInfo(baseInfo);
        System.out.println(baseInfo);
        intern.setSex("Мужской");
        intern.setAge(20);
        System.out.println(intern);
        internRepository.save(intern);
    }

    @Override
    public Optional<Intern> getIntern(String id) {
        System.out.println(id + "555555");
        return internRepository.findById(id);

    }

    @Override
    public List<Intern> getAllIntern() {
        return internRepository.findAll();
    }

    @Override
    public void deleteIntern(String id) {
        internRepository.deleteById(id);
    }


}
