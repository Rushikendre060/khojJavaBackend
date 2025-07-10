package com.khojBackendNew.khojJavaBackend.Service;

import com.khojBackendNew.khojJavaBackend.Dao.SkillsRepository;
import com.khojBackendNew.khojJavaBackend.ModelClass.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillsService {
    private final SkillsRepository skillsRepository;

    @Autowired
    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    public List<Skills> getAllSkills() {
        return skillsRepository.findAll();
    }

    public Skills getSkillById(int id) {
        return skillsRepository.findById(id).orElse(null);
    }

    public Skills saveSkill(Skills skill) {
        return skillsRepository.save(skill);
    }

    public void deleteSkill(int id) {
        skillsRepository.deleteById(id);
    }
}
