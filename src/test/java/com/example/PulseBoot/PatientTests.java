package com.example.PulseBoot;

import com.example.PulseBoot.dto.BloodGroupResponseEntity;
import com.example.PulseBoot.entity.Patient;
import com.example.PulseBoot.entity.type.BloodGroupType;
import com.example.PulseBoot.repository.PatientRepository;
import com.example.PulseBoot.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.awt.print.Pageable;
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
//        List<Patient> patientList = patientRepository.findAll();
//        System.out.println(patientList);
    }

    @Test
    public void testTransactionMethods(){
//        Patient patient = patientService.getPatientById(1L);
//        System.out.println(patient);

//        List<Patient>patientList = patientRepository.findByBirthDateOrEmail(
//                LocalDate.of(1988, 3, 15),
//                "neha.iyer@example.com"
//        );

//        List<Patient>patientList = patientRepository.findByBloodGroup(BloodGroupType.A_POSITIVE);

//        List<Patient>patientList = patientRepository.findByBornAfterDate(LocalDate.of(1993,3,14));
//        for(Patient patient : patientList){
//            System.out.println(patient);
//        }

//        Patient patientList = patientRepository.findAllPatients();
//       for(Patient patient : patientList){
//           System.out.println(patient);
//        }

//        List<Object[]>bloodGroupList = patientRepository.countEachBloodGroupType();
//        for(Object[] objects: bloodGroupList){
//            System.out.println(objects[0]+" "+objects[1]);
//        }

//        int rowsUpdated = patientRepository.updateNameWithId("Arav Sharma", 1L);
//        System.out.println(rowsUpdated);

//                List<BloodGroupResponseEntity>bloodGroupList = patientRepository.countEachBloodGroupType();
//        for(BloodGroupResponseEntity bloodGroupResponseEntity: bloodGroupList){
//            System.out.println(bloodGroupResponseEntity);
//        }


//        Page<Patient> page = patientRepository.findAll(PageRequest.of(0, 2));
//
//        for (Patient p : page.getContent()) {
//            System.out.println(p);
//        }

    }
}
