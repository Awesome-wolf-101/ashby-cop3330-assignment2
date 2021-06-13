/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex26;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    private static String  inputString2;
    private static String  inputString3;



    public static void main(String[] args){
        PaymentCalculator Paymentcalculator = new PaymentCalculator();
        inputTime();
        double b = Double.parseDouble(inputString1);
        double APR = Double.parseDouble(inputString2);
        double p = Double.parseDouble(inputString3);
        int n = Paymentcalculator.calculateMonthsUntilPaidOff(b, p, APR);
        String OutputString = OutPutGenerator(n);

        System.out.println(OutputString);

    }
    public static void inputTime()
    {
        System.out.println("What is your balance?");
        inputString1 = in.next();
        System.out.println("What is the APR on the card (as a percent)?");
        inputString2 = in.next();
        System.out.println("What is the monthly payment you can make?");
        inputString3 = in.next();





    }

    public static String OutPutGenerator(int n)
    {

        return "It will take you " + n + " months to pay off this card.";
    }
}
