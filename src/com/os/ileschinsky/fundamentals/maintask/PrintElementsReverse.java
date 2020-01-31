package com.os.ileschinsky.fundamentals.maintask;

import java.util.Scanner;

public class PrintElementsReverse {
    public static void main(String[] args) {
        int enteredNumberOfElements;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (!in.hasNextInt()){
            throw new IllegalArgumentException("Number of elements should be a digit");
        }
        enteredNumberOfElements = in.nextInt();
        if (enteredNumberOfElements < 0) {
            throw new IllegalArgumentException("Quantity of elements can't be less than 0");
        }
        String[] elements = new String[enteredNumberOfElements];
        in = new Scanner(System.in);
        for (int i = 0; i < enteredNumberOfElements; i++) {
            System.out.printf("Enter %d element: ", i);
            elements[i] = in.nextLine();
        }
        System.out.println("Entered elements in reverse order:");
        for (int i = enteredNumberOfElements-1; i >= 0; i--) {
            System.out.printf("%s ", elements[i]);
        }
        System.out.println();
    }
}
