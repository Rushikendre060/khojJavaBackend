package com.khojBackendNew.khojJavaBackend.Dao;


import com.khojBackendNew.khojJavaBackend.ModelClass.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<Jobs, Integer> {
}