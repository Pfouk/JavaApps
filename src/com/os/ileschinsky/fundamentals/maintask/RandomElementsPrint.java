package com.os.ileschinsky.fundamentals.maintask;

import java.util.Random;
import java.util.Scanner;

public class RandomElementsPrint {
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
        Random randomIntToPrint = new Random();
        Random printInLineOrNextLineDecision = new Random();
        for (int i = 0; i < enteredNumberOfElements; i++) {
            switch (printInLineOrNextLineDecision.nextInt(2)){
                case 0:
                    System.out.println(randomIntToPrint.nextInt());
                    break;
                case 1:
                    System.out.print(randomIntToPrint.nextInt() + " ");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }
}
