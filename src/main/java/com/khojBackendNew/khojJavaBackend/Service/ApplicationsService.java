package com.khojBackendNew.khojJavaBackend.Service;

import com.khojBackendNew.khojJavaBackend.Dao.ApplicationsRepository;
import com.khojBackendNew.khojJavaBackend.ModelClass.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationsService {
    private final ApplicationsRepository applicationsRepository;

    @Autowired
    public ApplicationsService(ApplicationsRepository applicationsRepository) {
        this.applicationsRepository = applicationsRepository;
    }

    public List<Applications> getAllApplications() {
        return applicationsRepository.findAll();
    }

    public Applications getApplicationById(int id) {
        return applicationsRepository.findById(id).orElse(null);
    }

    public Applications saveApplication(Applications application) {
        return applicationsRepository.save(application);
    }

    public void deleteApplication(int id) {
        applicationsRepository.deleteById(id);
    }
}