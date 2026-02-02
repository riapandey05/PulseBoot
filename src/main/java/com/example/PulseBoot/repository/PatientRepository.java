package com.example.PulseBoot.repository;

import com.example.PulseBoot.dto.BloodGroupResponseEntity;
import com.example.PulseBoot.entity.Patient;
import com.example.PulseBoot.entity.type.BloodGroupType;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public interface PatientRepository extends JpaRepository<Patient,Long> {
        Patient findByName(String name);
        List<Patient> findByBirthDateOrEmail(LocalDate birthDate, String email);
        List<Patient>findByBirthDateBetween(LocalDate startDate,LocalDate endDate);

//        jpql.....P capital in Patient because we are in jpa and referring to entity

    @Query("select p from Patient p where p.bloodGroup =:bloodGroup")
    List<Patient>findByBloodGroup(@Param("bloodGroup") BloodGroupType bloodGroup);

    @Query("select p from Patient p where p.birthDate > :birthDate")
    List<Patient>findByBornAfterDate(@Param("birthDate") LocalDate birthDate);
//    It’s basically a placeholder that will be filled at runtime from your method argument.

    @Query(
            "SELECT new com.example.PulseBoot.dto.BloodGroupResponseEntity(" +
                    "p.bloodGroup, COUNT(p)) " +
                    "FROM Patient p " +
                    "GROUP BY p.bloodGroup"
    )
    List<BloodGroupResponseEntity> countEachBloodGroupType();



//    ab hum native queries likhenge to hume isko hibernate ko dekar convert krne ki zarurat nhi hai
//    ab Patient ka p small rhega kyuki entity nhi direct table ko refer krenge
//    @Query(value="select * from patient",nativeQuery = true)
//    Patient<Patient> findAllPatients();

    @Transactional
    @Modifying
    @Query("UPDATE Patient p SET p.name = :name where p.id = :id")
    int updateNameWithId(@Param("name") String name, @Param("id") Long id);


    Page<Patient> findAll(Pageable pageable);


}
