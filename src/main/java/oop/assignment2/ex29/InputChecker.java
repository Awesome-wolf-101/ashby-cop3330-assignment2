/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex29;

public class InputChecker {
    public static boolean Acceptable (String Input)
    {
        if(!OnlyNums(Input))
        {
            return false;
        }
        if(Input.equals("0"))
        {
            return false;
        }
        return true;
    }
    public static double CalcYears (double r)
    {
        return 72/r;
    }

    public static boolean OnlyNums(String InputString) {
        char[] chars = InputString.toCharArray();

        for (char c : chars) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }

        return true;

    }
}
