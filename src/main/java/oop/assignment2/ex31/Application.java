/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex31;

import oop.assignment2.ex29.InputChecker;
import oop.assignment2.ex30.TableGenerator;

import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    private static String  inputString2;
    public static void main(String[] args) {
        inputTime();
        int Age = Integer.parseInt(inputString1);
        Double RestingHr = Double.parseDouble(inputString2);
        HeartRateCalculator heartratecalculator = new HeartRateCalculator();
        String OutPutString = heartratecalculator.GenerateHeartTable(Age, RestingHr);
        System.out.println(OutPutString);

    }

    public static void inputTime() {
        while (true) {
            System.out.println("What is your Age?");
            inputString1 = in.next();
            if (!OnlyNums(inputString1)) {
                System.out.println("Sorry. That's not a valid input.");
            }
            else {
                break;
            }
        }
        while (true) {
            System.out.println("What is your Resting Heart Rate?");
            inputString2 = in.next();
            if (!OnlyNums(inputString2)) {
                System.out.println("Sorry. That's not a valid input.");
            }
            else {
                break;
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
