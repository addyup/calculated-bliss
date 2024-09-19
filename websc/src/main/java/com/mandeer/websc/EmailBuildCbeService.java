package com.mandeer.websc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailBuildCbeService {

    private JavaMailSender mailSender = null;

    @Value("${email.recipient}")
    private String recipientEmail;

    public EmailBuildCbeService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(recipientEmail);  // Send to the email specified in application.properties
        message.setSubject(subject);
        message.setText(text);
        message.setFrom("your-email@example.com");

        mailSender.send(message);
    }
}

