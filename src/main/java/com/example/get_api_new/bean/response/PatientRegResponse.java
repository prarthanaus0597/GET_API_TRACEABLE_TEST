package com.example.get_api.bean.response;

import java.math.BigInteger;

public class PatientRegResponse {
    private String pid;
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "pid")

    private String name;
    private String uniqueid;
    private String dob;
    private int age;
    private String gender;
    private BigInteger phone;
    private String address;
    private String email;
    private Boolean minor_incapacitated;
    private Boolean disabled;
    private Boolean haswebappaccess;


}
