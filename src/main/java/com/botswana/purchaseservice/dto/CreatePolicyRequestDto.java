package com.botswana.purchaseservice.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotNull;

public class CreatePolicyRequestDto {

    @NotEmpty(message = "Mobile number is required")
    private String mobileNumber;

    @NotEmpty(message = "Client name is required")
    private String clientName;

    @NotEmpty(message = "Client surname is required")
    private String clientSurname;

    @NotEmpty(message = "Client gender is required")
    @Pattern(regexp = "MALE|FEMALE", message = "Client gender must be either MALE or FEMALE")
    private String clientGender;

    @NotEmpty(message = "Date of birth is required")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Invalid date format, expected yyyy-MM-dd")
    private String dateOfBirth;

    @NotEmpty(message = "National ID is required")
    private String nationalId;

    @NotNull(message = "Cover amount is required")
    private Double coverAmount;

    @NotEmpty(message = "Country is required")
    private String country;

    @NotEmpty(message = "Plan ID is required")
    private String planId;

    @NotEmpty(message = "Currency is required")
    private String currency;

    @NotEmpty(message = "Policy name is required")
    private String policyName;

    @NotEmpty(message = "Customer address is required")
    private String customerAddress;

    @NotEmpty(message = "Customer bank account holder name is required")
    private String customerBankAccountHolderName;

    @NotEmpty(message = "Customer bank account number is required")
    private String customerBankAccountNumber;

    @NotEmpty(message = "Customer bank account type is required")
    private String customerBankAccountType;

    @NotEmpty(message = "Customer bank branch is required")
    private String customerBankBranch;

    @NotEmpty(message = "Customer bank name is required")
    private String customerBankName;

    @NotEmpty(message = "Payment method is required")
    private String paymentMethod;

    @NotEmpty(message = "Customer name is required")
    private String customerName;

    private String customerBankBranchSortCode;

    // Getters and Setters
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientGender() {
        return clientGender;
    }

    public void setClientGender(String clientGender) {
        this.clientGender = clientGender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public Double getCoverAmount() {
        return coverAmount;
    }

    public void setCoverAmount(Double coverAmount) {
        this.coverAmount = coverAmount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerBankAccountHolderName() {
        return customerBankAccountHolderName;
    }

    public void setCustomerBankAccountHolderName(String customerBankAccountHolderName) {
        this.customerBankAccountHolderName = customerBankAccountHolderName;
    }

    public String getCustomerBankAccountNumber() {
        return customerBankAccountNumber;
    }

    public void setCustomerBankAccountNumber(String customerBankAccountNumber) {
        this.customerBankAccountNumber = customerBankAccountNumber;
    }

    public String getCustomerBankAccountType() {
        return customerBankAccountType;
    }

    public void setCustomerBankAccountType(String customerBankAccountType) {
        this.customerBankAccountType = customerBankAccountType;
    }

    public String getCustomerBankBranch() {
        return customerBankBranch;
    }

    public void setCustomerBankBranch(String customerBankBranch) {
        this.customerBankBranch = customerBankBranch;
    }

    public String getCustomerBankName() {
        return customerBankName;
    }

    public void setCustomerBankName(String customerBankName) {
        this.customerBankName = customerBankName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBankBranchSortCode() {
        return customerBankBranchSortCode;
    }

    public void setCustomerBankBranchSortCode(String customerBankBranchSortCode) {
        this.customerBankBranchSortCode = customerBankBranchSortCode;
    }
}
