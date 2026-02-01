package com.example.PulseBoot.repository;

import com.example.PulseBoot.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
