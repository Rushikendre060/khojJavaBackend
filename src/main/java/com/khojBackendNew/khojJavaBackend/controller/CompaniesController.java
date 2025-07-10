package com.khojBackendNew.khojJavaBackend.controller;

import com.khojBackendNew.khojJavaBackend.ModelClass.Companies;
import com.khojBackendNew.khojJavaBackend.Service.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {
    private final CompaniesService companiesService;

    @Autowired
    public CompaniesController(CompaniesService companiesService) {
        this.companiesService = companiesService;
    }

    @GetMapping
    public List<Companies> getAllCompanies() {
        return companiesService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public Companies getCompanyById(@PathVariable int id) {
        return companiesService.getCompanyById(id);
    }

    @PostMapping
    public Companies saveCompany(@RequestBody Companies company) {
        return companiesService.saveCompany(company);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable int id) {
        companiesService.deleteCompany(id);
    }
}
