package com.khojBackendNew.khojJavaBackend.controller;

import com.khojBackendNew.khojJavaBackend.ModelClass.Qualifications;
import com.khojBackendNew.khojJavaBackend.Service.QualificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/qualifications")
public class QualificationsController {
    private final QualificationsService qualificationsService;

    @Autowired
    public QualificationsController(QualificationsService qualificationsService) {
        this.qualificationsService = qualificationsService;
    }

    @GetMapping
    public List<Qualifications> getAllQualifications() {
        return qualificationsService.getAllQualifications();
    }

    @GetMapping("/{id}")
    public Qualifications getQualificationById(@PathVariable int id) {
        return qualificationsService.getQualificationById(id);
    }

    @PostMapping
    public Qualifications saveQualification(@RequestBody Qualifications qualification) {
        return qualificationsService.saveQualification(qualification);
    }

    @DeleteMapping("/{id}")
    public void deleteQualification(@PathVariable int id) {
        qualificationsService.deleteQualification(id);
    }
}
