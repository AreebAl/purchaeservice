package com.botswana.purchaseservice.dto;


import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Objects;

public class PersonalDetailsDto {

    @NotEmpty(message = "Title is required")
    private String title;

    @NotEmpty(message = "First name is required")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    private String lastName;

    @NotEmpty(message = "Nationality is required")
    private String nationality;

    @NotEmpty(message = "Botswana ID number is required")
    private String botswanaIdNumber;

    @NotNull(message = "Date of birth is required")
    @NotNull(message = "Invalid date format. Expected dd-mm-yyyy.")
    private String dateOfBirth;


    @NotNull(message = "Invalid date format. Expected dd-mm-yyyy.")
    private String idExpiryDate;

    @NotNull(message = "isPip is required")
    private Boolean isPip;

    @NotEmpty(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotEmpty(message = "Contact number is required")
    private String contactNumber;

    @Valid
    @NotNull(message = "Residential address is required")
    private AddressDto residentialAddress;

    @Valid
    @NotNull(message = "Postal address is required")
    private AddressDto postalAddress;

    @Valid
    private AddressDto previousResidentialAddress;

    @Valid
    @NotNull(message = "Employment details are required")
    private EmploymentDetailsDto employmentDetails;

    public PersonalDetailsDto() {
        // Default constructor
    }

    public PersonalDetailsDto(String title, String firstName, String lastName, String nationality,
                         String botswanaIdNumber, String dateOfBirth, String idExpiryDate,
                         Boolean isPip, String email, String contactNumber,
                         AddressDto residentialAddress, AddressDto postalAddress,
                         AddressDto previousResidentialAddress, EmploymentDetailsDto employmentDetails) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.botswanaIdNumber = botswanaIdNumber;
        this.dateOfBirth = dateOfBirth;
        this.idExpiryDate = idExpiryDate;
        this.isPip = isPip;
        this.email = email;
        this.contactNumber = contactNumber;
        this.residentialAddress = residentialAddress;
        this.postalAddress = postalAddress;
        this.previousResidentialAddress = previousResidentialAddress;
        this.employmentDetails = employmentDetails;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBotswanaIdNumber() {
        return botswanaIdNumber;
    }

    public void setBotswanaIdNumber(String botswanaIdNumber) {
        this.botswanaIdNumber = botswanaIdNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdExpiryDate() {
        return idExpiryDate;
    }

    public void setIdExpiryDate(String idExpiryDate) {
        this.idExpiryDate = idExpiryDate;
    }

    public Boolean getIsPip() {
        return isPip;
    }

    public void setIsPip(Boolean isPip) {
        this.isPip = isPip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public AddressDto getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(AddressDto residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public AddressDto getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(AddressDto postalAddress) {
        this.postalAddress = postalAddress;
    }

    public AddressDto getPreviousResidentialAddress() {
        return previousResidentialAddress;
    }

    public void setPreviousResidentialAddress(AddressDto previousResidentialAddress) {
        this.previousResidentialAddress = previousResidentialAddress;
    }

    public EmploymentDetailsDto getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(EmploymentDetailsDto employmentDetails) {
        this.employmentDetails = employmentDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalDetailsDto)) return false;
        PersonalDetailsDto that = (PersonalDetailsDto) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(nationality, that.nationality) &&
                Objects.equals(botswanaIdNumber, that.botswanaIdNumber) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(idExpiryDate, that.idExpiryDate) &&
                Objects.equals(isPip, that.isPip) &&
                Objects.equals(email, that.email) &&
                Objects.equals(contactNumber, that.contactNumber) &&
                Objects.equals(residentialAddress, that.residentialAddress) &&
                Objects.equals(postalAddress, that.postalAddress) &&
                Objects.equals(previousResidentialAddress, that.previousResidentialAddress) &&
                Objects.equals(employmentDetails, that.employmentDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, firstName, lastName, nationality, botswanaIdNumber, dateOfBirth,
                idExpiryDate, isPip, email, contactNumber, residentialAddress, postalAddress,
                previousResidentialAddress, employmentDetails);
    }
}
