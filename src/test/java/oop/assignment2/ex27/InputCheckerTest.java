/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex27;

import oop.assignment2.ex26.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputCheckerTest {

    @Test
    void validateInput() {
    }

    @Test
    void IDGoodEnough() {
        InputChecker inputchecker = new InputChecker();
        boolean actual = inputchecker.IDGoodEnough("A12-1234");
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void nameLongEnough() {
        InputChecker inputchecker = new InputChecker();
        boolean actual = inputchecker.NameLongEnough("J");
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        InputChecker inputchecker = new InputChecker();
        boolean actual = inputchecker.isEmpty("");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void onlyNums() {
        InputChecker inputchecker = new InputChecker();
        boolean actual = inputchecker.OnlyNums("123456");
        boolean expected = true;

        assertEquals(expected, actual);
    }
}