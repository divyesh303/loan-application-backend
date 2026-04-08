package com.example.loanapplication.model.entity;
import com.example.loanapplication.model.enums.CollateralType;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.math.BigDecimal;
@Entity
@Table(name = "collaterals")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Collateral implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CollateralType type;
    @Column(nullable = false)
    private String make;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private Integer year;
    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal value;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loan_submission_id", nullable = false)
    private LoanSubmission loanSubmission;
}