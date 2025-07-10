package com.khojBackendNew.khojJavaBackend.controller;

import com.khojBackendNew.khojJavaBackend.ModelClass.Skills;
import com.khojBackendNew.khojJavaBackend.Service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
    private final SkillsService skillsService;

    @Autowired
    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping
    public List<Skills> getAllSkills() {
        return skillsService.getAllSkills();
    }

    @GetMapping("/{id}")
    public Skills getSkillById(@PathVariable int id) {
        return skillsService.getSkillById(id);
    }

    @PostMapping
    public Skills saveSkill(@RequestBody Skills skill) {
        return skillsService.saveSkill(skill);
    }

    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable int id) {
        skillsService.deleteSkill(id);
    }
}
