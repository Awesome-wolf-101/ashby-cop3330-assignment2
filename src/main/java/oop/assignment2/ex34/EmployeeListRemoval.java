/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex34;

import java.util.ArrayList;

import java.util.Scanner;

public class EmployeeListRemoval {


    public static void ActualRemover(String InputString, ArrayList<String> employeeNames) {

        if (!employeeNames.contains(InputString)) {
            System.out.println("error, employee not found\n");
        }
        else {

            employeeNames.remove(InputString);
        }

    }

    public static ArrayList<String> InitList() {
        ArrayList<String> employeeNames = new ArrayList<>();
        employeeNames.add("John Smith");
        employeeNames.add("Jackie Jackson");
        employeeNames.add("Chris Jones");
        employeeNames.add("Amanda Cullen");
        employeeNames.add("Jeremy Goodwin");

        return employeeNames;
    }

    public static String PrintList(ArrayList<String> employeeNames) {
        String OutputString = "";
        OutputString += "There are " + employeeNames.size() + " employees. \n";
        for (String item : employeeNames) {
            OutputString += item + "\n";

        }
        return OutputString;
    }
}