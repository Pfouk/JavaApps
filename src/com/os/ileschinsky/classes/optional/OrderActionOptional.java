package com.os.ileschinsky.classes.optional;

import com.os.ileschinsky.classes.javabean.Order;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrderActionOptional {
    public Optional<Order> findById(List<Order> orders, long id) {
        List<Order> result = orders.stream().filter(o -> id == o.getOrderId()).collect(Collectors.toList());
        Optional<Order> optionalOrder = result.size() != 0 ? Optional.of(result.get(0)) : Optional.empty();
        return optionalOrder;
    }
    public Optional<Order> findByIdOptional(List<Order> orders, long id) {
        Optional<Order> optionalOrder = orders.stream().filter(o -> id == o.getOrderId()).findAny();
        return optionalOrder;
    }
}
