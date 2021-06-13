/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static void main(String[] args)
    {
        WinnerPicker winnerpicker = new WinnerPicker();
        ArrayList<String> winnerarray = winnerpicker.InputTaker();
        int RandNum = winnerpicker.RandomGenerator(winnerarray);
        String OutputString = winnerpicker.WinnerPicked(winnerarray, RandNum);
        System.out.println(OutputString);


    }
}
