package com.skillshoft.spingboot.generator;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String userPassword = "loonycorn123";
        String encodedUserPassword = encoder.encode(userPassword);

        System.out.println("User password:" + encodedUserPassword);

        String adminPassword = "loonycorn456";
        String encodedAdminPassword = encoder.encode(adminPassword);

        System.out.println("\n\nAdmin password:" + encodedAdminPassword);
    }
}
