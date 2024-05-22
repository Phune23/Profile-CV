package com.example.lab02.model;

public class Resume {
    private String resumeProjectDuration;
    private String resumeProjectName;
    private String resumeProjectMembers;
    private String resumeProjectDescribe;
    private String linkGitHubPath;
    private String resumeStudyTime;
    private String resumeNameSchool;
    private String resumeLocationSchool;
    private String resumeSchoolDescribe;
    private String resumeSchoolMajored;

    public Resume(
            String resumeProjectDuration,
            String resumeProjectName,
            String resumeProjectMembers,
            String resumeProjectDescribe,
            String linkGitHubPath,
            String resumeStudyTime,
            String resumeNameSchool,
            String resumeLocationSchool,
            String resumeSchoolDescribe,
            String resumeSchoolMajored
    ) {
        this.resumeProjectDuration = resumeProjectDuration;
        this.resumeProjectName = resumeProjectName;
        this.resumeProjectMembers = resumeProjectMembers;
        this.resumeProjectDescribe = resumeProjectDescribe;
        this.linkGitHubPath = linkGitHubPath;
        this.resumeStudyTime = resumeStudyTime;
        this.resumeNameSchool = resumeNameSchool;
        this.resumeLocationSchool = resumeLocationSchool;
        this.resumeSchoolDescribe = resumeSchoolDescribe;
        this.resumeSchoolMajored = resumeSchoolMajored;
    }

    public String getResumeProjectDuration() {
        return resumeProjectDuration;
    }

    public void setResumeProjectDuration(String resumeProjectDuration) {
        this.resumeProjectDuration = resumeProjectDuration;
    }

    public String getResumeProjectName() {
        return resumeProjectName;
    }

    public void setResumeProjectName(String resumeProjectName) {
        this.resumeProjectName = resumeProjectName;
    }

    public String getResumeProjectMembers() {
        return resumeProjectMembers;
    }

    public void setResumeProjectMembers(String resumeProjectMembers) {
        this.resumeProjectMembers = resumeProjectMembers;
    }

    public String getResumeProjectDescribe() {
        return resumeProjectDescribe;
    }

    public void setResumeProjectDescribe(String resumeProjectDescribe) {
        this.resumeProjectDescribe = resumeProjectDescribe;
    }

    public String getLinkGitHubPath() {
        return linkGitHubPath;
    }

    public void setLinkGitHubPath(String linkGitHubPath) {
        this.linkGitHubPath = linkGitHubPath;
    }

    public String getResumeStudyTime() {
        return resumeStudyTime;
    }

    public void setResumeStudyTime(String resumeStudyTime) {
        this.resumeStudyTime = resumeStudyTime;
    }

    public String getResumeNameSchool() {
        return resumeNameSchool;
    }

    public void setResumeNameSchool(String resumeNameSchool) {
        this.resumeNameSchool = resumeNameSchool;
    }

    public String getResumeLocationSchool() {
        return resumeLocationSchool;
    }

    public void setResumeLocationSchool(String resumeLocationSchool) {
        this.resumeLocationSchool = resumeLocationSchool;
    }

    public String getResumeSchoolDescribe() {
        return resumeSchoolDescribe;
    }

    public void setResumeSchoolDescribe(String resumeSchoolDescribe) {
        this.resumeSchoolDescribe = resumeSchoolDescribe;
    }

    public String getResumeSchoolMajored() {
        return resumeSchoolMajored;
    }

    public void setResumeSchoolMajored(String resumeSchoolMajored) {
        this.resumeSchoolMajored = resumeSchoolMajored;
    }
}
