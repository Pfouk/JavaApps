package com.os.ileschinsky.fundamentals.maintask;

import java.util.Scanner;

public class GreetingUser {
    public static void main(String[] args) {
        String userName;
        System.out.print("Please enter your name: ");
        Scanner in = new Scanner(System.in);
        userName = in.nextLine();
        System.out.println("Welcome " + userName + "!");
    }
}


