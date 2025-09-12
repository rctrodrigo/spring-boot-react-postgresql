package com.ravenrodrigo.loan_calculator_api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

/**
 * @author raven
 * @project loan-calculator-api
 * @created September 09, 2025
 */
@Entity
@Table(name="loan")
@Data
@ToString
public class LoanEntity {

    @Id
    @Column(name="loan_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer loanId;

    @Column(name="annual_interest_rate")
    private double annualInterestRate;

    @Column(name="number_of_years")
    private int numberOfYears;

    @Column(name="loan_amount")
    private double loanAmount;

    @Column(name="monthly_payment")
    private double monthlyPayment;

    @Column(name="total_payment")
    private double totalPayment;
}
