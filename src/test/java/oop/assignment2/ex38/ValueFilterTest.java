/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueFilterTest {

    @Test
    void valueFilter() {
        ValueFilter valuefilter = new ValueFilter();
        int[] actualarray = valuefilter.ValueFilter("1 2 3 4");
        int[] expectedarray = new int[]{ 0,2,4 };

        assertEquals(expectedarray[0], actualarray[0] );
    }

    @Test
    void outPutGenerator() {
        ValueFilter valuefilter = new ValueFilter();
        int[] actualarray = valuefilter.ValueFilter("1 2 3 4");
        int[] expectedarray = new int[]{ 0,2,4 };
        String ActualString = valuefilter.OutPutGenerator(actualarray);

        assertEquals("The even numbers are 2 4 \b." ,  ActualString);
    }
}