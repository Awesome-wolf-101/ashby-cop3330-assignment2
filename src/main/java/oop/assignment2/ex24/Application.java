/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex24;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    private static String  inputString2;

    public static void main(String[] args){
        AnagramDetector anagramDetector = new AnagramDetector();
        inputTime();
        boolean anagramTrue = anagramDetector.isAnagram( inputString1, inputString2);
        String OutputString = OutPutGenerator(inputString1, inputString2, anagramTrue);

        System.out.println(OutputString);
    }

    public static String OutPutGenerator(String str1, String str2, boolean anagramTrue)
    {
        if(anagramTrue)
        {
            return str1 + " and " + str2 + " are anagrams.";
        }
        else
        {
            return str1 + " and " + str2 + " are not anagrams.";
        }
    }

    public static void inputTime()
    {
       System.out.println("Enter two strings and I'll tell you if they are anagrams:");
       System.out.println("Enter the first string:");
        inputString1 = in.next();

       System.out.println("Enter the second string:");
        inputString2 = in.next();

    }

}
