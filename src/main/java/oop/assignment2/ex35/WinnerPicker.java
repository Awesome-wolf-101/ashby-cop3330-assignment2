/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WinnerPicker {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static ArrayList<String> InputTaker() {
        ArrayList<String> winnerarray = new ArrayList<>();
        while(true)
        {
            //int i = 0;
            System.out.println("Enter a name: ");
            inputString1 = in.nextLine();
            if(!inputString1.equals(""))
            {
                winnerarray.add(inputString1);
            }
            else
            {
                break;
            }

        }
            return winnerarray;
    }
    public static int RandomGenerator(ArrayList<String> arraylist)
    {
        Random rand = new Random();
        int i = rand.nextInt(arraylist.size());
        return i - 1;

    }
    public static String WinnerPicked(ArrayList<String> arraylist, int i)
    {
        String OutPutString = "The winner is... " + arraylist.get(i);



        return OutPutString;
    }


}
