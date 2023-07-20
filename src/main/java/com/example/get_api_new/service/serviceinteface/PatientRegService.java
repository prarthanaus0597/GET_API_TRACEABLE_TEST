package com.example.get_api.service.serviceinteface;

import com.example.get_api.bean.entity.PatientEntity;
import com.example.get_api.bean.response.PatientRegResponse;

public interface PatientRegService {
    public PatientEntity getPatientInformation(String pid);


}
