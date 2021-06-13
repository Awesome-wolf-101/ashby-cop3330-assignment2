/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    private static String  inputString2;
    private static String  inputString3;
    public static List<Character> alpha = Arrays.asList('a', 'A', 'b', 'B', 'c', 'C', 'd', 'D',  'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'l', 'L', 'm', 'M', 'n', 'N', 'o','O', 'p', 'P', 'q', 'R', 'S', 'T', 'u', 'V', 'W', 'Z');
    public static List<Character> digit = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
    public static List<Character> specchar =  Arrays.asList('!', '#', '$', '%', '&', '(', ')', '*', '+', '-', ':', ';', '<', '=', '>', '?', '@', '[', ']', '^', '_', '{', '|', '}', '~');
    public static void InputTaker()
    {
        System.out.println("What's the minimum length? ");
        inputString1 = in.nextLine();
        System.out.println("How many special characters? ");
        inputString2 = in.nextLine();
        System.out.println("How many numbers? ");
        inputString3 = in.nextLine();
    }

    public static char[] generatePassword()
    {

       int Minlength  = Integer.parseInt(inputString1);
       Random rand = new Random();
       int IdealLength = 0;
       int NumSpecialChars = Integer.parseInt(inputString2);
        int NumOfNums = Integer.parseInt(inputString3);
        int numLetts = Minlength - (NumOfNums + NumSpecialChars);
        if(numLetts < (NumOfNums + NumSpecialChars))
        {
            while((Minlength - (NumOfNums + NumSpecialChars)) < (NumOfNums + NumSpecialChars))
            {
                Minlength++;
            }
        }

            IdealLength = Minlength;
        char[] password = new char[IdealLength];
        for (int i = 0; i < NumOfNums; i++)
        {
            password[i] = digit.get(rand.nextInt(digit.size()));

        }
        for (int i = NumOfNums; i < NumOfNums + NumSpecialChars; i++)
        {
            password[i] = specchar.get(rand.nextInt(specchar.size()));
        }
        for (int i = NumOfNums + NumSpecialChars; i < IdealLength; i++)
        {
            password[i] = alpha.get(rand.nextInt(alpha.size()));
        }

        return password;
    }

    public static char[] JumbleUpArray(char[] str) {
        Random rand = new Random();

        for (int i = 0; i < str.length; i++) {
            int randomIndexToSwap = rand.nextInt(str.length);
            char temp = str[randomIndexToSwap];
            str[randomIndexToSwap] = str[i];
            str[i] = temp;
        }

        return str;

    }

}
