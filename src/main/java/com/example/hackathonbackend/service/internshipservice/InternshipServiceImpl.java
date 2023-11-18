package com.example.hackathonbackend.service.internshipservice;

import com.example.hackathonbackend.model.Internship;
import com.example.hackathonbackend.repository.CompanyRepository;
import com.example.hackathonbackend.repository.InternshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternshipServiceImpl implements InternshipService{

    @Autowired
    InternshipRepository internshipRepository;

    @Autowired
    CompanyRepository companyRepository;
    public void addInternship(Internship internship){
        internshipRepository.save(internship);
    }

    public void updateInternship(String id, Internship internship){
        Optional<Internship> foundedInternship = internshipRepository.findById(id);
        Internship _foundedInternship = foundedInternship.get();
        _foundedInternship.setName(internship.getName());
        _foundedInternship.setDescription(internship.getDescription());
        _foundedInternship.setDuration(internship.getDuration());
        _foundedInternship.setPeople(internship.getPeople());
        _foundedInternship.setSalary(internship.getSalary());
        _foundedInternship.setInternshipType(internship.getInternshipType());
        _foundedInternship.setInternshipStatus(internship.getInternshipStatus());
        _foundedInternship.setImage(internship.getImage());
        _foundedInternship.setTeamLead(internship.getTeamLead());
        _foundedInternship.setImages(internship.getImages());
        _foundedInternship.setSpecialities(internship.getSpecialities());
        _foundedInternship.setReviews(internship.getReviews());
        internshipRepository.save(_foundedInternship);
    }
    public Optional<Internship> getInternship(String id){
        return internshipRepository.findById(id);
    }
    public List<Internship> getAllInternships(){
        return internshipRepository.findAll();
    }
    public void deleteInternship(String id){
        internshipRepository.deleteById(id);
    }
}
