package com.example.dpr.api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.dpr.api.entity.Sravani_Accounts;
import com.example.dpr.api.service.Sravani_AccountsService;


@RestController
@RequestMapping("/api/sravaniaccounts")
public class Sravani_AccountsController {

    @Autowired
    private Sravani_AccountsService sravaniAccountsService;

    @PostMapping
    public ResponseEntity<Sravani_Accounts> createOrUpdateSravaniAccounts(@RequestBody Sravani_Accounts sravaniAccounts) {
    	System.out.println("HDFC :"+sravaniAccounts.getHdfc()+" ,KOTAK: "+sravaniAccounts.getKotak()+" ,STANDARD_CHARTERED :"+sravaniAccounts.getStandard_chartered());
        Sravani_Accounts savedSravaniAccounts = sravaniAccountsService.saveOrUpdateSravaniAccounts(sravaniAccounts);
        return ResponseEntity.ok(savedSravaniAccounts);
    }

    @GetMapping
    public ResponseEntity<List<Sravani_Accounts>> getAllSravaniAccounts() {
        List<Sravani_Accounts> sravaniAccountsList = sravaniAccountsService.getAllSravaniAccounts();
        return ResponseEntity.ok(sravaniAccountsList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sravani_Accounts> getSravaniAccountsById(@PathVariable Long id) {
        Optional<Sravani_Accounts> sravaniAccounts = sravaniAccountsService.getSravaniAccountsById(id);
        return sravaniAccounts.isPresent() ? ResponseEntity.ok(sravaniAccounts.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSravaniAccountsById(@PathVariable Long id) {
        sravaniAccountsService.deleteSravaniAccountsById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sravani_Accounts> updateSravaniAccounts(@PathVariable Long id, @RequestBody Sravani_Accounts updatedSravaniAccounts) {
        Sravani_Accounts updated = sravaniAccountsService.updateSravaniAccounts(id, updatedSravaniAccounts);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }
}
