package com.ravenrodrigo.loan_calculator_api.model;

import lombok.*;

/**
 * @author raven
 * @project loan-calculator-api
 * @created September 09, 2025
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    private int loanId;
    private double annualInterestRate;
    private double monthlyInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private double monthlyPayment;
    private double totalPayment;
}
