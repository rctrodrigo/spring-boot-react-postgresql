package com.rctrodrigo.loan_calculator_api.service;

import org.springframework.stereotype.Service;

/**
 * @author raven
 * @project loan-calculator-api
 * @created October 01, 2025
 */
@Service
public class LoanCalculatorService implements LoanCalculatorServiceImpl {

    /**
     * Calculate the monthly interest rate that is required to calculate
     * the monthly payment.
     *
     * @param annualInterestRate to be divided by 1200.
     * @return monthlyInterestRate to be used for calculating monthly
     *         payment.
     */
    @Override
    public double calculateMonthlyInterestRate(double annualInterestRate) {
        return annualInterestRate / 1200;
    }

    /**
     * Calculates the monthly payment with the obtained monthly interest rate.
     * @param annualInterestRate desired annual interest rate.
     * @param numberOfYears number of years the customer to pay.
     * @param loanAmount desired loan amount of the customer.
     * @return monthlyPayment total monthly payment of the customer.
     */
    @Override
    public double calculateMonthlyPayment(double annualInterestRate, int numberOfYears, double loanAmount) {
        double monthlyInterestRate = calculateMonthlyInterestRate(annualInterestRate);
        return loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    }
}
