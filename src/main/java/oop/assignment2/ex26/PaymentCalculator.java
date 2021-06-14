/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex26;

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(double b, double p, double APR) {
        double i = (APR/100)/365;
        double n =   (Math.log(1 + b/p * (1 - Math.pow(1 + i, 30))) / Math.log(1 + i))/30;

        int result = (int) Math.ceil(-n);
        return result;
    }
}
