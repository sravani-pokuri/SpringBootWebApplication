package com.example.dpr.api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.dpr.api.entity.InstantMudra;
import com.example.dpr.api.service.InstantMudraService;

@RestController
@RequestMapping("/api/instantmudra")
public class InstantMudraController {

    @Autowired
    private InstantMudraService instantMudraService;

    @PostMapping
    public ResponseEntity<InstantMudra> createOrUpdateInstantMudra(@RequestBody InstantMudra instantMudra) {
        InstantMudra savedInstantMudra = instantMudraService.saveOrUpdateInstantMudra(instantMudra);
        return ResponseEntity.ok(savedInstantMudra);
    }

    @GetMapping
    public ResponseEntity<List<InstantMudra>> getAllInstantMudra() {
        List<InstantMudra> instantMudraList = instantMudraService.getAllInstantMudra();
        return ResponseEntity.ok(instantMudraList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InstantMudra> getInstantMudraById(@PathVariable Long id) {
        Optional<InstantMudra> instantMudra = instantMudraService.getInstantMudraById(id);
        return instantMudra.isPresent() ? ResponseEntity.ok(instantMudra.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInstantMudraById(@PathVariable Long id) {
        instantMudraService.deleteInstantMudraById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<InstantMudra> updateInstantMudra(@PathVariable Long id, @RequestBody InstantMudra updatedInstantMudra) {
        InstantMudra updated = instantMudraService.updateInstantMudra(id, updatedInstantMudra);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }
}
