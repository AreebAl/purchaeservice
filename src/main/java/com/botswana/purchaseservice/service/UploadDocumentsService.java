package com.botswana.purchaseservice.service;

import com.botswana.purchaseservice.dto.UploadDocumentsDto;
import org.springframework.stereotype.Service;

@Service
public class UploadDocumentsService {

    public UploadDocumentsDto processUploadDocument(UploadDocumentsDto uploadDocumentsDto) {
        // You can add any business logic here, like saving to a database
        // For this example, we'll just return the received DTO
        return uploadDocumentsDto;
    }
}

