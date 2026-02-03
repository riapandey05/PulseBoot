package com.example.PulseBoot.entity;

import com.example.PulseBoot.entity.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
@Table(
        name = "patient",
        uniqueConstraints = {
//                @UniqueConstraint(name = "unique_patient_email", columnNames = {"email"}),
                @UniqueConstraint(name = "unique_patient_name_birthdate", columnNames = {"name", "birthDate"})
        },
        indexes = {
                @Index(name = "idx_patient_birth_date", columnList = "birthDate")
        }
)

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 40)
    private String name;

//    @Column(name = "birth_date")
    private LocalDate birthDate;

    private String email;
    private String gender;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;

    @OneToOne
    @JoinColumn(name = "patient_insurance_id")
    private Insurance insurance;
//    owning side (it is important to define owning side otherwise there will be no single source of truth)

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
}
