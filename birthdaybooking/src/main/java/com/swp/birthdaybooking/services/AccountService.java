package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.Account;
import com.swp.birthdaybooking.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> findAll(){
        return accountRepository.findAll();
    }

}
