/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex38;

import oop.assignment2.ex37.PasswordGenerator;

import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static void main(String[] args)
    {
        ValueFilter valuefilter = new ValueFilter();
        String InputString = valuefilter.InputTaker();
        int[] nums = valuefilter.ValueFilter(InputString);

        String OutPutString = valuefilter.OutPutGenerator(nums);
        System.out.println(OutPutString);


    }
}
