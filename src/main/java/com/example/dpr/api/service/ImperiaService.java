package com.example.dpr.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dpr.api.entity.Imperia;
import com.example.dpr.api.repository.ImperiaRepository;

@Service
public class ImperiaService {

    @Autowired
    private ImperiaRepository imperiaRepository;

    public Imperia saveOrUpdateImperia(Imperia imperia) {
        return imperiaRepository.save(imperia);
    }

    public List<Imperia> getAllImperia() {
        return imperiaRepository.findAll();
    }

    public Optional<Imperia> getImperiaById(Long id) {
        return imperiaRepository.findById(id);
    }

    public void deleteImperiaById(Long id) {
        imperiaRepository.deleteById(id);
    }

    public Imperia updateImperia(Long id, Imperia updatedImperia) {
        Optional<Imperia> existingImperia = imperiaRepository.findById(id);
        if (existingImperia.isPresent()) {
            Imperia imp = existingImperia.get();
            imp.setWallet(updatedImperia.getWallet());
            imp.setPending(updatedImperia.getPending());
            imp.setDistributer(updatedImperia.getDistributer());
            return imperiaRepository.save(imp);
        }
        return null;
    }
}
