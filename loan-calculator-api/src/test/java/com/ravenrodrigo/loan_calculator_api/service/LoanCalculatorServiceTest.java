package com.ravenrodrigo.loan_calculator_api.service;

import com.ravenrodrigo.loan_calculator_api.entity.LoanEntity;
import com.ravenrodrigo.loan_calculator_api.service.implementation.LoanCalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author raven
 * @project loan-calculator-api
 * @created September 09, 2025
 */
@ExtendWith(MockitoExtension.class) // Enable testing with Mockito
public class LoanCalculatorServiceTest {

    @InjectMocks
    private LoanCalculatorServiceImpl loanCalculatorMockServiceImpl;

    @Test
    void should_obtain_monthly_interest_rate() {

        // Arrange
        double annualInterestRate = 5.75;
        double monthlyInterestRateActual = annualInterestRate / 1200;

        // Act
        double monthlyInterestRateExpected = loanCalculatorMockServiceImpl.obtainMonthlyInterestRate(annualInterestRate);

        // Assert
        assertThat(monthlyInterestRateExpected).isEqualTo(monthlyInterestRateActual);
    }

    @Test
    void sould_calculate_monthly_payment() {

        // Arrange
        LoanEntity loanEntity = new LoanEntity();
        loanEntity.setAnnualInterestRate(5.75);
        loanEntity.setNumberOfYears(15);
        loanEntity.setLoanAmount(250000);

        // Act
        double monthlyPaymentExpected = loanCalculatorMockServiceImpl.calculateMonthlyPayment(
                loanEntity.getAnnualInterestRate(),
                loanEntity.getNumberOfYears(),
                loanEntity.getLoanAmount()
        );

        // Assert
        assertThat(monthlyPaymentExpected).isEqualTo(2076.02);
    }
}
