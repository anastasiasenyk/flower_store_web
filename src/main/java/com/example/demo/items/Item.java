package com.example.demo.items;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    private String description;
    private double price;
}
