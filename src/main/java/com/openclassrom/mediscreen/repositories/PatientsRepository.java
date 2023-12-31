package com.openclassrom.mediscreen.repositories;
import com.openclassrom.mediscreen.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PatientsRepository extends JpaRepository<Patient, Integer> {

    List<Patient> findByNom(String nom);

    @Query("SELECT p FROM Patient p WHERE p.id IN (:ids)")
    List<Patient> findByIdsIn(@Param("ids")List<Integer> ids);
}

