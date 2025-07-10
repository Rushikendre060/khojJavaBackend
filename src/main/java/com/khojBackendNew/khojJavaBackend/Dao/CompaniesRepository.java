package com.khojBackendNew.khojJavaBackend.Dao;

import com.khojBackendNew.khojJavaBackend.ModelClass.Companies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompaniesRepository extends JpaRepository<Companies, Integer> {
}