package com.meini.easybank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/myAccount")
    public String getMyAccountDetails() {
        return "Here are account details from the DB";
    }
}
