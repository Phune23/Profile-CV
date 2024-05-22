package com.example.lab02.model;

public class About {
    private String imagePath;
    private String nameUser;
    private String mỵJob;
    private String mỵAbout;
    private String mỵAge;
    private String mỵFreelance;
    private String mỵResidence;
    private String mỵAddress;
    private String mỵDesigner;
    private String mỵFeDevelopment;

    public About(
        String nameUser,
        String imagePath,
        String mỵJob,
        String mỵAbout,
        String mỵAge,
        String mỵFreelance,
        String mỵResidence,
        String mỵAddress,
        String mỵDesigner,
        String mỵFeDevelopment
    ) {
        this.nameUser = nameUser;
        this.imagePath = imagePath;
        this.mỵJob = mỵJob;
        this.mỵAbout = mỵAbout;
        this.mỵAge = mỵAge;
        this.mỵFreelance = mỵFreelance;
        this.mỵResidence = mỵResidence;
        this.mỵAddress = mỵAddress;
        this.mỵDesigner = mỵDesigner;
        this.mỵFeDevelopment = mỵFeDevelopment;
    }

    // Getters and Setters
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getMỵJob() {
        return mỵJob;
    }

    public void setMỵJob(String mỵJob) {
        this.mỵJob = mỵJob;
    }

    public String getMỵAbout() {
        return mỵAbout;
    }

    public void setMỵAbout(String mỵAbout) {
        this.mỵAbout = mỵAbout;
    }

    public String getMỵAge() {
        return mỵAge;
    }

    public void setMỵAge(String mỵAge) {
        this.mỵAge = mỵAge;
    }

    public String getMỵFreelance() {
        return mỵFreelance;
    }

    public void setMỵFreelance(String mỵFreelance) {
        this.mỵFreelance = mỵFreelance;
    }

    public String getMỵResidence() {
        return mỵResidence;
    }

    public void setMỵResidence(String mỵResidence) {
        this.mỵResidence = mỵResidence;
    }

    public String getMỵAddress() {
        return mỵAddress;
    }

    public void setMỵAddress(String mỵAddress) {
        this.mỵAddress = mỵAddress;
    }

    public String getMỵDesigner() {
        return mỵDesigner;
    }

    public void setMỵDesigner(String mỵDesigner) {
        this.mỵDesigner = mỵDesigner;
    }

    public String getMỵFeDevelopment() {
        return mỵFeDevelopment;
    }

    public void setMỵFeDevelopment(String mỵFeDevelopment) {
        this.mỵFeDevelopment = mỵFeDevelopment;
    }
}
