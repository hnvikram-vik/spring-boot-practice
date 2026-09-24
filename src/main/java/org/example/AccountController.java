package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/balance")
    public double getBalance() {

        return accountService.getBalance();
    }

    @PostMapping("/deposit")
    public String deposite(@RequestBody TransactionRequest request) {

        accountService.deposite(request.getAmount());

        return "₹" + request.getAmount() + " deposited successfully";
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestBody TransactionRequest request) {

        boolean success =
                accountService.withdraw(request.getAmount());

        if (success) {
            return "₹" + request.getAmount() + " withdrawn successfully";
        }

        return "Insufficient balance";
    }
}