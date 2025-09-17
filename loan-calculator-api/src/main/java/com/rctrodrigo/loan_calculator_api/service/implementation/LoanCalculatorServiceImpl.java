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

    /**
     * Obtain the monthly interest rate that is required to calculate the
     * monthly payment.
     *
     * @param annualInterestRate to be divided by 1200.
     * @return monthly interest rate to be used for calculating monthly
     *         payment.
     */
    @Override
    public double obtainMonthlyInterestRate(double annualInterestRate) {
       return annualInterestRate / 1200;
    }

    /**
     * Calculates the monthly payment with the obtained monthly interest
     * rate.
     *
     * @param annualInterestRate desired annual interest rate.
     * @param numberOfYears number of years for the loan to be paid.
     * @param loanAmount desired loan amount of the customer.
     * @return the monthly payment of the customer.
     */
    @Override
    public double calculateMonthlyPayment(double annualInterestRate, int numberOfYears, double loanAmount) {
        double monthlyInterestRate = obtainMonthlyInterestRate(annualInterestRate);
        return (int)(loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)) * 100) / 100.0;
    }
}
