package com.example.relationship.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.relationship.entities.Passport;
import com.example.relationship.entities.Person;
import com.example.relationship.service.PersonService;


@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    public ResponseEntity<Person> createPersonWithPassport(@RequestBody Person person) {
        Passport passport = person.getPassport();
        if (passport == null || passport.getPassport_number() == null) {
            return ResponseEntity.badRequest().body(null);  // Return bad request if passport number is null
        }

        Person createdPerson = personService.createPersonWithPassport(person, passport);
        return ResponseEntity.ok(createdPerson);
    }
}
