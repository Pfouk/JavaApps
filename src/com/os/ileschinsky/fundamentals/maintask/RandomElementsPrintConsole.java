package com.os.ileschinsky.fundamentals.maintask;

import java.util.Random;

public class RandomElementsPrintConsole {
    public static void main(String[] args) {
        if (args.length != 1 ) {
            throw new IllegalArgumentException("Only one int argument should be given");
        }
        int enteredNumberOfElements = Integer.parseInt(args[0]);
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
        System.out.println();
    }
}
