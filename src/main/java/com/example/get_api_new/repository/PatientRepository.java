package com.example.get_api.repository;


import com.example.get_api.bean.entity.PatientEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;


@Repository
public interface PatientRepository extends CrudRepository<PatientEntity,String> {


//    @Query("select  t from PatientEntity  t  where t.pid =:pid")
//    @Query("select t.pid,t.name,t.adhaar,t.dob,t.age,t.gender,t.phone,t.address,t.email,t.minor,t.disabled,t.iscapable from PatientEntity t  where t.pid =:pid")
//    public PatientDemographicsResponse getPatientDemographicsById(@Param("pid") String pid);
    @Query("select  t from PatientEntity  t  where t.pid =:pid")
    public PatientEntity getPatients(@Param("pid") String pid);
    @Query("select  t from PatientEntity  t  where t.guardian.pid =:pid")
    public List<PatientEntity> getMinors(@Param("pid") String pid);



}


