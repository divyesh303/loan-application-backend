package com.example.loanapplication.model.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoanSubmissionService {

    private Map<String, LoanApplicationDTO> loanDrafts = new HashMap<>();

    public LoanApplicationDTO createDraft(LoanApplicationDTO loanApplicationDTO) {
        loanDrafts.put(loanApplicationDTO.getId(), loanApplicationDTO);
        return loanApplicationDTO;
    }

    public LoanApplicationDTO submitDraft(String id) {
        LoanApplicationDTO loanApplicationDTO = loanDrafts.remove(id);
        // Logic to persist loanApplicationDTO in database.
        return loanApplicationDTO; // Return submitted draft details.
    }

    @Cacheable(value = "loanDetailsCache", key = "#id", cacheManager = "cacheManager")
    public LoanApplicationDTO getDetail(String id) {
        // Logic to retrieve the loan application details from the database.
        return loanDrafts.get(id); // Simulating retrieval; replace with actual DB call.
    }

    public void cancelDraft(String id) {
        loanDrafts.remove(id);
    }
}
