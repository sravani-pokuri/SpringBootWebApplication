package com.example.dpr.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dpr.api.entity.InstantMudra;
import com.example.dpr.api.repository.InstantMudraRepository;

@Service
public class InstantMudraService {

    @Autowired
    private InstantMudraRepository instantMudraRepository;

    public InstantMudra saveOrUpdateInstantMudra(InstantMudra instantMudra) {
        return instantMudraRepository.save(instantMudra);
    }

    public List<InstantMudra> getAllInstantMudra() {
        return instantMudraRepository.findAll();
    }

    public Optional<InstantMudra> getInstantMudraById(Long id) {
        return instantMudraRepository.findById(id);
    }

    public void deleteInstantMudraById(Long id) {
        instantMudraRepository.deleteById(id);
    }

    public InstantMudra updateInstantMudra(Long id, InstantMudra updatedInstantMudra) {
        Optional<InstantMudra> existingMudra = instantMudraRepository.findById(id);
        if (existingMudra.isPresent()) {
            InstantMudra mudra = existingMudra.get();
            mudra.setPrepaid(updatedInstantMudra.getPrepaid());
            mudra.setPostpaid(updatedInstantMudra.getPostpaid());
            mudra.setPending(updatedInstantMudra.getPending());
            return instantMudraRepository.save(mudra);
        }
        return null;
    }
}
