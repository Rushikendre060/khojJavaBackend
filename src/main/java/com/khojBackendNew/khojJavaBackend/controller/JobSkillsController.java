package com.khojBackendNew.khojJavaBackend.controller;

import com.khojBackendNew.khojJavaBackend.ModelClass.JobSkills;
import com.khojBackendNew.khojJavaBackend.Service.JobSkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job-skills")
public class JobSkillsController {
    private final JobSkillsService jobSkillsService;

    @Autowired
    public JobSkillsController(JobSkillsService jobSkillsService) {
        this.jobSkillsService = jobSkillsService;
    }

    @GetMapping
    public List<JobSkills> getAllJobSkills() {
        return jobSkillsService.getAllJobSkills();
    }

    @GetMapping("/{id}")
    public JobSkills getJobSkillById(@PathVariable int id) {
        return jobSkillsService.getJobSkillById(id);
    }

    @PostMapping
    public JobSkills saveJobSkill(@RequestBody JobSkills jobSkill) {
        return jobSkillsService.saveJobSkill(jobSkill);
    }

    @DeleteMapping("/{id}")
    public void deleteJobSkill(@PathVariable int id) {
        jobSkillsService.deleteJobSkill(id);
    }
}