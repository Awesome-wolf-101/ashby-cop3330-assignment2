/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex31;

import oop.assignment2.ex30.TableGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateCalculatorTest {

    @Test
    void calculateRate() {
        HeartRateCalculator heartratecalculator = new HeartRateCalculator();
        int actual = heartratecalculator.CalculateRate(55, 22, 65);



        assertEquals(138, actual);
    }
}