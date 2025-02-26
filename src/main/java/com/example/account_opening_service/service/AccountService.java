package com.example.account_opening_service.service;

import com.example.account_opening_service.model.Account;
import com.example.account_opening_service.respository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository repository;

    public Account addAccount(Account account){
        return  repository.save(account);
    }

    public String deleteAccount(long id){
        repository.deleteById(id);
        return "Account deleted successfully";
    }

    public List<Account> getAccounts(){
        return repository.findAll();
    }



}
