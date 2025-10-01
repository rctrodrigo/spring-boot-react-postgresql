package com.rctrodrigo.loan_calculator_api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

/**
 * @author raven
 * @project loan-calculator-api
 * @created October 01, 2025
 */
@Entity
@Table(name="loans")
@Data
@ToString
public class LoanEntity {

    @Column(name="annual_interest_rate")
    private double annualInterestRate;

    @Column(name="number_of_years")
    private int numberOfYears;

    @Column(name="loan_amount")
    private double loanAmount;
}
