package com.khojBackendNew.khojJavaBackend.Dao;

import com.khojBackendNew.khojJavaBackend.ModelClass.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}