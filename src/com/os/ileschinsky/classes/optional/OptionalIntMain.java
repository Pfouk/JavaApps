package com.os.ileschinsky.classes.optional;

import java.util.OptionalInt;

public class OptionalIntMain {
    public static void main(String[] args) {
        OptionalInt optionalInt = OptionalInt.of(1);
        int value = optionalInt.getAsInt();
        System.out.println(value);

        OptionalInt optional = OptionalInt.empty();
        int value2 = optional.orElse(777);
        System.out.println(value2);
    }
}
