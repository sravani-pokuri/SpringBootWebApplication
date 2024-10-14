package com.example.dpr.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dpr.api.entity.Yogi_Accounts;
import com.example.dpr.api.repository.Yogi_AccountsRepository;

@Service
public class Yogi_AccountsService {

    @Autowired
    private Yogi_AccountsRepository yogiAccountsRepository;

    public Yogi_Accounts saveOrUpdateYogiAccounts(Yogi_Accounts yogiAccounts) {
        return yogiAccountsRepository.save(yogiAccounts);
    }

    public List<Yogi_Accounts> getAllYogiAccounts() {
        return yogiAccountsRepository.findAll();
    }

    public Optional<Yogi_Accounts> getYogiAccountsById(Long id) {
        return yogiAccountsRepository.findById(id);
    }

    public void deleteYogiAccountsById(Long id) {
        yogiAccountsRepository.deleteById(id);
    }

    public Yogi_Accounts updateYogiAccounts(Long id, Yogi_Accounts updatedYogiAccounts) {
        Optional<Yogi_Accounts> existingYogiAccounts = yogiAccountsRepository.findById(id);
        if (existingYogiAccounts.isPresent()) {
            Yogi_Accounts accounts = existingYogiAccounts.get();
            accounts.setIcic(updatedYogiAccounts.getIcic());
            accounts.setSbi(updatedYogiAccounts.getSbi());
            accounts.setHdfc(updatedYogiAccounts.getHdfc());
            return yogiAccountsRepository.save(accounts);
        }
        return null;
    }
}
