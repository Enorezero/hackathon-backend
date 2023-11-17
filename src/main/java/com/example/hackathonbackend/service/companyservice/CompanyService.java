package com.example.hackathonbackend.service.companyservice;

import com.example.hackathonbackend.model.BaseInfo;
import com.example.hackathonbackend.model.Company;
import com.example.hackathonbackend.model.Internship;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    void addCompany(Company company);
    void addCompanyByBaseInfo(BaseInfo baseInfo);

    void updateCompany(String id, Company company);
    Optional<Company> getCompany(String id);
    List<Company> getAllCompanies();
    void deleteCompany(String id);

   void addInternshipByCompany(String companyId, Internship internship);
   void deleteInternshipByCompany(String companyId, String InternshipId);




}
