/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex39;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args)
    {

        EmployeeSorter employeesorter = new EmployeeSorter();
        Employee[] EmployeeArray = employeesorter.EmployeeArrayMaker();
        List<Map<String, String>> myList = employeesorter.ListMaker(EmployeeArray);
        employeesorter.SortEmployeeMapList(myList);
        String OutPutString =  employeesorter.OutPutTime(myList);
        System.out.println(OutPutString);
    }
}
