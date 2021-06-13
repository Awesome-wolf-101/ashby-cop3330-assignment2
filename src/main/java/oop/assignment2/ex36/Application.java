/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static void main(String[] args)
    {
        ArrayStatCalc arraystatcalc = new ArrayStatCalc();
        ArrayList<String> calcarray = arraystatcalc.InputTaker();
        String OutPutString1 = arraystatcalc.ArrayPrinter(calcarray);
        System.out.println(OutPutString1);

        String OutPutString2 = "The average is " + arraystatcalc.average(calcarray) +
                "\nThe minimum is " + arraystatcalc.Min(calcarray) +
                "\nThe maximum is " + arraystatcalc.Max(calcarray) +
                "\nThe standard deviation is " + arraystatcalc.StandardDeviation(calcarray, arraystatcalc.average(calcarray));
        System.out.println(OutPutString2);

    }
}
