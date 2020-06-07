package com.patientdetails.com.patient;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "*")
public class AuthenticationController {

	
	 @GetMapping(path="/greeting/{name}")
	 public Authenticationbean gname(@PathVariable String name ) {
		 System.out.println("hey welcome"+name);
			return new Authenticationbean(name);
		}

	@GetMapping(path = "/basicauth")
    public Authenticationbean authenticate() {
        //throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
        return new Authenticationbean("You are authenticated");
    }  
	
}
