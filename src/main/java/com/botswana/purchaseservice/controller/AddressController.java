package com.botswana.purchaseservice.controller;

import com.botswana.purchaseservice.dto.AddressDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class AddressController {

    @PostMapping("/address/validate")
    public ResponseEntity<String> validateAddress(@Valid @RequestBody AddressDto addressDto) {
        // If the DTO is valid, return a success message
        return new ResponseEntity<>("Address is valid: " + addressDto, HttpStatus.OK);
    }
}
