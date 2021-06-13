/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex33;

import oop.assignment2.ex32.NumberGuesser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void questionAsker() {
        Magic8Ball magic8ball = new Magic8Ball();
        String test = magic8ball.AnswerGiver();
        boolean expected = true;
        boolean actual = (test == "Yes") || (test == "No") || (test == "Maybe") || (test == "Ask again later");

        assertEquals(expected, actual );
    }
}