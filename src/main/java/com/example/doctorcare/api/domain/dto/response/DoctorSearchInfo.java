package com.example.doctorcare.api.domain.dto.response;

import com.example.doctorcare.api.domain.dto.Services;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorSearchInfo {

    private Long hosId;

    private String hospName;

    private String specialist;

    private Long doctorId;

    private String doctorName;

    private List<Services> servicesList = new ArrayList<>();

    private List<TimeDoctor> timeDoctors = new ArrayList<>();

}
