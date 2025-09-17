package com.rctrodrigo.loan_calculator_api.service;

import com.rctrodrigo.loan_calculator_api.entity.LoanEntity;
import com.rctrodrigo.loan_calculator_api.service.implementation.LoanCalculatorServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author Raven Carlos T. Rodrigo
 * @project Loan Calculator Web Application
 * @created September 17, 2025
 */

@ExtendWith(MockitoExtension.class) // Enable testing with Mockito
public class LoanCalculatorServiceTest {

    @InjectMocks
    private LoanCalculatorServiceImpl loanCalculatorMockServiceImpl;

    @Test
    @DisplayName("It should obtain monthly interest rate")
    void shouldObtainMonthlyInterestRate() {
        // Arrange
        LoanEntity loanEntity = new LoanEntity();
        loanEntity.setAnnualInterestRate(5.75);

        // Act
        double monthlyInterestRateExpected = loanCalculatorMockServiceImpl.obtainMonthlyInterestRate(
                loanEntity.getAnnualInterestRate());

        // Assert
        assertThat(monthlyInterestRateExpected).isEqualTo(0.004791666666666666);
    }

    @Test
    @DisplayName("It should calculate monthly payment")
    void shouldCalculateMonthlyPayment() {
       // Arrange
       LoanEntity loanEntity = new LoanEntity();
       loanEntity.setAnnualInterestRate(5.75);
       loanEntity.setNumberOfYears(15);
       loanEntity.setLoanAmount(250000);

       // Act
        double monthlyPaymentActual = loanCalculatorMockServiceImpl.calculateMonthlyPayment(
                loanEntity.getAnnualInterestRate(),
                loanEntity.getNumberOfYears(),
                loanEntity.getLoanAmount()
        );

        // Assert
        assertThat(monthlyPaymentActual).isEqualTo(2076.02);
    }
}
