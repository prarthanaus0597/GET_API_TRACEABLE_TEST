//package com.example.get_api.repository;
//
//import com.example.get_api.bean.entity.EntityReg;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository("entityRepository")
//public interface EntityRepository extends JpaRepository<EntityReg,String> {
//
////    @Query("select t.eid,t.ename,t.etype,t.eip,t.port from EntityReg  t join t.patientIds u where u.pid =:pid")
//@Query("select new com.example.get_api.bean.entity.EntityRes(t.eid,t.ename,t.etype,t.eip,t.port) from EntityReg  t join t.patientIds u where u.pid =:pid")
//    public List<EntityRe> getEntityById(@Param("pid") String pid);
//
//    @Query("select new com.example.get_api.bean.entity.EntityRes(t.eid,t.ename,t.etype,t.eip,t.port) from EntityReg  t  where " +
//            "t.eid IN :providerEids")
//    public List<EntityRes> getEntityByProviderIDs(@Param("providerEids") List<String> providerEids);
//
//

//    @Query("SELECT new com.example.dto.RecordDTO(r.record_id, r.provider_eid, c.cid) " +
//            "FROM ConsentedRecordIDs r " +
//            "JOIN r.clinic c " +
//            "WHERE r.provider_eid IN :providerEids")
//    List<RecordDTO> findCustomFieldsByProviderEids(List<String> providerEids);

//}
