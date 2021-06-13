/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex30;

import oop.assignment2.ex29.InputChecker;

public class Application {
    public static void main(String[] args) {

        TableGenerator tablegenerator = new TableGenerator();
        String OutPutString = tablegenerator.GenerateTable(1);
        System.out.println(OutPutString);
    }
}
