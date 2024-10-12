package com.botswana.purchaseservice.dto;

import javax.validation.constraints.NotEmpty;

public class UploadDocumentsDto {

    @NotEmpty(message = "Document type is required")
    private String documentType;

    @NotEmpty(message = "File name is required")
    private String fileName;

    private String fileType;

    private Long fileSize; // Using Long to accommodate larger file sizes

    @NotEmpty(message = "File URL is required")
    private String fileUrl;

    public UploadDocumentsDto() {
        // Default constructor
    }

    public UploadDocumentsDto(String documentType, String fileName, String fileType, Long fileSize, String fileUrl) {
        this.documentType = documentType;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.fileUrl = fileUrl;
    }

    // Getters and Setters
    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
