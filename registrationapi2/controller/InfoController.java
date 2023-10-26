package com.uap.it311l.registrationapi2.controller;


import com.uap.it311l.registrationapi2.model.Attendee;
import com.uap.it311l.registrationapi2.repository.RegistrationMybatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class InfoController {

    @Autowired
    RegistrationMybatisRepository registrationRepo;
    @GetMapping("/attendees")
    ArrayList<Attendee> getAttendees() {
        System.out.println("getting attendees");
        for (Attendee a: registrationRepo.findAll()) {
            System.out.println(a.toString());
        }
        return registrationRepo.findAll();
    }

    @PutMapping("/event/survey/eligibility")
    public ArrayList<Attendee> updateTrue() {
        ArrayList<Attendee> list = registrationRepo.findAll();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setSurveyEligibilityTag(true);
            registrationRepo.updateTag(list.get(i));

        }
        return list;
    }

    @PutMapping("/event/survey/false")
    public void updateFalse() {
        ArrayList<Attendee> list = registrationRepo.findAll();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setSurveyEligibilityTag(false);
            registrationRepo.updateTag(list.get(i));
        }
    }

    @DeleteMapping("/event/registration/{id}")
    public void deleteAttendee(@PathVariable int id) {
        int attendeeId = id;
        registrationRepo.deleteAttendee(attendeeId);
    }
}
