package com.botswana.purchaseservice.dto;

import com.botswana.purchaseservice.enums.FamilyMember;
import com.botswana.purchaseservice.enums.Relationship;
import com.botswana.purchaseservice.validation.DateFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;


public class BeneficiaryDetailsDto {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Last name is required")
    private String lastName;

    // Uncomment the line below if using FamilyMember enum
    // private FamilyMember dependantType;

    @NotBlank(message = "National ID is required")
    private String nationalId;

    @NotBlank(message = "Nationality is required")
    private String nationality;

    // Custom date validation
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @DateFormat(message = "Invalid date format. Expected dd-MM-yyyy.")
    private Date dateOfBirth;

    private FamilyMember relationship; // Assuming you have a Relationship enum

    // Uncomment the line below if using Category enum
    // private Category category;

    @Email(message = "Invalid email format")
    private String email;

    @Size(max = 10, message = "Gender must be 10 characters or less")
    private String gender;

    @Size(max = 15, message = "Mobile number must be 15 characters or less")
    private String mobileNumber;

    // Optional address fields can be added here if required
    private String city;

    @Size(max = 20, message = "Postal code must be 20 characters or less")
    private String postalCode;

    @Size(max = 10, message = "Country code must be 10 characters or less")
    private String countryCode;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Uncomment the methods below if using FamilyMember enum
    // public FamilyMember getDependantType() {
    //     return dependantType;
    // }

    // public void setDependantType(FamilyMember dependantType) {
    //     this.dependantType = dependantType;
    // }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public FamilyMember getRelationship() {
        return relationship;
    }

    public void setRelationship(FamilyMember relationship) {
        this.relationship = relationship;
    }

    // Uncomment the methods below if using Category enum
    // public Category getCategory() {
    //     return category;
    // }

    // public void setCategory(Category category) {
    //     this.category = category;
    // }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
