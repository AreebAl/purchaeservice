package com.botswana.purchaseservice.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountType {
    SAVINGS("Savings"),
    CURRENT("Current");

    private final String value;

    AccountType(String value) {
        this.value = value;
    }

    @JsonValue()
    public String getValue() {
        return value;
    }
}
