package com.example.dpr.api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.dpr.api.entity.Yogi_Accounts;
import com.example.dpr.api.service.Yogi_AccountsService;

@RestController
@RequestMapping("/api/yogiaccounts")
public class Yogi_AccountsController {

    @Autowired
    private Yogi_AccountsService yogiAccountsService;

    @PostMapping
    public ResponseEntity<Yogi_Accounts> createOrUpdateYogiAccounts(@RequestBody Yogi_Accounts yogiAccounts) {
    	 System.out.println("ICIC: " + yogiAccounts.getIcic() + ", SBI: " + yogiAccounts.getSbi() + ", HDFC: " + yogiAccounts.getHdfc());
        Yogi_Accounts savedYogiAccounts = yogiAccountsService.saveOrUpdateYogiAccounts(yogiAccounts);
        return ResponseEntity.ok(savedYogiAccounts);
    }
    

    @GetMapping
    public ResponseEntity<List<Yogi_Accounts>> getAllYogiAccounts() {
        List<Yogi_Accounts> yogiAccountsList = yogiAccountsService.getAllYogiAccounts();
        return ResponseEntity.ok(yogiAccountsList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Yogi_Accounts> getYogiAccountsById(@PathVariable Long id) {
        Optional<Yogi_Accounts> yogiAccounts = yogiAccountsService.getYogiAccountsById(id);
        return yogiAccounts.isPresent() ? ResponseEntity.ok(yogiAccounts.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteYogiAccountsById(@PathVariable Long id) {
        yogiAccountsService.deleteYogiAccountsById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Yogi_Accounts> updateYogiAccounts(@PathVariable Long id, @RequestBody Yogi_Accounts updatedYogiAccounts) {
    	System.out.println("ICIC : "+updatedYogiAccounts.getIcic()+" ,SBI :"+updatedYogiAccounts.getSbi()+" ,HDFC :"+updatedYogiAccounts.getHdfc());
        Yogi_Accounts updated = yogiAccountsService.updateYogiAccounts(id, updatedYogiAccounts);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }
}
