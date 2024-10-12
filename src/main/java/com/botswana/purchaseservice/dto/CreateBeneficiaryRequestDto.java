package com.botswana.purchaseservice.dto;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;
import javax.validation.Valid;

public class CreateBeneficiaryRequestDto {

    @NotEmpty(message = "Date of birth is required")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Invalid date format, expected yyyy-MM-dd")
    private String dateOfBirth;

    @NotEmpty(message = "Gender is required")
    private String gender;

    @NotEmpty(message = "National ID is required")
    private String nationalId;

    @Valid // Enables validation of nested objects
    private BeneficiaryPayloadAddressDto address;

    @NotEmpty(message = "Mobile number is required")
    private String mobileNumber;

    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Surname is required")
    private String surname;

    @NotEmpty(message = "Beneficiary relationship is required")
    private String beneficiaryRelationship;

    // Getters and Setters
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public BeneficiaryPayloadAddressDto getAddress() {
        return address;
    }

    public void setAddress(BeneficiaryPayloadAddressDto address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBeneficiaryRelationship() {
        return beneficiaryRelationship;
    }

    public void setBeneficiaryRelationship(String beneficiaryRelationship) {
        this.beneficiaryRelationship = beneficiaryRelationship;
    }
}
