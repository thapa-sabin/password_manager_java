package com.passwordmanager.utils;

import java.util.Random;

/**
 * Utility class for generating random yet strong passwords based on user-defined length
 */
public class PasswordGenerator {
    /**
     * Generates a random password for any specified length.
     * Uses uppercase, lowercase, digits, and symbols.
     * @param length desired password length
     * @return a randomly generated password
     */
    public static String generate(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        }

        return sb.toString();
    }
}