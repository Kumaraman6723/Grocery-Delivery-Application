package org.ncu.GROCERY;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ncu.GROCERY.ENTITY.User;
import org.ncu.GROCERY.SERVICE.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up before each test...");
        userService.getAllUsers().forEach(user -> {
            System.out.println("Deleting user: " + user.getUserId());
            userService.deleteUser(user.getUserId());
        });
    }

    @Test
    public void testSaveUser() {
        User user = UserTestUtils.generateRandomUser();
        System.out.println("Saving user: " + user);
        userService.saveOrUpdateUser(user);

        User retrievedUser = userService.getUserById(user.getUserId());
        System.out.println("Retrieved user: " + retrievedUser);
        assertNotNull(retrievedUser);
        assertEquals(user.getUsername(), retrievedUser.getUsername());
    }

    @Test
    public void testFindAllUsers() {
        User user1 = UserTestUtils.generateRandomUser();
        User user2 = UserTestUtils.generateRandomUser();
        System.out.println("Saving users: " + user1 + ", " + user2);
        userService.saveOrUpdateUser(user1);
        userService.saveOrUpdateUser(user2);

        List<User> users = userService.getAllUsers();
        System.out.println("All users: " + users);
        assertEquals(2, users.size());
    }

    @Test
    public void testFindUserById() {
        User user = UserTestUtils.generateRandomUser();
        System.out.println("Saving user: " + user);
        userService.saveOrUpdateUser(user);

        User retrievedUser = userService.getUserById(user.getUserId());
        System.out.println("Retrieved user: " + retrievedUser);
        assertNotNull(retrievedUser);
        assertEquals(user.getUsername(), retrievedUser.getUsername());
    }

    @Test
    public void testUpdateUser() {
        User user = UserTestUtils.generateRandomUser();
        System.out.println("Saving user: " + user);
        userService.saveOrUpdateUser(user);

        user.setUsername("updatedUsername");
        System.out.println("Updating user: " + user);
        userService.saveOrUpdateUser(user);

        User updatedUser = userService.getUserById(user.getUserId());
        System.out.println("Updated user: " + updatedUser);
        assertNotNull(updatedUser);
        assertEquals("updatedUsername", updatedUser.getUsername());
    }

    @Test
    public void testDeleteUser() {
        User user = UserTestUtils.generateRandomUser();
        System.out.println("Saving user: " + user);
        userService.saveOrUpdateUser(user);

        System.out.println("Deleting user: " + user.getUserId());
        userService.deleteUser(user.getUserId());
        User deletedUser = userService.getUserById(user.getUserId());
        System.out.println("Deleted user: " + deletedUser);
        assertNull(deletedUser);
    }
}