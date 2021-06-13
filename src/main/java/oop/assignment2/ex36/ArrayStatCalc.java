/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayStatCalc {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static ArrayList<String> InputTaker()
    {
        ArrayList<String> calcarray = new ArrayList<>();
        while(true)
        {
            System.out.println("Enter a number: ");
            inputString1 = in.nextLine();
            if(OnlyNums(inputString1))
            {
                    calcarray.add(inputString1);
            }
            else if(inputString1.equals("done"))
            {
            break;
            }
            else
            {
                System.out.println("Invalid Input Please Try again ");
            }


        }
        return calcarray;
    }

    public static String ArrayPrinter(ArrayList<String> calcarray)
    {
        String OutputString = "Numbers: ";
        for(int i = 0; i < calcarray.size(); i++)
        {
            if(i != calcarray.size() -1)
            {
                OutputString += calcarray.get(i) + ", ";
            }
            else
            {
                OutputString += calcarray.get(i);
            }
        }

        return OutputString;
    }

    public static double average(ArrayList<String> calcarray)
    {

        double averagesum = 0;
        for(int i = 0; i < calcarray.size(); i++)
        {
            averagesum += Double.parseDouble(calcarray.get(i));
        }

        double average = averagesum / calcarray.size();
        return  average;

    }

    public static double StandardDeviation(ArrayList<String> calcarray, double average)
    {


        String OutputString = "standard deviation ";
        ArrayList<Double> doublearray = StringToDoubleArrayList(calcarray) ;
        double length = calcarray.size();
        double standardDeviation = 0;
        for(double num: doublearray) {
            standardDeviation += Math.pow(num - average, 2);
        }

        return Math.round(Math.sqrt(standardDeviation/length)*100.00)/100.00;
    }

    public static double Max(ArrayList<String> calcarray)
    {

        ArrayList<Double> doublearray = StringToDoubleArrayList(calcarray) ;
        double max = doublearray.get(0);
        for (double i : doublearray) {
            max = Math.max(max, i);
        }
        return max;
    }

    public static double Min(ArrayList<String> calcarray)
    {

        ArrayList<Double> doublearray = StringToDoubleArrayList(calcarray) ;
        double min = doublearray.get(0);
        for (double i : doublearray) {
            min = Math.min(min, i);
        }
        return min;
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

    public static ArrayList<Double>  StringToDoubleArrayList( ArrayList<String> calcarray)
    {
        ArrayList<Double> doublearray = new ArrayList<>();
        for(int i = 0; i < calcarray.size(); i++)
        {
            double temp = Double.parseDouble(calcarray.get(i));
            doublearray.add(temp);
        }


        return doublearray;
    }
}
