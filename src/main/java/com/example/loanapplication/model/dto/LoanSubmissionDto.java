package com.example.loanapplication.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.KebabCaseStrategy.class)
public class LoanSubmissionDto {
    private Long id;

    @NotBlank(message = "Applicant name is required")
    private String applicantName;

    @NotBlank(message = "Applicant email is required")
    @Email(message = "Applicant email should be valid")
    private String applicantEmail;

    @NotBlank(message = "Applicant phone is required")
    private String applicantPhone;

    @NotNull(message = "Loan amount is required")
    @Positive(message = "Loan amount must be positive")
    private BigDecimal loanAmount;

    @Valid
    @NotNull(message = "At least one collateral is required")
    private List<CollateralDto> collaterals;
}