package com.example.hackathonbackend.service.companyservice;

import com.example.hackathonbackend.model.BaseInfo;
import com.example.hackathonbackend.model.Company;
import com.example.hackathonbackend.repository.CompanyRepository;
import com.example.hackathonbackend.repository.InternshipRepository;
import com.example.hackathonbackend.service.companyservice.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public void addCompanyByBaseInfo(BaseInfo baseInfo) {
        Company company = new Company();
        company.setInfo(baseInfo);
        companyRepository.save(company);
    }

    @Override
    public void updateCompany(String id, Company company) {
        Optional<Company> foundedCompany = companyRepository.findById(id);
        Company _foundedCompany = foundedCompany.get();
        _foundedCompany.setInfo(company.getInfo());
        _foundedCompany.setOrganization(company.getOrganization());
        _foundedCompany.setInternships(company.getInternships());
        _foundedCompany.setRating(company.getRating());
        companyRepository.save(_foundedCompany);
    }

    @Override
    public void addCompany(Company company) {

        companyRepository.save(company);
    }

    @Override
    public Optional<Company> getCompany(String id) {
        return companyRepository.findById(id);

    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public void deleteCompany(String id) {
        companyRepository.deleteById(id);
    }


}
