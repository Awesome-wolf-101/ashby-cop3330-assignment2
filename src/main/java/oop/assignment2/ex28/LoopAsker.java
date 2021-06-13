/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex28;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopAsker {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static ArrayList<Double>  InitiateAsking ()
    {
        ArrayList<Double> SumList = new ArrayList<Double>();
        double sum = 0;
        for(int i = 0; i <5; i++)
        {
            System.out.println("Enter a number:");
            inputString1 = in.next();
            double AddToSumList = Double.parseDouble(inputString1);
            SumList.add(AddToSumList);
        }


        return SumList;
    }
    public static Double  SumUpArrayList (ArrayList<Double> SumList)
    {
        double sum = 0;
        for(int i = 0; i < SumList.size(); i++)
        {
                double NumToSum = SumList.get(i);
                sum += NumToSum;
        }
        return sum;
    }

}
