/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex33;

import java.util.Random;
import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    public static void main(String[] args) {
        Magic8Ball magic8ball = new Magic8Ball();
        System.out.println("What's your question?");
        inputString1 = in.next();
       String OutputString = magic8ball.AnswerGiver();
       System.out.println(OutputString);
    }
}
