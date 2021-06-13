/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment2.ex26;

import oop.assignment2.ex25.PasswordChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {

        PaymentCalculator Paymentcalculator = new PaymentCalculator();
        int actual = Paymentcalculator.calculateMonthsUntilPaidOff(5000, 100, 12);
        int expected = 70;

        assertEquals(expected, actual );
    }
}