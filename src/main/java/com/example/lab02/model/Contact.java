package com.example.lab02.model;

public class Contact {
    private String contactAddress;
    private String contactPhone;
    private String contactEmail;
    private String contactFreelance;

    public Contact(
            String contactAddress,
            String contactPhone,
            String contactEmail,
            String contactFreelance
    ) {
        this.contactAddress = contactAddress;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.contactFreelance = contactFreelance;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactFreelance() {
        return contactFreelance;
    }

    public void setContactFreelance(String contactFreelance) {
        this.contactFreelance = contactFreelance;
    }
}
