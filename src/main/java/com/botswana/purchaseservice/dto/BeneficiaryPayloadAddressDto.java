package com.botswana.purchaseservice.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class BeneficiaryPayloadAddressDto {

    @NotEmpty(message = "Address line 1 is required")
    @Size(max = 255, message = "Address line 1 cannot exceed 255 characters")
    private String addressLine1;

    @Size(max = 100, message = "City cannot exceed 100 characters")
    private String city;

    // Getters and Setters
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

