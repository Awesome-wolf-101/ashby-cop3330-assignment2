/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex38;

import java.util.Scanner;

public class ValueFilter {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    private static String  inputString2;
    private static String  inputString3;
    public static int[] ValueFilter(String Str)
    {
        char[] ch = Str.toCharArray();
        int[] ret = new int[(ch.length)];

        for (int i = 0; i < ch.length; i++)
        {
            int Cur = Character.getNumericValue(ch[i]);
            if(Cur % 2 == 0)
            {
                ret[i] = Cur;
            }


        }


        return ret;
    }

    public static String OutPutGenerator(int[] ret)
    {
        //char[] output = new char[(ret.length)];
        String FinalValue = "";
        for (int i = 0; i < (ret.length); i++)
        {
            if( ret[i] != 0)
            {
                 FinalValue += ret[i] + " ";
            }



        }
        //String FinalValue = new String(output);
        return "The even numbers are " + FinalValue + "\b.";
    }
    public static String InputTaker()
    {
        System.out.println("Enter a list of numbers, separated by spaces: ");
        inputString1 = in.nextLine();
        return inputString1;
    }
}
