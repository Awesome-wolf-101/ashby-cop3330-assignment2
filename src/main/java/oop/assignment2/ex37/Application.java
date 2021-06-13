/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex37;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static void main(String[] args)
    {
        PasswordGenerator passwordgenerator = new PasswordGenerator();
        passwordgenerator.InputTaker();
        char [] Password1 = passwordgenerator.generatePassword();
        char [] Password2 = passwordgenerator.JumbleUpArray(Password1);
        String FinalPassword = new String(Password2);
        String OutPutString ="Your password is " + FinalPassword;
        System.out.println(OutPutString);

    }
}
