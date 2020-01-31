package com.os.ileschinsky.fundamentals.maintask;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        int enteredNumberOfElements;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (!in.hasNextInt()){
            throw new IllegalArgumentException("Number of elements should be int!");
        }
        enteredNumberOfElements = in.nextInt();
        if (enteredNumberOfElements < 0) {
            throw new IllegalArgumentException("Number of arguments can't be negative");
        }
        int[] enterdElementsArray = new int [enteredNumberOfElements];
        System.out.print("Enter the operation + or *: ");
        in = new Scanner(System.in);
        String chosenOperationString = in.nextLine();
        int result;
        switch (chosenOperationString) {
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
        for (int i = 0; i < enteredNumberOfElements; i++) {
            System.out.printf("Enter %d element: ", i);
            enterdElementsArray[i] = in.nextInt();
        }
        for (int i = 0; i < enteredNumberOfElements; i++) {
            if (chosenOperationString.equals("+")) {
                result += enterdElementsArray[i];
            } else {
                result *= enterdElementsArray[i];
            }
        }
        System.out.println("The result is: " + result);
        System.out.println();
    }
}
