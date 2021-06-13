/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_Correct() {
        AnagramDetector anagramDetector = new AnagramDetector();
        boolean actual = anagramDetector.isAnagram("note", "tone");
        boolean expected = true;

        assertEquals(expected, actual);
    }
}