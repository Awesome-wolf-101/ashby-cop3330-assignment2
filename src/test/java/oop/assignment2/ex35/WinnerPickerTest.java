/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WinnerPickerTest {



    @Test
    void randomGenerator() {
        WinnerPicker winnerpicker = new WinnerPicker();
        ArrayList<String> winnerarray = new ArrayList<>();
        winnerarray.add("Joshua Ashby is Pretty Cool");
        winnerarray.add("That was Pretty narcissistic");
        int i = winnerpicker.RandomGenerator(winnerarray);


        boolean expected = true;
        boolean actual = ( i >= 0) || ( i < winnerarray.size());

        assertEquals(expected, actual );
    }

    @Test
    void winnerPicked() {
        WinnerPicker winnerpicker = new WinnerPicker();
        ArrayList<String> winnerarray = new ArrayList<>();
        winnerarray.add("Joshua Ashby is Pretty Cool");
        winnerarray.add("That was Pretty narcissistic");
        int i = winnerpicker.RandomGenerator(winnerarray);
        String actualString = winnerpicker.WinnerPicked(winnerarray, i);
        boolean actual = actualString.equals("The winner is... Joshua Ashby is Pretty Cool") ||actualString.equals("That was Pretty narcissistic");
        boolean expected = true;

        assertEquals(expected, actual );

    }
}