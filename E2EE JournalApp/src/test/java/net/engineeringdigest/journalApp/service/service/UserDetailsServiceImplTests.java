package net.engineeringdigest.journalApp.service.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepo;
import net.engineeringdigest.journalApp.service.UserDetailsServerImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.springframework.security.core.userdetails.UserDetails;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

//@SpringBootTest
public class UserDetailsServiceImplTests {

    //@Autowired
    @InjectMocks
    UserDetailsServerImpl userDetailsServer;

    @Mock
    private UserRepo userRepo;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void loadUserByUsernameTest(){
       // when(userRepo.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("Tahaa").password("abcd").build());
        UserDetails user = userDetailsServer.loadUserByUsername("Tahaa");
        Assertions.assertNotNull(user);
    }

}
