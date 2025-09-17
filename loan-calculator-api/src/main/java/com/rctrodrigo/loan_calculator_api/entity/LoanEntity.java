package com.rctrodrigo.loan_calculator_api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

/**
 * @author Raven Carlos T. Rodrigo
 * @project Loan Calculator Web Application
 * @created September 17, 2025
 */
@Entity
@Table(name="loan")
@Data
@ToString
public class LoanEntity {

    @Id
    @Column(name="load_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer loanId;

    @Column(name="annual_interest_rate")
    private double annualInterestRate;
}
