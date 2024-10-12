package com.botswana.purchaseservice.dto;


import javax.validation.constraints.NotEmpty;

public class EmploymentDetailsDto {

    @NotEmpty(message = "Status is required")
    private String status;

    @NotEmpty(message = "Occupation is required")
    private String occupation;

    @NotEmpty(message = "Source of income is required")
    private String sourceOfIncome;

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }
}
