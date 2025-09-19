package com.example.taskmanager;

import com.example.taskmanager.model.User;
import com.example.taskmanager.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testRegisterUser() {
        User user = userService.registerUser("testuser", "password");
        assertNotNull(user.getId());
        assertEquals("testuser", user.getUsername());
    }
}
