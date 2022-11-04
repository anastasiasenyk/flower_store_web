package com.example.demo.clientserver;

import com.example.demo.flower_properties.Flower;
import com.example.demo.items.FlowerPack;

public interface ClientOrder {
    public void form_pack(Flower flower, int number);
    public void form_bucket(FlowerPack pack);
    public void add_to_order(Object obj);

    public String status();
    public int price();
    public void pay(int payment);
}
