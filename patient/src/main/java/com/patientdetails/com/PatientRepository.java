package com.patientdetails.com;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patientdetails.com.Patient;


@Repository
public interface  PatientRepository extends JpaRepository<Patient, Integer>{

	
}
