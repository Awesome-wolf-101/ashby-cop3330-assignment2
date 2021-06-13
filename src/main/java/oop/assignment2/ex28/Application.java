/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex28;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args){
        ArrayList<Double> SumList = new ArrayList<Double>();
        LoopAsker loopasker = new LoopAsker();
        SumList = loopasker.InitiateAsking();
        double result = loopasker.SumUpArrayList(SumList);
        System.out.printf("The total is %.2f.", result);
    }
}
