/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableGeneratorTest {

    @Test
    void generateTable() {
        TableGenerator tablegenerator = new TableGenerator();
        String actual = tablegenerator.GenerateTable(1);



        assertEquals("" + "\n" + "   1", actual);
    }
}