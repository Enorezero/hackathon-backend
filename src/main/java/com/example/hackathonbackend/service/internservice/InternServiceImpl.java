package com.example.hackathonbackend.service.internservice;

import com.example.hackathonbackend.model.BaseInfo;
import com.example.hackathonbackend.model.Intern;
import com.example.hackathonbackend.repository.InternRepository;
import com.example.hackathonbackend.service.internservice.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternServiceImpl implements InternService {

    @Autowired
    InternRepository internRepository;
    @Override
    public void addInternByBase(BaseInfo baseInfo) {
        Intern intern = new Intern();
        intern.setInfo(baseInfo);
        internRepository.save(intern);
    }

    @Override
    public void addIntern(Intern intern) {
        internRepository.save(intern);
    }

    @Override
    public void updateIntern(String id, Intern intern) {
        Optional<Intern> foundedIntern = internRepository.findById(id);
        Intern _foundedIntern = foundedIntern.get();
        _foundedIntern.setInfo(intern.getInfo());
        _foundedIntern.setSex(intern.getSex());
        _foundedIntern.setAge(intern.getAge());
        _foundedIntern.setInternships(intern.getInternships());
        _foundedIntern.setPosition(intern.getPosition());
        _foundedIntern.setPreferences(intern.getPreferences());
        _foundedIntern.setSkills(intern.getSkills());
        _foundedIntern.setSpeciality(intern.getSpeciality());
        internRepository.save(_foundedIntern);
    }

    @Override
    public Optional<Intern> getIntern(String id) {
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
