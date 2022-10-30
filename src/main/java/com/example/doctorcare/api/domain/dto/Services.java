package com.example.doctorcare.api.domain.dto;

import com.example.doctorcare.api.domain.entity.HospitalCilinicEntity;
import com.example.doctorcare.api.enums.ServiceEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Services {

    private Long id;

    private String name;

    private String description;

    private Double price;

    @JsonIgnore
    private HospitalCilinic hospitalCilinic;
    @Enumerated(EnumType.STRING)
    private ServiceEnum serviceEnum;
}
