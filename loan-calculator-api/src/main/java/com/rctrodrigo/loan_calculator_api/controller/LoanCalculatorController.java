package com.rctrodrigo.loan_calculator_api.controller;

import com.rctrodrigo.loan_calculator_api.entity.LoanEntity;
import com.rctrodrigo.loan_calculator_api.service.LoanCalculatorService;
import com.rctrodrigo.loan_calculator_api.service.implementation.LoanCalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Raven Carlos T. Rodrigo
 * @project Loan Calculator Web Application
 * @created September 18, 2025
 */

@RestController
@RequestMapping("/")
public class LoanCalculatorController {
    private final LoanCalculatorService loanCalculatorService;

    public LoanCalculatorController(LoanCalculatorService loanCalculatorService) {
        this.loanCalculatorService = loanCalculatorService;
    }

    @GetMapping
    public double getCalculation(@RequestParam double annualInterestRate,
                                @RequestParam int numberOfYears,
                                @RequestParam double loanAmount) {
        return loanCalculatorService.calculateMonthlyPayment(annualInterestRate, numberOfYears, loanAmount);
    }
}
