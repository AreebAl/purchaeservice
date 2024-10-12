package com.botswana.purchaseservice.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CoverType {
    MYSELF("Myself"),
    ME_AND_MY_DIRECT_FAMILY("Me_And_My_Direct_Family");

    private final String value;

    CoverType(String value) {
        this.value = value;
    }

    @JsonValue()
    public String getValue() {
        return value;
    }
}
