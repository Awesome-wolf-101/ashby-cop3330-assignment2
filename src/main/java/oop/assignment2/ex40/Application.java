/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex40;

import oop.assignment2.ex40.Employee;


import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args)
    {

        EmployeeSorter employeesorter = new EmployeeSorter();
        Employee[] EmployeeArray = employeesorter.EmployeeArrayMaker();
        List<Map<String, String>> myList = employeesorter.ListMaker(EmployeeArray);
        String SearchString = employeesorter.InputTaker();
        List<Map<String, String>> FinalList = employeesorter.SearchEmployeeMapList(myList, SearchString);
        FinalList = employeesorter.SortEmployeeMapList(FinalList);
        String OutPutString =  employeesorter.OutPutTime(FinalList);
        System.out.println(OutPutString);
    }
}
