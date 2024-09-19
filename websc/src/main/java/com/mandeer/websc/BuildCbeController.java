package com.mandeer.websc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mandeer.websc.model.BuildDetails;

@RestController
public class BuildCbeController {

    private final EmailBuildCbeService emailService;

    public BuildCbeController(EmailBuildCbeService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/api/build-details")
    public ResponseEntity<String> handleBuildDetails(@RequestBody BuildDetails details) {
        // Create email content based on the submitted details
        String subject = "BUILD-HCFM- " + details.getEmail();
        String text = String.format(
            "Name: %s\nBuild Type: %s\nMulti-Level Detail: %s\nPhone Number: %s\nEmail: %s",
            details.getName(),
            details.getBuildType(),
            details.getMultiLevelDetail(),
            details.getPhoneNumber(),
            details.getEmail()
        );

        // Send email
        emailService.sendEmail(subject, text);

        return ResponseEntity.ok("Form submitted successfully");
    }
}
