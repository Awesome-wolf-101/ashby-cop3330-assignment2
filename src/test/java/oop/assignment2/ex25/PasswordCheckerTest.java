/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex25;

import oop.assignment2.ex24.AnagramDetector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void passwordValidator() {
        PasswordChecker passwordchecker = new PasswordChecker();
        int actual = passwordchecker.passwordValidator("1337h@xor!");
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void onlyLetters() {
        PasswordChecker passwordchecker = new PasswordChecker();
        boolean actual = passwordchecker.OnlyLetters("abcdefg");
        boolean expected = true;

        assertEquals(expected, actual);

    }

    @Test
    void onlyNums() {
        PasswordChecker passwordchecker = new PasswordChecker();
        boolean actual = passwordchecker.OnlyNums("12345");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void AtLeastOneNum() {
        PasswordChecker passwordchecker = new PasswordChecker();
        boolean actual = passwordchecker.AtLeastOneNum("abc123def");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void atLeastLetter() {
        PasswordChecker passwordchecker = new PasswordChecker();
        boolean actual = passwordchecker.AtLeastLetter("abc123def");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void atLeastSpecial() {
        PasswordChecker passwordchecker = new PasswordChecker();
        boolean actual = passwordchecker.AtLeastSpecial("@abc123def");
        boolean expected = true;

        assertEquals(expected, actual);;
    }
}