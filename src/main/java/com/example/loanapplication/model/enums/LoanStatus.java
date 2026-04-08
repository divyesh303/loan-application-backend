package com.example.loanapplication.model.enums;

public enum LoanStatus {
    DRAFT("draft"),
    SUBMITTED("submitted"),
    CANCELLED("cancelled");

    private final String value;

    LoanStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}