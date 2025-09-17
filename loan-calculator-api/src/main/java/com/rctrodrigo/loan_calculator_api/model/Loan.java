package com.rctrodrigo.loan_calculator_api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Raven Carlos T. Rodrigo
 * @project Loan Calculator Web Application
 * @created September 17, 2025
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
}
