/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex32;

import oop.assignment2.ex25.PasswordChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGuesserTest {

    @Test
    void guessNumberGenerator() {
        NumberGuesser numberguesser = new NumberGuesser();
        int test = numberguesser.GuessNumberGenerator(1);
        boolean expected = true;
        boolean actual =  (test >= 1)    &&  (test <= 10);

        assertEquals(expected, actual );
    }

    @Test
    void onlyNums() {
        NumberGuesser numberguesser = new NumberGuesser();
        boolean actual = numberguesser.OnlyNums("12345");
        boolean expected = true;

        assertEquals(expected, actual );
    }
}