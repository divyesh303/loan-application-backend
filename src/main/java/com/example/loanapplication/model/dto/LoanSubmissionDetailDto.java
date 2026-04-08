package com.example.loanapplication.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.KebabCaseStrategy.class)
public class LoanSubmissionDetailDto {
    private Long id;
    private String applicantName;
    private String applicantEmail;
    private String applicantPhone;
    private BigDecimal loanAmount;
    private String status;
    private List<CollateralDto> collaterals;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime submittedAt;
    private LocalDateTime cancelledAt;
}