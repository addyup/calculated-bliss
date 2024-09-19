package com.mandeer.websc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import com.mandeer.websc.model.Candidate;

@RestController
@RequestMapping("/api/candidate")
@CrossOrigin
public class CandidateCbeController {

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("/submit")
    public String submitCandidate(@RequestBody Candidate candidate) {
        if (candidate.getFirstName() == null || candidate.getLastName() == null || candidate.getPositionType() == null ||
            candidate.getCurrentLocation() == null || candidate.getVisaStatus() == null) {
            return "All fields are required!";
        }

        sendEmail(candidate);
        return "Candidate details sent successfully!";
    }

    private void sendEmail(Candidate candidate) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("adwait.uprety@gmail.com");
        message.setSubject("APP-CONT-FT - Candidate Information");
//yext
        String emailContent = "Position Type: " + candidate.getPositionType() + "\n" +
                              "First Name: " + candidate.getFirstName() + "\n" +
                              "Last Name: " + candidate.getLastName() + "\n" +
                              "Open for Relocation: " + (candidate.isOpenForRelocation() ? "Yes" : "No") + "\n" +
                              "Current Location: " + candidate.getCurrentLocation() + "\n" +
                              "Visa Status: " + candidate.getVisaStatus() + "\n" +
                              "Email: " + candidate.getEmail();

        message.setText(emailContent);
        mailSender.send(message);
    }
}
