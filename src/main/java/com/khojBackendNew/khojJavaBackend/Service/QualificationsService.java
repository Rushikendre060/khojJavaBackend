package com.khojBackendNew.khojJavaBackend.Service;

import com.khojBackendNew.khojJavaBackend.Dao.QualificationsRepository;
import com.khojBackendNew.khojJavaBackend.ModelClass.Qualifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QualificationsService {
    private final QualificationsRepository qualificationsRepository;

    @Autowired
    public QualificationsService(QualificationsRepository qualificationsRepository) {
        this.qualificationsRepository = qualificationsRepository;
    }

    public List<Qualifications> getAllQualifications() {
        return qualificationsRepository.findAll();
    }

    public Qualifications getQualificationById(int id) {
        return qualificationsRepository.findById(id).orElse(null);
    }

    public Qualifications saveQualification(Qualifications qualification) {
        return qualificationsRepository.save(qualification);
    }

    public void deleteQualification(int id) {
        qualificationsRepository.deleteById(id);
    }
}