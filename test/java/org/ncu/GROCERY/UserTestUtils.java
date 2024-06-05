package org.ncu.GROCERY;

import java.util.Random;

import org.ncu.GROCERY.ENTITY.User;

public class UserTestUtils {
    private static final Random RANDOM = new Random();

    public static User generateRandomUser() {
        User user = new User();
        user.setUsername(generateRandomString(8)); // Assuming username is 8 characters long
        user.setPassword(generateRandomString(10)); // Assuming password is 10 characters long
        user.setEmail(generateRandomEmail());
        user.setRole(generateRandomRole());
        // userId is generated automatically by the database (since it's AUTO increment), so no need to set it here
        return user;
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(RANDOM.nextInt(characters.length())));
        }
        return sb.toString();
    }

    private static String generateRandomEmail() {
        String[] domains = {"example.com", "test.com", "domain.com"}; // Add more domains as needed
        return generateRandomString(8) + "@" + domains[RANDOM.nextInt(domains.length)];
    }

    private static String generateRandomRole() {
        String[] roles = {"CUSTOMER", "USER", "STORE_OWNER"}; // Add more roles as needed
        return roles[RANDOM.nextInt(roles.length)];
    }
}