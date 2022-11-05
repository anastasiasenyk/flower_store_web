package com.example.demo.clientserver;

import java.util.HashMap;
import java.util.Map;


public class OrderServer {
    private Map<Integer, Order> orders = new HashMap<Integer, Order>();
    private int next_id = 14500;

    public boolean add_order(Order one_order){
        if (one_order.getId() != -1){return false;}
        one_order.setId(next_id);
        orders.put(next_id, one_order);
        next_id ++;
        return true;
    }
}
