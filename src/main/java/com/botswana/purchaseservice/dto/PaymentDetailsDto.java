package com.botswana.purchaseservice.dto;

import com.botswana.purchaseservice.enums.AccountType;

import javax.validation.constraints.*;
import java.util.Objects;

public class PaymentDetailsDto {

    @NotEmpty(message = "Bank name is required")
    private String bankName;

    @NotEmpty(message = "Branch name is required")
    private String branchName;

    @NotEmpty(message = "Account holder name is required")
    private String accountHolderName;

    @NotEmpty(message = "Account number is required")
    @Size(min = 5, max = 22, message = "Account number must be between 5 and 22 characters")
    private String accountNumber;

    @NotNull(message = "Account type is required")
    private AccountType accountType;

    @Min(value = 1, message = "Debit order date must be at least 1")
    @Max(value = 31, message = "Debit order date must be at most 31")
    private Integer debitOrderDate;

    @NotNull(message = "Confirm details is required")
    private Boolean confirmDetails;

    public PaymentDetailsDto() {
        // Default constructor
    }

    public PaymentDetailsDto(String bankName, String branchName, String accountHolderName,
                             String accountNumber, AccountType accountType,
                             Integer debitOrderDate, Boolean confirmDetails) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.debitOrderDate = debitOrderDate;
        this.confirmDetails = confirmDetails;
    }

    // Getters and Setters
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Integer getDebitOrderDate() {
        return debitOrderDate;
    }

    public void setDebitOrderDate(Integer debitOrderDate) {
        this.debitOrderDate = debitOrderDate;
    }

    public Boolean getConfirmDetails() {
        return confirmDetails;
    }

    public void setConfirmDetails(Boolean confirmDetails) {
        this.confirmDetails = confirmDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaymentDetailsDto)) return false;
        PaymentDetailsDto that = (PaymentDetailsDto) o;
        return Objects.equals(bankName, that.bankName) &&
                Objects.equals(branchName, that.branchName) &&
                Objects.equals(accountHolderName, that.accountHolderName) &&
                Objects.equals(accountNumber, that.accountNumber) &&
                accountType == that.accountType &&
                Objects.equals(debitOrderDate, that.debitOrderDate) &&
                Objects.equals(confirmDetails, that.confirmDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, branchName, accountHolderName, accountNumber, accountType, debitOrderDate, confirmDetails);
    }
}
