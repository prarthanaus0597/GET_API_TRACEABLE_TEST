package com.example.get_api.controller;


import com.example.get_api.bean.entity.PatientEntity;
import com.example.get_api.bean.response.PatientRegResponse;
import com.example.get_api.service.serviceinteface.PatientRegService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(value = "/api/v1/patient")
public class PatientController {
    private final PatientRegService patientRegsvc;
    public PatientController( PatientRegService patientRegsvc) {
        this.patientRegsvc=patientRegsvc;
    }

    @GetMapping("/{pid}")
    public ResponseEntity getPateintWithId(@PathVariable String pid) {

        PatientEntity registeredPatient =patientRegsvc.getPatientInformation(pid);

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(registeredPatient);
    }



}

