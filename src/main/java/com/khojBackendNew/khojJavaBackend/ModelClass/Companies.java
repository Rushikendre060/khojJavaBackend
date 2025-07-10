package com.khojBackendNew.khojJavaBackend.ModelClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Companies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String industry;

    public int getId() {
        return id;
    }

    public void setId(int idValue) {
        this.id = idValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String newIndustry) {
        this.industry = newIndustry;
    }
}