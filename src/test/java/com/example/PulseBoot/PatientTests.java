package com.example.PulseBoot;

import com.example.PulseBoot.entity.Patient;
import com.example.PulseBoot.repository.PatientRepository;
import com.example.PulseBoot.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTests {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository(){
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }

    @Test
    public void testTransactionMethods(){
//        Patient patient = patientService.getPatientById(1L);
//        System.out.println(patient);

        List<Patient>patientList = patientRepository.findByBirthDateOrEmail(
                LocalDate.of(1988, 3, 15),
                "neha.iyer@example.com"
        );
        for(Patient patient : patientList){
            System.out.println(patient);
        }
    }
}
