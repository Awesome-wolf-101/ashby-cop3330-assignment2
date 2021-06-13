/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static void PlayGuessNum()
    {
        while(true)
        {
            System.out.println("Let's play Guess the Number!\n" + "Enter the difficulty level (1, 2, or 3):");
            inputString1 = in.next();
            if (!OnlyNums(inputString1)) {
                System.out.println("Sorry. That's not a valid input.");
            }
            else {
                break;
            }
        }
        System.out.println("I have my number. What's your guess?");
        String Guess = "";
        int TotalGuesses = 0;
        int IntGuess = 0;
        int level = Integer.parseInt(inputString1);
        int RandomNum = GuessNumberGenerator(level);
        while(true) {
            Guess = in.next();
            if (!OnlyNums(Guess))
            {
                System.out.println("Sorry. That's not a valid input. Guess again");
                TotalGuesses++;
            }
            else
            {
                IntGuess = Integer.parseInt(Guess);
                if (IntGuess < RandomNum) {
                    System.out.println("Too low. Guess again:");
                    TotalGuesses++;
                } else if (IntGuess > RandomNum) {
                    System.out.println("Too high. Guess again:");
                    TotalGuesses++;
                } else if (IntGuess == RandomNum) {
                    TotalGuesses++;
                    System.out.println("You got it in " + TotalGuesses + " guesses!");
                    break;
                }
            }
        }
    }

    public static int GuessNumberGenerator(int level) {
        Random rand = new Random();
        switch (level) {
            case 1:
                return rand.nextInt(10) + 1;
            case 2:
                return rand.nextInt(100) + 1;
            case 3:
                return rand.nextInt(1000) + 1;
        }
        return 0;
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
