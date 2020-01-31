package com.os.ileschinsky.optional;

import com.os.ileschinsky.tryjavabean.Order;

import java.util.*;

public class OptionalMainExt {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order(71L, 108D));
        list.add(new Order(35L, 114D));
        list.add(new Order(48L, 140D));
        list.add(new Order(10L, 200D));
        list.add(new Order(22L, 234D));
        list.add(new Order(87L, 174D));
        OrderActionOptional action = new OrderActionOptional();
        Optional<Order> optionalOrder = action.findById(list, 20);
//        Optional<Order> order = optionalOrder.or(() -> Optional.of(new Order(8, 5000)));
//        System.out.println(order.get());
        Optional<Order> orderFilter = optionalOrder.filter(o -> o.getAmount() == 210);
        System.out.println(orderFilter.get());
    }
}
