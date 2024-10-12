package com.example.relationship.controllers;

import com.example.relationship.entities.Passport;
import com.example.relationship.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/passports")
public class PassportController {

    @Autowired
    private PassportService passportService;

    @PostMapping
    public ResponseEntity<Passport> createPassport(@RequestBody Passport passport) {
        Passport savedPassport = passportService.createPassport(passport);
        return ResponseEntity.ok(savedPassport);
    }

    @GetMapping
    public ResponseEntity<List<Passport>> getAllPassports() {
        List<Passport> passports = passportService.getAllPassports();
        return ResponseEntity.ok(passports);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Passport> getPassportById(@PathVariable Long id) {
        Passport passport = passportService.getPassportById(id);
        return ResponseEntity.ok(passport);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Passport> updatePassport(@PathVariable Long id, @RequestBody Passport passport) {
        Passport updatedPassport = passportService.updatePassport(id, passport);
        return ResponseEntity.ok(updatedPassport);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePassport(@PathVariable Long id) {
        passportService.deletePassport(id);
        return ResponseEntity.noContent().build();
    }
}
