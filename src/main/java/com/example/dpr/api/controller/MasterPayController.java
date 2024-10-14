package com.example.dpr.api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.dpr.api.entity.Masterpay;
import com.example.dpr.api.service.MasterPayService;

@RestController
@RequestMapping("/api/masterpay")
public class MasterPayController {

    @Autowired
    private MasterPayService masterPayService;

    @PostMapping
    public ResponseEntity<Masterpay> createOrUpdateMasterPay(@RequestBody Masterpay masterPay) {
        Masterpay savedMasterPay = masterPayService.saveOrUpdateMasterPay(masterPay);
        return ResponseEntity.ok(savedMasterPay);
    }

    @GetMapping
    public ResponseEntity<List<Masterpay>> getAllMasterPay() {
        List<Masterpay> masterPayList = masterPayService.getAllMasterPay();
        return ResponseEntity.ok(masterPayList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Masterpay> getMasterPayById(@PathVariable Long id) {
        Optional<Masterpay> masterPay = masterPayService.getMasterPayById(id);
        return masterPay.isPresent() ? ResponseEntity.ok(masterPay.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMasterPayById(@PathVariable Long id) {
        masterPayService.deleteMasterPayById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Masterpay> updateMasterPay(@PathVariable Long id, @RequestBody Masterpay updatedMasterPay) {
        Masterpay updated = masterPayService.updateMasterPay(id, updatedMasterPay);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }
}
