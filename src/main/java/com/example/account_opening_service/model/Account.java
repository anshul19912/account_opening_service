package com.example.account_opening_service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Entity
public class Account {

    @Id
        @GeneratedValue
        int account_number;

    @Pattern(regexp = "^[a-zA-Z\\s]*$", message = "Name should not contain any numbers")
   private String name;

    @Pattern(
            regexp = "^[A-Z]{5}[0-9]{4}[A-Z]$",
            message = "PAN number must be in format: 5 uppercase letters, 4 digits, 1 uppercase letter"
    )
    private String pan_number;
    private String tax_id_num;

    @Email(message = "Invalid email format")
    private String email;
    private String current_address;
    private String permanent_address;
    private LocalDate dateOfBirth;
    @Pattern(
            regexp = "^[0-9]{10}$",
            message = "Phone number must be 10 digits"
    )
    private String phoneNumber;


    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPan_number() {
        return pan_number;
    }

    public void setPan_number(String pan_number) {
        this.pan_number = pan_number;
    }

    public String getTax_id_num() {
        return tax_id_num;
    }

    public void setTax_id_num(String tax_id_num) {
        this.tax_id_num = tax_id_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrent_address() {
        return current_address;
    }

    public void setCurrent_address(String current_address) {
        this.current_address = current_address;
    }

    public String getPermanent_address() {
        return permanent_address;
    }

    public void setPermanent_address(String permanent_address) {
        this.permanent_address = permanent_address;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account(){}

    public Account(int account_number, String name, String pan_number, String tax_idNum, String email, String currentAddress, String permanentAddress) {
        this.account_number = account_number;
        this.name = name;
        this.pan_number = pan_number;
        this.tax_id_num = tax_idNum;
        this.email = email;
        this.current_address = currentAddress;
        this.permanent_address = permanentAddress;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }


}
