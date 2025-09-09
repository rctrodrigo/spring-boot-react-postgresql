package com.ravenrodrigo.loan_calculator_api.repository;

import com.ravenrodrigo.loan_calculator_api.entity.LoanEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author raven
 * @project loan-calculator-api
 * @created September 09, 2025
 */
public interface LoanCalculationRepository extends CrudRepository<LoanEntity, Integer> {
}
