package com.example.get_api.service.impl;

import com.example.get_api.bean.entity.EntityReg;
import com.example.get_api.bean.entity.PatientEntity;

import com.example.get_api.bean.response.PatientRegResponse;
import com.example.get_api.repository.PatientRepository;

import com.example.get_api.service.serviceinteface.PatientRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.Optional;

@Transactional
@Service
public class PatientRegServiceImpl implements PatientRegService {


    @Autowired
    private PatientRepository patientRepository;



    @Override
    public PatientEntity getPatientInformation( String pid){
        PatientEntity registeredPatient=new PatientEntity();
      registeredPatient=patientRepository.getPatients(pid);
        return registeredPatient;


    }


}
