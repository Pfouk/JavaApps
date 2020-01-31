package com.os.ileschinsky.fundamentals.maintask;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        int numberOfElements;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (!in.hasNextInt()){
            throw new IllegalArgumentException("Number of elements should be int!");
        }
        numberOfElements = in.nextInt();
        if (numberOfElements < 0) {
            throw new IllegalArgumentException("Number of arguments can't be negative");
        }
        int[] elements = new int [numberOfElements];
        System.out.print("Enter the operation + or *: ");
        in = new Scanner(System.in);
        String choice = in.nextLine();
        int result;
        switch (choice) {
            case "+":
                result = 0;
                break;
            case "*":
                result = 1;
                break;
            default:
                throw new IllegalArgumentException("Operation should be only + or *");
        }
        in = new Scanner(System.in);
        for (int i = 0; i < numberOfElements; i++) {
            System.out.printf("Enter %d element: ", i);
            elements[i] = in.nextInt();
        }
        for (int i = 0; i < numberOfElements; i++) {
            if (choice.equals("+")) {
                result += elements[i];
            } else {
                result *= elements[i];
            }
        }
        System.out.println("The result is: " + result);
        System.out.println();
    }
}
