package com.rctrodrigo.loan_calculator_api.service;

import org.springframework.stereotype.Service;

/**
 * @author raven
 * @project loan-calculator-api
 * @created October 01, 2025
 */
public interface LoanCalculatorServiceImpl {
    double calculateMonthlyInterestRate(double annualInterestRate);
    double calculateMonthlyPayment(double annualInterestRate, int numberOfYears, double loanAmount);
}
