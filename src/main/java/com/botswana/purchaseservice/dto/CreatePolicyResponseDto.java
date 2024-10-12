package com.botswana.purchaseservice.dto;

import javax.validation.constraints.NotEmpty;

public class CreatePolicyResponseDto {

    @NotEmpty(message = "Policy ID is required")
    private String policyId;

    @NotEmpty(message = "Client ID is required")
    private String clientId;

    @NotEmpty(message = "Policy number is required")
    private String policyNumber;

    // Getters and Setters
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}
