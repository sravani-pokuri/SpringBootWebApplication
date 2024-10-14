package com.example.dpr.api.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.dpr.api.entity.Imperia;
import com.example.dpr.api.service.ImperiaService;

@RestController
@RequestMapping("/api/imperia")
public class ImperiaController {

    @Autowired
    private ImperiaService imperiaService;

    @PostMapping
    public ResponseEntity<Imperia> createOrUpdateImperia(@RequestBody Imperia imperia) {
        Imperia savedImperia = imperiaService.saveOrUpdateImperia(imperia);
        return ResponseEntity.ok(savedImperia);
    }

    @GetMapping
    public ResponseEntity<List<Imperia>> getAllImperia() {
        List<Imperia> imperiaList = imperiaService.getAllImperia();
        return ResponseEntity.ok(imperiaList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Imperia> getImperiaById(@PathVariable Long id) {
        Optional<Imperia> imperia = imperiaService.getImperiaById(id);
        return imperia.isPresent() ? ResponseEntity.ok(imperia.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImperiaById(@PathVariable Long id) {
        imperiaService.deleteImperiaById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Imperia> updateImperia(@PathVariable Long id, @RequestBody Imperia updatedImperia) {
        Imperia updated = imperiaService.updateImperia(id, updatedImperia);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }
}
