package com.example.loanapplication.model.repository;

import com.example.loanapplication.model.entity.LoanSubmission;
import com.example.loanapplication.model.enums.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface LoanSubmissionRepository extends JpaRepository<LoanSubmission, Long> {
    List<LoanSubmission> findByStatus(LoanStatus status);
    Optional<LoanSubmission> findByIdAndStatus(Long id, LoanStatus status);
}