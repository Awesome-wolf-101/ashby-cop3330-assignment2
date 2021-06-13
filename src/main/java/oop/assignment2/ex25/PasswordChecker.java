/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex25;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static int passwordValidator(String passwordString) {
        if(passwordString.length() < 8)
        {
            if(OnlyLetters(passwordString))
            {
                return 2;
            }
            else if(OnlyNums(passwordString))
            {
                return 1;
            }

        }
        else
        {
            if(AtLeastOneNum(passwordString) && AtLeastLetter(passwordString) && ! AtLeastSpecial(passwordString))
            {
                return 3;
            }
            else if(AtLeastOneNum(passwordString) && AtLeastLetter(passwordString) && AtLeastSpecial(passwordString))
            {
                return 4;
            }
        }
return 1;
    }

    public static boolean OnlyLetters (String InputString) {
        char[] chars = InputString.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }

        return true;

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

    public static boolean AtLeastOneNum(String InputString) {
        char[] chars = InputString.toCharArray();

        for (char c : chars) {
            if(Character.isDigit(c)) {
                return true;
            }
        }

        return false;

    }

    public static boolean AtLeastLetter(String InputString) {
        char[] chars = InputString.toCharArray();

        for (char c : chars) {
            if(Character.isLetter(c)) {
                return true;
            }
        }

        return false;

    }

    public static boolean AtLeastSpecial(String InputString) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(InputString);
        boolean b = m.find();

        if (b)
        {
            return true;
        }


        return false;

    }



}
