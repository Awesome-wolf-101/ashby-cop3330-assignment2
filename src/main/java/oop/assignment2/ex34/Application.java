/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex34;

import oop.assignment2.ex33.Magic8Ball;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static void main(String[] args) {
        EmployeeListRemoval employeelistremoval = new EmployeeListRemoval();
        ArrayList<String> employeeNames = employeelistremoval.InitList();
        String StringPrint = employeelistremoval.PrintList(employeeNames);
        System.out.println(StringPrint);
        System.out.println("Enter an employee name to remove:");
        inputString1 = in.nextLine();
        employeelistremoval.ActualRemover(inputString1, employeeNames);
        String StringPrint2 = employeelistremoval.PrintList(employeeNames);
        System.out.println(StringPrint2);

    }
}
