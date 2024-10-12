package com.botswana.purchaseservice.dto;


import com.botswana.purchaseservice.enums.Category;
import com.botswana.purchaseservice.enums.FamilyMember;
import com.botswana.purchaseservice.enums.Relationship;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LivesCoveredDto {

    private Category category;

    @NotNull(message = "Relationship is required")
    private Relationship relationship;

    private FamilyMember familyMember;

    @NotEmpty(message = "Title is required")
    private String title;

    @NotEmpty(message = "First name is required")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    private String lastName;

    @NotEmpty(message = "Date of birth is required")
    private String dateOfBirth; // Keep as string for validation

    @NotEmpty(message = "Nationality is required")
    private String nationality;

    private String botswanaId;

    private Double coverAmount; // Nullable to allow optional values

    private Boolean isStudent;

    private Boolean hasSpecialNeeds;

    public LivesCoveredDto() {
        // Default constructor
    }

    public LivesCoveredDto(Category category, Relationship relationship, FamilyMember familyMember,
                           String title, String firstName, String lastName, String dateOfBirth,
                           String nationality, String botswanaId, Double coverAmount,
                           Boolean isStudent, Boolean hasSpecialNeeds) {
        this.category = category;
        this.relationship = relationship;
        this.familyMember = familyMember;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.botswanaId = botswanaId;
        this.coverAmount = coverAmount;
        this.isStudent = isStudent;
        this.hasSpecialNeeds = hasSpecialNeeds;
    }

    // Getters and Setters
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public FamilyMember getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(FamilyMember familyMember) {
        this.familyMember = familyMember;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBotswanaId() {
        return botswanaId;
    }

    public void setBotswanaId(String botswanaId) {
        this.botswanaId = botswanaId;
    }

    public Double getCoverAmount() {
        return coverAmount;
    }

    public void setCoverAmount(Double coverAmount) {
        this.coverAmount = coverAmount;
    }

    public Boolean getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(Boolean isStudent) {
        this.isStudent = isStudent;
    }

    public Boolean getHasSpecialNeeds() {
        return hasSpecialNeeds;
    }

    public void setHasSpecialNeeds(Boolean hasSpecialNeeds) {
        this.hasSpecialNeeds = hasSpecialNeeds;
    }

    // Method to calculate current age
    public int getCurrentAge() {
        LocalDate today = LocalDate.now();

        // Convert dateOfBirth from String to LocalDate
        LocalDate birthDate;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            birthDate = LocalDate.parse(dateOfBirth, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected dd-MM-yyyy.");
        }

        int age = today.getYear() - birthDate.getYear();
        if (today.getDayOfYear() < birthDate.getDayOfYear()) {
            age--;
        }

        return age;
    }
}
