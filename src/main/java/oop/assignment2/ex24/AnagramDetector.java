/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */

package oop.assignment2.ex24;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        char[] StringArray1 = firstString.toLowerCase().toCharArray();
        char[] StringArray2 = secondString.toLowerCase().toCharArray();
        Arrays.sort(StringArray1);
        Arrays.sort(StringArray2);

        return Arrays.equals(StringArray1, StringArray2);
    }
}
