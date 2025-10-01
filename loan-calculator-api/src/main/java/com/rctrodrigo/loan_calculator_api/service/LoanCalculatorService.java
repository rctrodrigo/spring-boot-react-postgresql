package com.rctrodrigo.loan_calculator_api.service;

import org.springframework.stereotype.Service;

/**
 * @author raven
 * @project loan-calculator-api
 * @created October 01, 2025
 */
@Service
public class LoanCalculatorService implements LoanCalculatorServiceImpl {

    @Override
    public double calculateMonthlyInterestRate(double annualInterestRate) {
        return annualInterestRate / 1200;
    }
}
