/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex33;

import java.util.Random;
import java.util.Scanner;


public class Magic8Ball {
    private static String[] possibleResponses = {"Yes", "No", "Maybe", "Ask again later"};
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static String AnswerGiver()
    {
        Random rand = new Random();
         int i = rand.nextInt(possibleResponses.length);
        return possibleResponses[i];
    }
}
