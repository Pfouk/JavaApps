package com.os.ileschinsky.anonimous;

public class AnonymousMain2 {
    public static void main(String[] args) {
        Action action = () -> System.out.println("interface");

        action.logic2();
    }
}
