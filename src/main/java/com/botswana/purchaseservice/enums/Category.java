package com.botswana.purchaseservice.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Category {
    ME_AND_MY_DIRECT_FAMILY("Me_And_MyDirectFamily"),
    MY_PARENTS_AND_INLAWS("My_Parents_And_InLaws"),
    MY_EXTENDED_FAMILY("My_Extended_Family");

    private final String value;

    Category(String value) {
        this.value = value;
    }

    @JsonValue()
    public String getValue() {
        return value;
    }
}

