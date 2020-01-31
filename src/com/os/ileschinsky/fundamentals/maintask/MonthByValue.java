package com.os.ileschinsky.fundamentals.maintask;

import java.util.Scanner;

public class MonthByValue {
    public static void main(String[] args) {
        byte enteredMonth;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        if (!in.hasNextInt()){
            throw new IllegalArgumentException("Month number should be int!");
        }
        enteredMonth = in.nextByte();
        if (enteredMonth < 1 || enteredMonth > 12) {
            throw new IllegalArgumentException("The number of month should be in range 1-12");
        }
        System.out.print("The month you've entered is ");
        MonthsValues monthByEnteredValue = MonthsValues.values()[enteredMonth - 1];
        System.out.println(monthByEnteredValue.toString().toLowerCase());
    }
}
