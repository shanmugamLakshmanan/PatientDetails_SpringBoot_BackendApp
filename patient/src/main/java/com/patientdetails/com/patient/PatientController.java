package com.patientdetails.com.patient;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.patientdetails.com.Patient;
import com.patientdetails.com.PatientService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PatientController {

	@Autowired
	private PatientService pserivce;

	@GetMapping("/findAllPatient")
	public Iterable<Patient> findall() {
		

			return pserivce.findAll();

		
	}
	
	@GetMapping("/findsinglePatient/{id}")
	public Patient findbyId(@PathVariable int  id) {
	

			return pserivce.findbyId(id);

	
		

	}
	
	  @PutMapping("/updatePatient/{patient}") 
	  public ResponseEntity<Patient> update(@RequestBody Patient pat) {
	 
	   Patient patient = pserivce.update(pat);
	  
	  return new ResponseEntity<Patient>(pat, HttpStatus.OK);
	 
	}
	  
	  
	  
	     @PostMapping("/addnewpatient") public ResponseEntity<Patient> Addnew(@RequestBody Patient pat)
	     {
	    	 System.out.println("enterrrrr"); Patient
		  Addedpatient = pserivce.update(pat); URI uri =
		  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand
		  (Addedpatient.getId()) .toUri();
		  
		  return ResponseEntity.created(uri).build();
		  
		  }
		  
	     
	     @DeleteMapping("/deletePateint/{id}") 
	     public ResponseEntity<Void> DeletepatientbyId(@PathVariable int id)
	     {
		 System.out.println("eneter inside delete"); 
	      pserivce.deletePatient(id);
		 return new  ResponseEntity<Void>(HttpStatus.OK);
		
	     }
	
	/*
	 * @GetMapping("/findPateint/{id}") public Patient findpatientbyId(@PathVariable
	 * int id) { System.out.println("fuind " + id); Patient P =
	 * pserivce.findpatientbyId(id); if (P != null) { return P; } return P;
	 * 
	 * }
	 * 
	 * @PutMapping("/updatePatient") public ResponseEntity<Patient>
	 * update(@RequestBody Patient pat) {
	 * 
	 * Patient patient = pserivce.update(pat);
	 * 
	 * return new ResponseEntity<Patient>(pat, HttpStatus.OK);
	 * 
	 * }
	 * 
	 * @PostMapping("/addnewpatient") public ResponseEntity<Patient>
	 * Addnew(@RequestBody Patient pat) { System.out.println("enterrrrr"); Patient
	 * Addedpatient = pserivce.(pat); URI uri =
	 * ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand
	 * (Addedpatient.getId()) .toUri();
	 * 
	 * return ResponseEntity.created(uri).build();
	 * 
	 * }
	 * 
	 * @DeleteMapping("/deletePateint/{id}") public List<Patient>
	 * DeletepatientbyId(@PathVariable int id) {
	 * System.out.println("eneter inside delete"); List<Patient> pList =
	 * pserivce.delete(id); if (pList != null) { return pList; } return pList;
	 * 
	 * }
	 */
}
