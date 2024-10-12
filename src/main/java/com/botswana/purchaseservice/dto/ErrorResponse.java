package com.botswana.purchaseservice.dto;

public class ErrorResponse {
    private String message;
    private String title;


    public ErrorResponse(String message) {
        this.message = message;
    }

    public ErrorResponse(String title, String detail) {
        this.title = title;
        this.message = detail;
    }

    public String getMessage() {
        return message;
    }
    public String getTitle() {
        return title;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
