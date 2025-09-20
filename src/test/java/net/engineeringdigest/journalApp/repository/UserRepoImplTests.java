package net.engineeringdigest.journalApp.repository;


import net.engineeringdigest.journalApp.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.query.Param;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserRepoImplTests {

    @Autowired
    private UserRepoImpl userRepoImpl;

    @Test
    public void testSaveNewUser(){
        Assertions.assertNotNull(userRepoImpl.getUsersForSA());
    }
}
