package com.example.PulseBoot.repository;

import com.example.PulseBoot.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
        Patient findByName(String name);
        List<Patient> findByBirthDateOrEmail(LocalDate birthDate, String email);
        List<Patient>findByBirthDateBetween(LocalDate startDate,LocalDate endDate);

}
