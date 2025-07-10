package com.khojBackendNew.khojJavaBackend.Service;

import com.khojBackendNew.khojJavaBackend.Dao.JobSkillsRepository;
import com.khojBackendNew.khojJavaBackend.ModelClass.JobSkills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSkillsService {
    private final JobSkillsRepository jobSkillsRepository;

    @Autowired
    public JobSkillsService(JobSkillsRepository jobSkillsRepository) {
        this.jobSkillsRepository = jobSkillsRepository;
    }

    public List<JobSkills> getAllJobSkills() {
        return jobSkillsRepository.findAll();
    }

    public JobSkills getJobSkillById(int id) {
        return jobSkillsRepository.findById(id).orElse(null);
    }

    public JobSkills saveJobSkill(JobSkills jobSkill) {
        return jobSkillsRepository.save(jobSkill);
    }

    public void deleteJobSkill(int id) {
        jobSkillsRepository.deleteById(id);
    }
}
