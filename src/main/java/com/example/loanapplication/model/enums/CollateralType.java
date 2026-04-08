package com.example.loanapplication.model.enums;

public enum CollateralType {
    MOTORCYCLE("motorcycle"),
    CAR("car");

    private final String value;

    CollateralType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}