package com.khojBackendNew.khojJavaBackend.ModelClass;

import jakarta.persistence.*;

@Entity
@Table(name = "industries")
public class Industries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

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
}
