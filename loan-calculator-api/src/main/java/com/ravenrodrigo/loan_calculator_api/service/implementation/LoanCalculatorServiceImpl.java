package com.ravenrodrigo.loan_calculator_api.service.implementation;

import com.ravenrodrigo.loan_calculator_api.repository.LoanCalculationRepository;
import com.ravenrodrigo.loan_calculator_api.service.LoanCalculatorService;
import org.springframework.stereotype.Service;

/**
 * @author raven
 * @project loan-calculator-api
 * @created September 09, 2025
 */
@Service
public class LoanCalculatorServiceImpl implements LoanCalculatorService {

    private final LoanCalculationRepository loanCalculationRepository;

    public LoanCalculatorServiceImpl(LoanCalculationRepository loanCalculationRepository) {
        this.loanCalculationRepository = loanCalculationRepository;
    }

    @Override
    public double obtainMonthlyInterestRate(double annualInterestRate) {
        return annualInterestRate / 1200;
    }
}
