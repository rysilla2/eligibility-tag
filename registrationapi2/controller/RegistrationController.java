package com.uap.it311l.registrationapi2.controller;

import com.uap.it311l.registrationapi2.model.Attendee;
import com.uap.it311l.registrationapi2.repository.RegistrationMybatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.uap.it311l.registrationapi.model.Attendee;

@RestController
public class RegistrationController {

	@Autowired
	RegistrationMybatisRepository registrationRepo;

	@PostMapping("event/register")
	public Attendee register(@RequestBody Attendee student) {
		System.out.println("Running register method");
//		student.setSurveyEligibilityTag(null);
		registrationRepo.insert(student);
		return student;
	}

//	@PutMapping("update/")

}
