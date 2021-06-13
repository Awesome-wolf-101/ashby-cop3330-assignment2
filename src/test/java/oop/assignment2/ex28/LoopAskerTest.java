/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex28;

import oop.assignment2.ex27.InputChecker;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LoopAskerTest {

    @Test
    void sumuparraylist () {
        ArrayList<Double> SumList = new ArrayList<Double>();
        LoopAsker loopasker = new LoopAsker();
        SumList.add(1.0);
        SumList.add(2.0);
        SumList.add(3.0);
        SumList.add(4.0);
        SumList.add(5.0);
        double actual = loopasker.SumUpArrayList(SumList);
        double expected = 15.00;

        assertEquals(expected, actual, 0.001);
    }
}