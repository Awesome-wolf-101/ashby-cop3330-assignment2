/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex31;

public class HeartRateCalculator {
    public static int CalculateRate(int intensity, int age, double restingHR) {

        double TrueIntesity = (intensity/100.00);

        double TargetHeartRate = (((220 - age) - restingHR) * TrueIntesity) + restingHR;
        int RoundTargetHeartRate = (int) Math.round(TargetHeartRate);
        return RoundTargetHeartRate;
    }

    public static String GenerateHeartTable( int age, double restingHR) {
        String OutPutString = "Resting Pulse: " +restingHR+"        Age: "+age;
        OutPutString += "\nIntensity      |Rate ";
        OutPutString += "\n---------------|------";
            for(int i = 55; i <= 95; i += 5)
            {
            int currRate = CalculateRate(i, age, restingHR);
            OutPutString += "\n" + i + "%            |"+ currRate;
            }

            return OutPutString;
    }

}
