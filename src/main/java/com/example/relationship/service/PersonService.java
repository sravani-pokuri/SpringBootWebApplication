package com.example.relationship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.relationship.entities.Person;
import com.example.relationship.entities.Passport;
import com.example.relationship.repositories.PassportRepository;
import com.example.relationship.repositories.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PassportRepository passportRepository;

    public Person createPersonWithPassport(Person person, Passport passport) {
        // Save the passport first
        passportRepository.save(passport);

        // Associate the passport with the person
        person.setPassport(passport);

        // Save the person
        return personRepository.save(person);
    }
}
