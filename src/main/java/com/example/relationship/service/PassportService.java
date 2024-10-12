package com.example.relationship.service;

import com.example.relationship.entities.Passport;
import com.example.relationship.repositories.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PassportService {

    @Autowired
    private PassportRepository passportRepository;

    public Passport createPassport(Passport passport) {
        return passportRepository.save(passport);
    }

    public List<Passport> getAllPassports() {
        return passportRepository.findAll();
    }

    public Passport getPassportById(Long id) {
        Optional<Passport> passport = passportRepository.findById(id);
        return passport.orElse(null); // Handle null case
    }

    public Passport updatePassport(Long id, Passport passport) {
        Optional<Passport> existingPassport = passportRepository.findById(id);
        if (existingPassport.isPresent()) {
            passport.setId(id);
            return passportRepository.save(passport);
        }
        return null; // Handle not found case
    }

    public void deletePassport(Long id) {
        passportRepository.deleteById(id);
    }
}
