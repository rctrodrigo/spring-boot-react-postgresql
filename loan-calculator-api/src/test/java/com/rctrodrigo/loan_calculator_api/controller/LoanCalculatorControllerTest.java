package com.rctrodrigo.loan_calculator_api.controller;

import com.rctrodrigo.loan_calculator_api.entity.LoanEntity;
import com.rctrodrigo.loan_calculator_api.model.Loan;
import com.rctrodrigo.loan_calculator_api.service.LoanCalculatorService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Raven Carlos T. Rodrigo
 * @project Loan Calculator Web Application
 * @created September 18, 2025
 */

@WebMvcTest(LoanCalculatorController.class)
public class LoanCalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private LoanCalculatorService loanCalculatorService; // Mock the service used by the controller

    @Test
    @DisplayName("It should get the monthly payment.")
    void getCalculation() throws Exception {
          mockMvc.perform(MockMvcRequestBuilders
               .get("/?annualInterestRate=5.75&numberOfYears=15&loanAmount=250000"))
               .andExpect(status().isOk());
    }
}
