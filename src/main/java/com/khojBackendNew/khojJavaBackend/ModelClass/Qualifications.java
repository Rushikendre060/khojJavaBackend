package com.khojBackendNew.khojJavaBackend.ModelClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Qualifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String degree;
    private String specialization;
    private String institution;

    public int getId() {
        return id;
    }

    public void setId(int idValue) {
        this.id = idValue;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String newDegree) {
        this.degree = newDegree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String newSpecialization) {
        this.specialization = newSpecialization;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String newInstitution) {
        this.institution = newInstitution;
    }
}