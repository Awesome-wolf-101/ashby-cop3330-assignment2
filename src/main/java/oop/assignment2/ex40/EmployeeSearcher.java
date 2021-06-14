/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex40;

import oop.assignment2.ex40.Employee;

import java.util.*;

public class EmployeeSearcher {
    private static final Scanner in = new Scanner(System.in);
    private static String inputString1;
    private static String inputString2;
    private static String inputString3;


    public static String InputTaker() {
        System.out.println("Enter a search string: ");
        inputString1 = in.nextLine();
        return inputString1;
    }

    public static List<Map<String, String>> ListMaker(Employee[] EmployeeArray) {
        List<Map<String, String>> myList = new ArrayList<Map<String, String>>();
        for (int i = 0; i < EmployeeArray.length; i++) {
            Map<String, String> tempmap = new HashMap<String, String>();
            Employee tempemployee = EmployeeArray[i];
            tempmap = tempemployee.getMap();
            myList.add(tempmap);
        }
        return myList;
    }

    public static Employee[] EmployeeArrayMaker() {
        Employee[] EmployeeArray = new Employee[6];
        Employee John = new Employee("John", "Johnson", "Manager", "2016-12-31");
        Employee Tou = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Employee Michaela = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Employee Jake = new Employee("Jake", "Jacobson", "Programmer", "");
        Employee Jacquelyn = new Employee("Jacquelyn", "Jackson", "DBA", "");
        Employee Sally = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");
        EmployeeArray[0] = John;
        EmployeeArray[1] = Tou;
        EmployeeArray[2] = Michaela;
        EmployeeArray[3] = Jake;
        EmployeeArray[4] = Jacquelyn;
        EmployeeArray[5] = Sally;
        return EmployeeArray;
    }


    public static List<Map<String, String>>  SearchEmployeeMapList(List<Map<String, String>> myList, String inputString1) {
        List<Map<String, String>> results = new ArrayList<Map<String, String>>();

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).get("FirstName").contains(inputString1)) {
                results.add(myList.get(i));
            } else if (myList.get(i).get("LastName").contains(inputString1)) {
                results.add(myList.get(i));
            }

        }
        return results;
    }

        public static String OutPutTime(List<Map<String, String>> myList)
        {
            String OutputString ="Results: \n" + "Name                | Position          | Separation Date" + "\n--------------------|-------------------|----------------";
            for (int i=0; i<myList.size(); i++) {
                String str1 = myList.get(i).get("FirstName") + " " +myList.get(i).get("LastName");
                String str4 = String.format("%-20s|", str1);

                String str2 = String.format(" %-18s|", myList.get(i).get("Position"));
                String str3 = String.format(" %-20s",  myList.get(i).get("SeparationDate"));
                String OutputStringAdder ="\n" + str4 + str2 + str3;
                OutputString += OutputStringAdder;
            }

        return OutputString;
    }

    public static List<Map<String, String>>  SortEmployeeMapList(List<Map<String, String>> myList)
    {
        Collections.sort(myList, new Comparator<Map>() {

            @Override
            public int compare(Map employee1, Map employee2) {

                final String lastName1 = (String) employee1.get("LastName");
                final String lastName2 = (String) employee2.get("LastName");

                return lastName1.compareTo(lastName2);
            }

        });
        return myList;
    }

}
