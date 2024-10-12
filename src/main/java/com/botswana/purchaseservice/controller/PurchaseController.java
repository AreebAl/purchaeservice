package com.botswana.purchaseservice.controller;

import com.botswana.purchaseservice.dto.ErrorResponse;
import com.botswana.purchaseservice.dto.PurchaseDto;
import com.botswana.purchaseservice.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;


@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

//    @PostMapping
//    public ResponseEntity<PurchaseDto> createPurchase(@Valid @RequestBody PurchaseDto purchaseDto) {
//        PurchaseDto responseDto = purchaseService.processPurchase(purchaseDto);
//        return new ResponseEntity<>(responseDto, HttpStatus.OK);
//    }

    @PostMapping
    public ResponseEntity<Object> createPurchase(@Valid @RequestBody PurchaseDto purchaseDto) {
        try {
            // Here you can process the purchaseDto as needed
            System.out.println(purchaseDto+"purchase Dto here"); // Log the incoming DTO
            return ResponseEntity.ok(purchaseDto); // Echo back the received DTO
        } catch (Exception e) {
            // Handle other exceptions
            return new ResponseEntity<>(new ErrorResponse("An unexpected error occurred: " + e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
