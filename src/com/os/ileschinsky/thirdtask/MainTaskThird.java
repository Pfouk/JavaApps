package com.os.ileschinsky.thirdtask;

import java.util.Random;
import java.util.Scanner;

public class MainTaskThird {
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
        Random r = new Random();
        Random prnt = new Random();
        for (int i = 0; i < numberOfElements; i++) {
            switch (prnt.nextInt(2)){
                case 0:
                    System.out.println(r.nextInt());
                    break;
                case 1:
                    System.out.print(r.nextInt() + " ");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }
}
