package com.os.ileschinsky.thirdtask;

import java.util.Random;

public class MainTaskThirdConsole {
    public static void main(String[] args) {
        if (args.length != 1 ) {
            throw new IllegalArgumentException("Only one int argument should be given");
        }
        int numberOfElements = Integer.parseInt(args[0]);
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
        System.out.println();
    }
}
