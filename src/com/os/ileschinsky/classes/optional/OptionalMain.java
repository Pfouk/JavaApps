package com.os.ileschinsky.classes.optional;

import com.os.ileschinsky.classes.javabean.Order;

import java.util.*;

public class OptionalMain {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order(71L, 108D));
        list.add(new Order(35L, 114D));
        list.add(new Order(48L, 140D));
        list.add(new Order(10L, 200D));
        list.add(new Order(22L, 234D));
        list.add(new Order(87L, 174D));
        OrderActionOptional action = new OrderActionOptional();
        Optional<Order> optionalOrder = action.findById(list, 10);
        if (optionalOrder.isPresent()){
            System.out.println(optionalOrder.get());
        }
        Set<Order> orderSet = new HashSet<>();
        optionalOrder.ifPresent(o -> orderSet.add(o));
        System.out.println(orderSet);
    }
}
