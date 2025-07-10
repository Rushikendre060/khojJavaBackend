package com.khojBackendNew.khojJavaBackend.Service;

import com.khojBackendNew.khojJavaBackend.Dao.IndustriesRepository;
import com.khojBackendNew.khojJavaBackend.ModelClass.Industries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IndustriesService {
    private final IndustriesRepository industriesRepository;

    @Autowired
    public IndustriesService(IndustriesRepository industriesRepository) {
        this.industriesRepository = industriesRepository;
    }

    public List<Industries> getAllIndustries() {
        return industriesRepository.findAll();
    }

    public Industries getIndustryById(int id) {
        return industriesRepository.findById(id).orElse(null);
    }

    public Industries saveIndustry(Industries industry) {
        return industriesRepository.save(industry);
    }

    public void deleteIndustry(int id) {
        industriesRepository.deleteById(id);
    }
}
