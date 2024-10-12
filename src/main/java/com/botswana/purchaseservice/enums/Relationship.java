package com.botswana.purchaseservice.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Relationship {
    MYSELF("Myself"),
    SPOUSE_OR_PARTNER("Spouse"),
    CHILD("Child"),
    PARENTS_IN_LAWS("MyParents_and_In-laws"),
    MY_EXTENDED_FAMILY("My_Extended_Family");

    private final String value;

    Relationship(String value) {
        this.value = value;
    }

    @JsonValue()
    public String getValue() {
        return value;
    }
}

