package com.botswana.purchaseservice.dto;

import com.botswana.purchaseservice.enums.CoverType;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

public class PurchaseDto {

    @NotNull(message = "Cover type is required")
//    @Enumerated(EnumType.STRING)
    private CoverType coverType;

    @Valid
    @NotNull(message = "Personal details are required")
    private PersonalDetailsDto personalDetails;

    @Valid
    @NotEmpty(message = "Lives covered list is required")
    private List<LivesCoveredDto> livesCovered;

    @Valid
    @NotEmpty(message = "Beneficiaries list is required")
    private List<BeneficiaryDetailsDto> beneficiaries;

    @Valid
    private PaymentDetailsDto paymentDetails;

    @Valid
    private List<UploadDocumentsDto> uploadDocuments;

    @NotNull(message = "Confirmation of details is required")
    private Boolean confirmDetails;

    public PurchaseDto() {
        // Default constructor
    }

    public PurchaseDto(CoverType coverType, PersonalDetailsDto personalDetails,
                       List<LivesCoveredDto> livesCovered, List<BeneficiaryDetailsDto> beneficiaries,
                       PaymentDetailsDto paymentDetails, List<UploadDocumentsDto> uploadDocuments,
                       Boolean confirmDetails) {
        this.coverType = coverType;
        this.personalDetails = personalDetails;
        this.livesCovered = livesCovered;
        this.beneficiaries = beneficiaries;
        this.paymentDetails = paymentDetails;
        this.uploadDocuments = uploadDocuments;
        this.confirmDetails = confirmDetails;
    }

    // Getters and Setters
    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    public PersonalDetailsDto getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetailsDto personalDetails) {
        this.personalDetails = personalDetails;
    }

    public List<LivesCoveredDto> getLivesCovered() {
        return livesCovered;
    }

    public void setLivesCovered(List<LivesCoveredDto> livesCovered) {
        this.livesCovered = livesCovered;
    }

    public List<BeneficiaryDetailsDto> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(List<BeneficiaryDetailsDto> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public PaymentDetailsDto getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetailsDto paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public List<UploadDocumentsDto> getUploadDocuments() {
        return uploadDocuments;
    }

    public void setUploadDocuments(List<UploadDocumentsDto> uploadDocuments) {
        this.uploadDocuments = uploadDocuments;
    }

    public Boolean getConfirmDetails() {
        return confirmDetails;
    }

    public void setConfirmDetails(Boolean confirmDetails) {
        this.confirmDetails = confirmDetails;
    }
}

