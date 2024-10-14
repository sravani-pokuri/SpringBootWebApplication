package com.example.dpr.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dpr.api.entity.Sravani_Accounts;
import com.example.dpr.api.repository.Sravani_AccountsRepository;


@Service
public class Sravani_AccountsService {

    @Autowired
    private Sravani_AccountsRepository sravaniAccountsRepository;

    public Sravani_Accounts saveOrUpdateSravaniAccounts(Sravani_Accounts sravaniAccounts) {
        return sravaniAccountsRepository.save(sravaniAccounts);
    }

    public List<Sravani_Accounts> getAllSravaniAccounts() {
        return sravaniAccountsRepository.findAll();
    }

    public Optional<Sravani_Accounts> getSravaniAccountsById(Long id) {
        return sravaniAccountsRepository.findById(id);
    }

    public void deleteSravaniAccountsById(Long id) {
        sravaniAccountsRepository.deleteById(id);
    }

    public Sravani_Accounts updateSravaniAccounts(Long id, Sravani_Accounts updatedSravaniAccounts) {
        Optional<Sravani_Accounts> existingSravaniAccounts = sravaniAccountsRepository.findById(id);
        if (existingSravaniAccounts.isPresent()) {
            Sravani_Accounts accounts = existingSravaniAccounts.get();
            accounts.setHdfc(updatedSravaniAccounts.getHdfc());
            accounts.setKotak(updatedSravaniAccounts.getKotak());
            accounts.setStandard_chartered(updatedSravaniAccounts.getStandard_chartered());
            return sravaniAccountsRepository.save(accounts);
        }
        return null;
    }
}
