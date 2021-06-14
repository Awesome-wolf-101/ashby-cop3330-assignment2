/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex27;

public class InputChecker {

    public static String validateInput (String Firstname, String Lastname, String Zip, String EmployeeID)
    {
        String RetString ="";

        if(!NameLongEnough(Firstname))
        {
            RetString += "\nThe first name must be at least 2 characters long.";
        }
        if(!NameLongEnough(Lastname))
        {
            RetString += "\nThe last name must be at least 2 characters long.";
        }
        if(isEmpty(Firstname))
        {
            RetString += "\nThe first name must be filled in.";
        }
        if(isEmpty(Lastname))
        {
            RetString += "\nThe last name must be filled in.";
        }
        if(!ZipGoodEnough(Zip))
        {
            RetString += "\nThe zipcode must be a 5 digit number.";
        }

        if(!IDGoodEnough(EmployeeID))
        {
            RetString += "\nThe employee ID must be in the format of AA-1234.";
        }

        if(RetString == "")
        {
            RetString = "There were no errors found.";
        }

        return RetString;
    }




    public static boolean IDGoodEnough(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < 2; i++) {
            if(!Character.isLetter(chars[i])) {
                return false;
            }
        }
        if(chars[2] != '-')
        {
            return false;
        }
        for (int i = 3; i < 6; i++) {
            if(!Character.isDigit(chars[i])) {
                return false;
            }
        }
        return true;
    }



    public static boolean NameLongEnough(String input) {
        if(input.length() < 2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static boolean isEmpty(String input)
    {

        return input.equals("");
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

    public static boolean ZipGoodEnough(String input) {
        if(input.length() != 6)
        {
            return false;
        }
        else if(!OnlyNums(input))
        {
            return false;
        }
        return true;
    }
}
