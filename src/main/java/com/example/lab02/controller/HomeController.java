package com.example.lab02.controller;

import com.example.lab02.model.About;
import com.example.lab02.model.Contact;
import com.example.lab02.model.Resume;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String About(About about){
        about.setImagePath("https://avatars.githubusercontent.com/u/144198095?s=400&u=94ddeaf38b663fc386a1c5f823302ba43dccaa81&v=4");
        about.setNameUser("Phune23");
        about.setMỵJob("Designer & FE Developer");
        about.setMỵAbout(
            "I am Phu, a designer from VietNam. I have rich experience in design UI, building Website, and customization. I am good at React and love unique ideas about design UI."
        );
        about.setMỵAge("21");
        about.setMỵFreelance("Available");
        about.setMỵResidence("Viet Nam");
        about.setMỵAddress("TP-HCM, VietNam");
        about.setMỵDesigner(
            "Design photos in many new styles, in many different styles according to my preferences."
        );
        about.setMỵFeDevelopment(
                "Design appropriate websites to meet customer needs."
        );
        return "about";
    }

    @GetMapping("/resume")
    public String Resume(Resume resume){
        resume.setResumeProjectDuration("2024 - Personal Project");
        resume.setResumeProjectName("Web-Chat-Online");
        resume.setResumeProjectMembers("@Phune23");
        resume.setResumeProjectDescribe(
            "✉ A chat website that connects people with each other and exchanges interesting stories."
        );
        resume.setLinkGitHubPath("https://github.com/Phune23/WebChatOnline");
        resume.setResumeStudyTime("2021 - 2025");
        resume.setResumeNameSchool("HUTECH");
        resume.setResumeLocationSchool("Quan 9, TP-HCM");
        resume.setResumeSchoolDescribe(
            "At school: learn about programming languages and technologies, improve programming skills and meet many good friends."
        );
        resume.setResumeSchoolMajored("Software Technology");
        return "resume";
    }
    @GetMapping("/contact")
    public String Contact(Contact contact){
        contact.setContactAddress("TP-HCM, VietNam");
        contact.setContactPhone(" 078********");
        contact.setContactEmail("phu***@gmail.com");
        contact.setContactFreelance("Available");
        return "contact";
    }
}
