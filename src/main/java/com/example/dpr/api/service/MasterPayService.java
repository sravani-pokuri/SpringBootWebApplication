package com.example.dpr.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dpr.api.entity.Masterpay;
import com.example.dpr.api.repository.MasterPayRepository;

@Service
public class MasterPayService {

    @Autowired
    private MasterPayRepository masterPayRepository;

    public Masterpay saveOrUpdateMasterPay(Masterpay masterPay) {
        return masterPayRepository.save(masterPay);
    }

    public List<Masterpay> getAllMasterPay() {
        return masterPayRepository.findAll();
    }

    public Optional<Masterpay> getMasterPayById(Long id) {
        return masterPayRepository.findById(id);
    }

    public void deleteMasterPayById(Long id) {
        masterPayRepository.deleteById(id);
    }

    public Masterpay updateMasterPay(Long id, Masterpay updatedMasterPay) {
        Optional<Masterpay> existingMasterPay = masterPayRepository.findById(id);
        if (existingMasterPay.isPresent()) {
        	Masterpay pay = existingMasterPay.get();
            pay.setWallet(updatedMasterPay.getWallet());
            pay.setPending(updatedMasterPay.getPending());
            pay.setDistributer(updatedMasterPay.getDistributer());
            return masterPayRepository.save(pay);
        }
        return null;
    }
}
