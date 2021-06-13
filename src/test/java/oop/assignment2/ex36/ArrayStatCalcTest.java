/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStatCalcTest {

    @Test
    void arrayPrinter() {
        ArrayStatCalc arraystatcalc = new ArrayStatCalc();
        ArrayList<String> calcarray = new ArrayList<>();
        calcarray.add("100");
        calcarray.add("200");
        calcarray.add("1000");
        calcarray.add("300");
        String actualString = arraystatcalc.ArrayPrinter(calcarray);
        boolean actual = actualString.equals("Numbers: 100, 200, 1000, 300");
        boolean expected = true;

        assertEquals(expected, actual );

    }

    @Test
    void average() {
        ArrayStatCalc arraystatcalc = new ArrayStatCalc();
        ArrayList<String> calcarray = new ArrayList<>();
        calcarray.add("100");
        calcarray.add("200");
        calcarray.add("1000");
        calcarray.add("300");

        double actual = arraystatcalc.average(calcarray);
        double expected = 400.0;

        assertEquals(expected, actual );


    }

    @Test
    void standardDeviation() {
        ArrayStatCalc arraystatcalc = new ArrayStatCalc();
        ArrayList<String> calcarray = new ArrayList<>();
        calcarray.add("100");
        calcarray.add("200");
        calcarray.add("1000");
        calcarray.add("300");

        double actual = arraystatcalc.StandardDeviation(calcarray, 400.0);
        double expected = 353.55;
        double delta = 0.00001;

        assertEquals(expected, actual, delta);
    }

    @Test
    void max() {
        ArrayStatCalc arraystatcalc = new ArrayStatCalc();
        ArrayList<String> calcarray = new ArrayList<>();
        calcarray.add("100");
        calcarray.add("200");
        calcarray.add("1000");
        calcarray.add("300");

        double actual = arraystatcalc.Max(calcarray);
        double expected = 1000.0;
        double delta = 0.00001;

        assertEquals(expected, actual, delta);
    }

    @Test
    void min() {
        ArrayStatCalc arraystatcalc = new ArrayStatCalc();
        ArrayList<String> calcarray = new ArrayList<>();
        calcarray.add("100");
        calcarray.add("200");
        calcarray.add("1000");
        calcarray.add("300");

        double actual = arraystatcalc.Min(calcarray);
        double expected = 100.0;
        double delta = 0.00001;

        assertEquals(expected, actual, delta);
    }

    @Test
    void onlyNums() {
        ArrayStatCalc arraystatcalc = new ArrayStatCalc();


        boolean actual = arraystatcalc.OnlyNums("Dank Memes");
        boolean expected = false;

        assertEquals(expected, actual );
    }
}