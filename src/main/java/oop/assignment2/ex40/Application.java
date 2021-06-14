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

        EmployeeSearcher employeesearcher = new EmployeeSearcher();
        Employee[] EmployeeArray = employeesearcher.EmployeeArrayMaker();
        List<Map<String, String>> myList = employeesearcher.ListMaker(EmployeeArray);
        String SearchString = employeesearcher.InputTaker();
        List<Map<String, String>> FinalList = employeesearcher.SearchEmployeeMapList(myList, SearchString);
        FinalList = employeesearcher.SortEmployeeMapList(FinalList);
        String OutPutString =  employeesearcher.OutPutTime(FinalList);
        System.out.println(OutPutString);
    }
}
