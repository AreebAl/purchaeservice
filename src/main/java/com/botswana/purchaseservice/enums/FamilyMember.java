package com.botswana.purchaseservice.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FamilyMember {
    FATHER_IN_LAW("Father-in-law"),
    MOTHER_IN_LAW("Mother-in-law"),
    FATHER("Father"),
    MOTHER("Mother"),
    AUNT("Aunt"),
    UNCLE("Uncle"),
    BROTHER("Brother"),
    SISTER("Sister"),
    BROTHER_IN_LAW("Brother-in-law"),
    SISTER_IN_LAW("Sister-in-law"),
    SON_IN_LAW("Son-in-law"),
    DAUGHTER_IN_LAW("Daughter-in-law"),
    GRAND_FATHER("Grand-father"),
    GRAND_MOTHER("Grand-mother"),
    GRAND_SON("Grand-son"),
    GRAND_DAUGHTER("Grand-daughter"),
    FIRST_COUSINS("First cousins"),
    NIECE("Niece"),
    NEPHEW("Nephew"),
    SON("Son"),
    DAUGHTER("Daughter"),
    STEP_FATHER("Step-father"),
    STEP_MOTHER("Step-mother"),
    ADOPTIVE_FATHER("Adoptive father"),
    ADOPTIVE_MOTHER("Adoptive mother"),
    EX_HUSBAND("Ex-husband"),
    EX_WIFE("Ex-wife"),
    SPOUSE("Spouse"),
    CHILD("Child");

    private final String value;

    FamilyMember(String value) {
        this.value = value;
    }

    @JsonValue()
    public String getValue() {
        return value;
    }
}
