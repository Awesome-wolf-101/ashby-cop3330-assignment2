/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex39;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSorterTest {

    @Test
    void listMaker() {
        EmployeeSorter employeesorter = new EmployeeSorter();
        Employee[] EmployeeArray = employeesorter.EmployeeArrayMaker();
        List<Map<String, String>> myList = employeesorter.ListMaker(EmployeeArray);
        String actual = myList.get(2).get("FirstName");
        String expected = "Michaela";

        assertEquals(expected, actual );
    }

    @Test
    void employeeArrayMaker() {
        EmployeeSorter employeesorter = new EmployeeSorter();
        Employee[] EmployeeArray = employeesorter.EmployeeArrayMaker();

        String actual = EmployeeArray[2].getFirstName();
        String expected = "Michaela";

        assertEquals(expected, actual );

    }

    @Test
    void sortEmployeeMapList() {
        EmployeeSorter employeesorter = new EmployeeSorter();
        Employee[] EmployeeArray = employeesorter.EmployeeArrayMaker();
        List<Map<String, String>> myList = employeesorter.ListMaker(EmployeeArray);

        employeesorter.SortEmployeeMapList(myList);

        String actual = EmployeeArray[2].getFirstName();
        String expected = "Michaela";

        assertEquals(expected, actual );
    }

}