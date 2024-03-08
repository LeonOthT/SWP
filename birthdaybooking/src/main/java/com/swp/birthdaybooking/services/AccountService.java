package com.swp.birthdaybooking.services;

import com.swp.birthdaybooking.entities.Account;
import com.swp.birthdaybooking.repositories.AccountRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    /**
     *
     * @return "a List object containing accounts"
     */
    public List<Account> findAll(){
        return accountRepository.findAll();
    }


    /**
     *
     * @param account Account object
     */
    public void addNewAccount(Account account){
        Optional<Account> result = accountRepository.findAccountByEmail(account.getEmail());
        if (result.isPresent()){
            throw new IllegalStateException("Username already exists");
        }
        accountRepository.save(account);
        System.out.println(account);
    }

    public void deleteAccount(Account account){
        accountRepository.delete(account);
    }

}
