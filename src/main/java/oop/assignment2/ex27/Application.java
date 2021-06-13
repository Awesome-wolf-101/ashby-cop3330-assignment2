/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex27;

import oop.assignment2.ex26.PaymentCalculator;

import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    private static String  inputString2;
    private static String  inputString3;
    private static String  inputString4;


    public static void main(String[] args){
        InputChecker inputchecker = new InputChecker();
        inputTime();

        String OutputString = inputchecker.validateInput(inputString1, inputString2, inputString3, inputString4);


        System.out.println(OutputString);

    }
    public static void inputTime()
    {
        System.out.println("Enter the first name:");
        inputString1 = in.nextLine();
        System.out.println("Enter the last name: ");
        inputString2 = in.nextLine();
        System.out.println("Enter the ZIP code:");
        inputString3 = in.nextLine();
        System.out.println("Enter the employee ID:");
        inputString4 = in.nextLine();


    }



}
