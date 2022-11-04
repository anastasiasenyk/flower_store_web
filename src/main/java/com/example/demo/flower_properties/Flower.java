package com.example.demo.flower_properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping(path = "List/FlowersType")
@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;

    @Override
    public String toString() {
        return flowerType + "{" +
                "color=" + color.name() +
                ", price=" + price +
                '}';
    }

    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }


}
