package com.example.demo.clientserver;

import com.example.demo.clientserver.delivery.DeliveryStrategy;
import com.example.demo.clientserver.payments.Payment;
import com.example.demo.items.Item;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
public class Order implements ClientOrder {
    private ArrayList<Item> items = new ArrayList<>();

    @Setter
    private int id;
    private int price = 0;
    private Payment payment;
    private DeliveryStrategy delivery;

    public Order(){
        id = -1;
    }

    public void addItem(Item item) {
        items.add(item);
        price += item.getPrice();
    }

    public void removeItem(Item item){
        for (Item one_item: items){
            if (one_item == item){
                items.remove(item);
                return;
            }
        }
    }

    public void setPaymentStrategy(Payment strategy){
        payment = strategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy strategy){
        delivery = strategy;
        if (payment.getPaid() >= price){
            delivery.setDelivery_status(true);
        }
    }

    public int calculateTotalPrice() {
        return getPrice();
    }

    public String status() {
        if (payment.getPaid() >= price){
            return "payment was successful!";
        }
        return "left to pay:" + (price - payment.getPaid());
    }

}


