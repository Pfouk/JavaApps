package com.os.ileschinsky.fundamentals.maintask;

public class PrintElementsReverseConsole {
    public static void main(String[] args) {
        System.out.println("Console arguments in reverse order:");
        if (args.length > 0) {
            for (int i = args.length-1; i >= 0; i--){
                System.out.printf("%s ", args[i]);
            }
            System.out.println();
        } else {
            System.out.println("No elements to print");
        }
    }
}
