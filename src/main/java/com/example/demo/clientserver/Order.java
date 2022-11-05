package com.example.demo.clientserver;

import com.example.demo.items.FlowerBucket;
import com.example.demo.items.FlowerPack;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
public class Order implements ClientOrder {
    private ArrayList<FlowerPack> packs = new ArrayList<FlowerPack>();
    private ArrayList<FlowerBucket> buckets = new ArrayList<FlowerBucket>();

    @Setter
    private int id;
    private int price;
    private int payment;

    public Order(){
        id = -1;
    }

    public void add_bucket(FlowerBucket bucket) {
        buckets.add(bucket);
        price += bucket.getPrice();
    }

    public void add_pack(FlowerPack pack) {
        packs.add(pack);
        price += pack.getPrice();
    }

    public String status() {
        if (payment >= price){
            return "payment was successful!";
        }
        return "left to pay:" + (price - payment);
    }

    public int price() {
        return getPrice();
    }

    public void pay(int pay) {
        payment += pay;
    }
}


