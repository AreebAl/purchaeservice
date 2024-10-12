package com.botswana.purchaseservice.service;

import com.botswana.purchaseservice.dto.PurchaseDto;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

    public PurchaseDto processPurchase(PurchaseDto purchaseDto) {
        // Here, you can add any business logic, like saving to a database
        // For this example, we'll just return the received DTO
        return purchaseDto;
    }
}
