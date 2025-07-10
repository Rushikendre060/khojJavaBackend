package com.khojBackendNew.khojJavaBackend.controller;

import com.khojBackendNew.khojJavaBackend.ModelClass.Applications;
import com.khojBackendNew.khojJavaBackend.Service.ApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationsController {
    private final ApplicationsService applicationsService;

    @Autowired
    public ApplicationsController(ApplicationsService applicationsService) {
        this.applicationsService = applicationsService;
    }

    @GetMapping
    public List<Applications> getAllApplications() {
        return applicationsService.getAllApplications();
    }

    @GetMapping("/{id}")
    public Applications getApplicationById(@PathVariable int id) {
        return applicationsService.getApplicationById(id);
    }

    @PostMapping
    public Applications saveApplication(@RequestBody Applications application) {
        return applicationsService.saveApplication(application);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable int id) {
        applicationsService.deleteApplication(id);
    }
}
