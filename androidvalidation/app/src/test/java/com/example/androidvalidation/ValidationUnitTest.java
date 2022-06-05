package com.example.androidvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationUnitTest {
    @Test
    public void validateUser_isCorrect() {
        User user = new User("isip_a.d.shubin@mpt.ru",
                "!Shuba123", "!Shuba123");
        Validator validator = new Validator();
        boolean result = validator.validateUser(user);
        boolean r1 = validator.validateEmail(user.Email);
        boolean r2 = validator.validatePassword(user.Password);
        boolean r3 = validator.validatePasswordsMatch(user.Password, user.ConfirmPassword);
        assertTrue(result);
    }

    @Test
    public void validateEmail_isCorrect() {
        String email = "example@gmail.com";
        Validator validator = new Validator();
        boolean result  = validator.validateEmail(email);
        assertTrue(result);
    }

    @Test
    public void validatePassword_isCorrect() {
        String password = "!Shuba123";
        Validator validator = new Validator();
        boolean result  = validator.validatePassword(password);
        assertTrue(result);
    }

    @Test
    public void validatePassword_matches() {
        String password = "!Shuba123";
        String passwordConfirmation = "!Shuba123";
        Validator validator = new Validator();
        boolean result = validator.validatePasswordsMatch(password, passwordConfirmation);
        assertTrue(result);
    }
}