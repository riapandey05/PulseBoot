package com.example.PulseBoot.repository;

import com.example.PulseBoot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}