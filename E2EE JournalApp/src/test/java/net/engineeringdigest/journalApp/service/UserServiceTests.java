package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.repository.UserRepo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    UserRepo userRepo;

    @Disabled
    @Test
    public void testAdd(){
        // testinf if our user is present and it doesn't return not null
        assertNotNull(userRepo.findByUserName("Tahaa"));
    }

    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "3,3,9",
            "4,5,13"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected, a+b);
    }
}
