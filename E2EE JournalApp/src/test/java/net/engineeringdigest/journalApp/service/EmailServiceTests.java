package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {
    @Autowired
    private EmailService emailService;

    @Test
    void testSendEmail(){
        emailService.sendEmail("taha.husnain20@gmail.com","Testing java mail sender", "It is the testing of Java" +
                "email sender through IntelliJ using pass keys to SMTP Gmail Server & let me know if it works!! :) BHAI APPKA HEAVY CODER");
    }
}
