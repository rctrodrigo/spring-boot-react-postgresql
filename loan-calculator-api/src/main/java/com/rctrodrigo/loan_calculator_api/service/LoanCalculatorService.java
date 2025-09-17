package com.rctrodrigo.loan_calculator_api.service;

import org.springframework.stereotype.Service;

/**
 * @author Raven Carlos T. Rodrigo
 * @project Loan Calculator Web Application
 * @created September 17, 2025
 */

@Service
public interface LoanCalculatorService {
    public double obtainMonthlyInterestRate(double annualInterestRate);
}
