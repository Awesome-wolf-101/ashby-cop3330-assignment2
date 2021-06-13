/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListRemovalTest {

    @Test
    void actualRemover() {
        EmployeeListRemoval employeelistremoval = new EmployeeListRemoval();
        ArrayList<String> employeeNames = new ArrayList<>();
        employeeNames.add("John Smith");
        employeeNames.add("Jackie Jackson");
        employeeNames.add("Chris Jones");
        employeeNames.add("Amanda Cullen");
        employeeNames.add("Jeremy Goodwin");
        employeelistremoval.ActualRemover("Amanda Cullen", employeeNames);
        int expected = 4;
        int actual = employeeNames.size();

        assertEquals(expected, actual );
    }

    @Test
    void initList() {
        EmployeeListRemoval employeelistremoval = new EmployeeListRemoval();
        ArrayList<String> employeeNames = employeelistremoval.InitList();
        boolean expected = true;
        boolean actual = employeeNames.contains("Chris Jones");

        assertEquals(expected, actual );
    }

    @Test
    void printList() {
        EmployeeListRemoval employeelistremoval = new EmployeeListRemoval();
        ArrayList<String> employeeNames = new ArrayList<>();
        String expected = "There are " + employeeNames.size() + " employees. \n";
        String actual = employeelistremoval.PrintList(employeeNames);

        assertEquals(expected, actual );
    }
}