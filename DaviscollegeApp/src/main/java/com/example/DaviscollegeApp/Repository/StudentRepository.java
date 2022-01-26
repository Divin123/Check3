package com.example.DaviscollegeApp.Repository;

import com.example.DaviscollegeApp.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
}
