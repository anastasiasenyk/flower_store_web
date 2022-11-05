package com.example.demo.clientserver;

import com.example.demo.clientserver.delivery.DeliveryStrategy;
import com.example.demo.clientserver.payments.Payment;
import com.example.demo.flower_properties.Flower;
import com.example.demo.items.FlowerBucket;
import com.example.demo.items.FlowerPack;
import com.example.demo.items.Item;

public interface ClientOrder {
    public void addItem(Item item);
    public void removeItem(Item item);
    public void setPaymentStrategy(Payment strategy);
    public void setDeliveryStrategy(DeliveryStrategy strategy);

    public int calculateTotalPrice();
}
