/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex29;

import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static void main(String[] args){

        inputTime();
        InputChecker inputchecker = new InputChecker();
        double r = Double.parseDouble(inputString1);
        double result = inputchecker.CalcYears(r);
        System.out.printf("It will take %.2f years to double your initial investment.", result);

    }
    public static void inputTime()
    {
    while (true)
        {
            InputChecker inputchecker = new InputChecker();
            System.out.println("What is the rate of return?");
            inputString1 = in.next();
            if(!inputchecker.Acceptable(inputString1))
            {
            System.out.println("Sorry. That's not a valid input.");
            }
            else
            {
                break;
            }
        }


    }
}
