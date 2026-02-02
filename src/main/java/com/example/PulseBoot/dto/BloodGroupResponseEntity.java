package com.example.PulseBoot.dto;

import com.example.PulseBoot.entity.type.BloodGroupType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BloodGroupResponseEntity {
    private BloodGroupType bloodGroupType;
    private Long count;
}
