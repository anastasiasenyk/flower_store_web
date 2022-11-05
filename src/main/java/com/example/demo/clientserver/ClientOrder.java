package com.example.demo.clientserver;

import com.example.demo.flower_properties.Flower;
import com.example.demo.items.FlowerBucket;
import com.example.demo.items.FlowerPack;

public interface ClientOrder {
    public void add_bucket(FlowerBucket bucket);
    public void add_pack(FlowerPack pack);

    public void getId();
    public String status();
    public int price();

    public void pay(int payment);
}
