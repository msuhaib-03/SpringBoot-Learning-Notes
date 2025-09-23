package net.engineeringdigest.journalApp.service.service;

import net.engineeringdigest.journalApp.scheduler.UserScheduler;
import net.engineeringdigest.journalApp.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserSchedulerTests {
    @Autowired
    private UserScheduler userScheduler;

    @Test
    void testFetchUsersAndSendEmail(){
        userScheduler.fetchUsersAndSendEmail();
    }
}
