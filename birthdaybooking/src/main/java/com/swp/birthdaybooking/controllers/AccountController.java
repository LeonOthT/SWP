package com.swp.birthdaybooking.controllers;


import com.swp.birthdaybooking.entities.Account;
import com.swp.birthdaybooking.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/account")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.findAll();
    }

    @PostMapping
    public void addNewAccount(@RequestBody Account account){
        accountService.addNewAccount(account);
    }
}
