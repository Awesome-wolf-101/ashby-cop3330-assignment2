/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex32;

import oop.assignment2.ex31.HeartRateCalculator;

import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    private static String  inputString2;
    public static void main(String[] args) {
        NumberGuesser numberguesser = new NumberGuesser();
        boolean playAgain = true;
        while(playAgain)
        {
            numberguesser.PlayGuessNum();
            System.out.println("Do you wish to play again (Y/N)? ");
            inputString2 = in.next();
            if (inputString2.equals("n"))
            {
                break;
            }
            else
            {
                NumberGuesser.PlayGuessNum();
                System.out.println("Do you wish to play again (Y/N)? ");
                inputString2 = in.next();
                if (inputString2.equals("n"))
                {
                    break;
                }
            }
        }


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
