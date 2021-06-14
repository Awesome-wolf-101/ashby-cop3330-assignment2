/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex30;

import oop.assignment2.ex29.InputChecker;

import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static void main(String[] args) {

        TableGenerator tablegenerator = new TableGenerator();

        String OutPutString = tablegenerator.GenerateTable(12);
        System.out.println(OutPutString);
    }

}
