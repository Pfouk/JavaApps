package com.os.ileschinsky.classes.optional;

import com.os.ileschinsky.classes.javabean.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalMainElse {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order(71L, 108D));
        list.add(new Order(35L, 114D));
        list.add(new Order(48L, 140D));
        list.add(new Order(10L, 200D));
        list.add(new Order(22L, 234D));
        list.add(new Order(87L, 174D));
        OrderActionOptional action = new OrderActionOptional();
        Optional<Order> optionalOrder = action.findById(list, 7);
//        System.out.println(optionalOrder.orElse(new Order()));
//        System.out.println(optionalOrder.orElseGet(Order::new));
//        System.out.println(optionalOrder.orElseThrow());
        System.out.println(optionalOrder.orElseThrow(IllegalArgumentException::new));
    }
}
