package com.khojBackendNew.khojJavaBackend.controller;

import com.khojBackendNew.khojJavaBackend.ModelClass.Industries;
import com.khojBackendNew.khojJavaBackend.Service.IndustriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/industries")
public class IndustriesController {
    private final IndustriesService industriesService;

    @Autowired
    public IndustriesController(IndustriesService industriesService) {
        this.industriesService = industriesService;
    }

    @GetMapping
    public List<Industries> getAllIndustries() {
        return industriesService.getAllIndustries();
    }

    @GetMapping("/{id}")
    public Industries getIndustryById(@PathVariable int id) {
        return industriesService.getIndustryById(id);
    }

    @PostMapping
    public Industries saveIndustry(@RequestBody Industries industry) {
        return industriesService.saveIndustry(industry);
    }

    @DeleteMapping("/{id}")
    public void deleteIndustry(@PathVariable int id) {
        industriesService.deleteIndustry(id);
    }
}