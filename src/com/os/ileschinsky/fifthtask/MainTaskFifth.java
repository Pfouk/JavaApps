package com.os.ileschinsky.fifthtask;

import java.util.Scanner;

public class MainTaskFifth {
    public static void main(String[] args) {
        int month;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        if (!in.hasNextInt()){
            throw new IllegalArgumentException("Month number should be int!");
        }
        month = in.nextInt();
        System.out.print("The month you've entered is ");
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                throw new IllegalArgumentException("The number of month should be in range 1-12");
        }
    }
}
