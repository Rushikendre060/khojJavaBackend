package com.khojBackendNew.khojJavaBackend.Dao;


import com.khojBackendNew.khojJavaBackend.ModelClass.Applications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationsRepository extends JpaRepository<Applications, Integer> {
}