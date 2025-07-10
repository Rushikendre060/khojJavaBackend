package com.khojBackendNew.khojJavaBackend.Service;

import com.khojBackendNew.khojJavaBackend.Dao.JobsRepository;
import com.khojBackendNew.khojJavaBackend.ModelClass.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobsService {
    private final JobsRepository jobsRepository;

    @Autowired
    public JobsService(JobsRepository jobsRepository) {
        this.jobsRepository = jobsRepository;
    }

    public List<Jobs> getAllJobs() {
        return jobsRepository.findAll();
    }

    public Jobs getJobById(int id) {
        return jobsRepository.findById(id).orElse(null);
    }

    public Jobs saveJob(Jobs job) {
        return jobsRepository.save(job);
    }

    public void deleteJob(int id) {
        jobsRepository.deleteById(id);
    }
}