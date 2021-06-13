/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex25;

import oop.assignment2.ex24.AnagramDetector;

import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;


    public static void main(String[] args){
        PasswordChecker passwordchecker = new PasswordChecker();
        inputTime();
        int result = passwordchecker.passwordValidator(inputString1);
        String OutputString = OutPutGenerator(result, inputString1);

        System.out.println(OutputString);
    }

    public static String OutPutGenerator(int result, String inputString1)
    {
        String RetString = "";
        switch (result) {
            case 1:
                 RetString = "The password '"+ inputString1 + "' is a very weak password.";
                break;
            case 2:
                 RetString = "The password '"+ inputString1 + "' is a weak password.";
                break;
            case 3:
                 RetString = "The password '"+ inputString1 + "' is a strong password.";
                break;
            case 4:
                 RetString = "The password '"+ inputString1 + "' is a very strong password.";
                break;
        }
        return  RetString;
    }

    public static void inputTime()
    {
        System.out.println("Enter a password string and I'll tell you how strong your passowrd is:");
        inputString1 = in.next();

    }
}
