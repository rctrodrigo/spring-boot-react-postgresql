package com.rctrodrigo.loan_calculator_api.service.implementation;

import com.rctrodrigo.loan_calculator_api.service.LoanCalculatorService;
import org.springframework.stereotype.Service;

/**
 * @author Raven Carlos T. Rodrigo
 * @project Loan Calculator Web Application
 * @created September 17, 2025
 */

@Service
public class LoanCalculatorServiceImpl implements LoanCalculatorService {

    @Override
    public double obtainMonthlyInterestRate(double annualInterestRate) {
       return annualInterestRate / 1200;
    }
}
