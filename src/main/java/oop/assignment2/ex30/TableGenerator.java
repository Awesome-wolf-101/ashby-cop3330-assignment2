/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex30;

public class TableGenerator {
    public static String GenerateTable(int size) {
        String OutputString = "";
        for (int i =1; i<=size; ++i)
        {
            OutputString +=  "\n";
            for (int j =1; j<=size; ++j)
            {
                OutputString += String.format("%4d", + i*j) ;
            }

        }
        return OutputString;
    }
}
