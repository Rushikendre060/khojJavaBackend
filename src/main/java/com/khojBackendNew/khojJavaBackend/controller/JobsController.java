package com.khojBackendNew.khojJavaBackend.controller;

import com.khojBackendNew.khojJavaBackend.ModelClass.Jobs;
import com.khojBackendNew.khojJavaBackend.Service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
    private final JobsService jobsService;

    @Autowired
    public JobsController(JobsService jobsService) {
        this.jobsService = jobsService;
    }

    @GetMapping
    public List<Jobs> getAllJobs() {
        return jobsService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Jobs getJobById(@PathVariable int id) {
        return jobsService.getJobById(id);
    }

    @PostMapping
    public Jobs saveJob(@RequestBody Jobs job) {
        return jobsService.saveJob(job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable int id) {
        jobsService.deleteJob(id);
    }
}
