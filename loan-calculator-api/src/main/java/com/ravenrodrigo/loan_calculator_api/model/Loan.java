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
    private int numberofYears;
    private long loanAmount;
    private long monthlyPayment;
    private long totalPayment;
}
