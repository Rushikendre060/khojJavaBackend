package com.khojBackendNew.khojJavaBackend.Service;

import com.khojBackendNew.khojJavaBackend.Dao.CompaniesRepository;
import com.khojBackendNew.khojJavaBackend.ModelClass.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompaniesService {
    private final CompaniesRepository companiesRepository;

    @Autowired
    public CompaniesService(CompaniesRepository companiesRepository) {
        this.companiesRepository = companiesRepository;
    }

    public List<Companies> getAllCompanies() {
        return companiesRepository.findAll();
    }

    public Companies getCompanyById(int id) {
        return companiesRepository.findById(id).orElse(null);
    }

    public Companies saveCompany(Companies company) {
        return companiesRepository.save(company);
    }

    public void deleteCompany(int id) {
        companiesRepository.deleteById(id);
    }
}
