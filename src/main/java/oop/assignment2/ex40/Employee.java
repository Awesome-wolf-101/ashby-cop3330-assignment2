/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex40;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    String Firstname;
    String Lastname;
    String Position;
    String SeperationDate;

    private Map<String, String> map;

    public Employee(String firstName, String lastName, String position, String SeparationDate) {
        map = new HashMap<>();
        map.put("FirstName", firstName);
        map.put("LastName", lastName);
        map.put("Position", position);
        map.put("SeparationDate", SeparationDate);
    }

    public Map<String, String> getMap() {
        return map;
    }


    public String getLastName() {
        return map.get("LastName");
    }

    public String getFirstName() {
        return map.get("FirstName");
    }

    public String getPosition() {
        return map.get( "Position");
    }

    public String getSeparationDate() {
        return map.get("SeparationDate");
    }


    public int compareTo(Object other) {
        final Employee otherEmployeeMap = ((Employee) other);
        final String otherEmployeeMapLastName = otherEmployeeMap.map.get("LastName");
        return this.map.get("LastName").compareTo(otherEmployeeMapLastName);
    }


}
