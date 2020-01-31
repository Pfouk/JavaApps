package com.os.ileschinsky.secondtask;

import java.util.Scanner;

public class MainTaskSecond {
    public static void main(String[] args) {
        int numberOfElements;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (!in.hasNextInt()){
            throw new IllegalArgumentException("Number of elements should be a digit");
        }
        numberOfElements = in.nextInt();
        if (numberOfElements < 0) {
            throw new IllegalArgumentException("Quantity of elements can't be less than 0");
        }
        String[] elements = new String[numberOfElements];
        in = new Scanner(System.in);
        for (int i = 0; i < numberOfElements; i++) {
            System.out.printf("Enter %d element: ", i);
            elements[i] = in.nextLine();
        }
        System.out.println("Entered elements in reverse order:");
        for (int i = numberOfElements-1; i >= 0; i--) {
            System.out.printf("%s ", elements[i]);
        }
        System.out.println();
    }
}
