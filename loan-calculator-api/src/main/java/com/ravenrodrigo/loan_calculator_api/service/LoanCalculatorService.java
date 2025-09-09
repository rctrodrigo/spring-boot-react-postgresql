package com.ravenrodrigo.loan_calculator_api.service;

import org.springframework.stereotype.Service;

/**
 * @author raven
 * @project loan-calculator-api
 * @created September 09, 2025
 */
@Service
public interface LoanCalculatorService {

    double obtainMonthlyInterestRate(double annualInterestRate);
    double calculateMonthlyPayment(double annualInterestRate, int numberOfYears, double loanAmount);
}
