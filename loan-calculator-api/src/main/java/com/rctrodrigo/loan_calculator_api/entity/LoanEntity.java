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
}
