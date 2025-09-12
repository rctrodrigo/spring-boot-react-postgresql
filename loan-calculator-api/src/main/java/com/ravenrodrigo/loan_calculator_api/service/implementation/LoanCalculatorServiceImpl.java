package com.ravenrodrigo.loan_calculator_api.service.implementation;

import com.ravenrodrigo.loan_calculator_api.repository.LoanCalculationRepository;
import com.ravenrodrigo.loan_calculator_api.service.LoanCalculatorService;
import org.springframework.stereotype.Service;

/**
 * @author raven
 * @project loan-calculator-api
 * @created September 09, 2025
 */
@Service
public class LoanCalculatorServiceImpl implements LoanCalculatorService {

    private final LoanCalculationRepository loanCalculationRepository;

    public LoanCalculatorServiceImpl(LoanCalculationRepository loanCalculationRepository) {
        this.loanCalculationRepository = loanCalculationRepository;
    }

    @Override
    public double obtainMonthlyInterestRate(double annualInterestRate) {
        return annualInterestRate / 1200;
    }

    @Override
    public double calculateMonthlyPayment(double annualInterestRate, int numberOfYears, double loanAmount) {
        double monthlyInterestRate = obtainMonthlyInterestRate(annualInterestRate);
        return (int)(loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,
                numberOfYears * 12)) * 100) / 100.0;
    }

    @Override
    public double calculateTotalPayment(double annualInterestRate, int numberOfYears, double loanAmount) {
        double monthlyPayment = this.calculateMonthlyPayment(annualInterestRate, numberOfYears, loanAmount);
        return (int) (monthlyPayment * numberOfYears * 12 * 100) / 100.0;
    }
}
