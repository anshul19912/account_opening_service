package com.example.account_opening_service.controller;

import com.example.account_opening_service.model.Account;
import com.example.account_opening_service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
public class AccountController {
    @Autowired
    AccountService service;

    @PostMapping("/addAccount")
    public Account addAccount(@Valid @RequestBody Account account){
        return service.addAccount(account);
    }

    @GetMapping("/getAccounts")
    public List<Account> getAccounts(){
        return service.getAccounts();
    }

    @DeleteMapping("/deleteAccount/{id}")
    public String deleteAccount(@PathVariable long id){
        return service.deleteAccount(id);
    }

    @PutMapping("/updateAccount/{email}/{id}")
    public String updateEmail(@PathVariable String email, @PathVariable long id){
        return service.updateEmail(email,id);
    }

}
