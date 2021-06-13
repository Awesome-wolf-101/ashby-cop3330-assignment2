/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void jumbleUpArray() {
        char[] array = { 'c', 'd', 'e', 'f' };
        PasswordGenerator passwordgenerator = new PasswordGenerator();
        array =passwordgenerator.JumbleUpArray(array);

        boolean actual = !(array[0] == 'c');
        boolean expected = true;

        assertEquals(expected, actual );

    }
}