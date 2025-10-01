package com.rctrodrigo.loan_calculator_api.service;

import com.rctrodrigo.loan_calculator_api.entity.LoanEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author raven
 * @project loan-calculator-api
 * @created October 01, 2025
 */
@ExtendWith(MockitoExtension.class)
public class LoanCalculatorServiceTest {

    @InjectMocks
    private LoanCalculatorService loanCalculatorService;

    @Test
    @DisplayName("It should calculate the monthly interest rate")
    void shouldCalculateMonthlyInterestRate() {
        // Arrange
        LoanEntity loanEntity = new LoanEntity();
        loanEntity.setAnnualInterestRate(5.75);
        double annualInterestRate = loanEntity.getAnnualInterestRate();

        // Act
        double monthlyInterestRate = loanCalculatorService.calculateMonthlyInterestRate(annualInterestRate);

        // Assert
        assertThat(monthlyInterestRate).isEqualTo(annualInterestRate / 1200);

    }
}
