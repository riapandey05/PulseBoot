package com.example.PulseBoot.service;

import com.example.PulseBoot.entity.Patient;
import com.example.PulseBoot.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    @Transactional
    public Patient getPatientById(Long id){
        Patient p1 = patientRepository.findById(id).orElseThrow();
        Patient p2 = patientRepository.findById(id).orElseThrow();

        p1.setName("Yoyo");
        return p1;
//        this annotation saves the transaction is it completes otherwise rolls back
//        also ab ye sara data humare persistencecontext me bhi jaega
    }
}
//enititymanager kya hai