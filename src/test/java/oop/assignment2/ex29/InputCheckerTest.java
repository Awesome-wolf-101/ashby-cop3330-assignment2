/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex29;

import oop.assignment2.ex28.LoopAsker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputCheckerTest {

    @Test
    void acceptable() {
        InputChecker inputchecker = new InputChecker();
        boolean actual = inputchecker.Acceptable("0");
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void CalcYears() {
        InputChecker inputchecker = new InputChecker();
        double actual = inputchecker.CalcYears(4.0);
        double expected = 18;

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void onlyNums() {
        InputChecker inputchecker = new InputChecker();
        boolean actual = inputchecker.OnlyNums("12dre34");
        boolean expected = false;

        assertEquals(expected, actual);
    }
}