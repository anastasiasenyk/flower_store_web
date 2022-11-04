package com.example.demo.flower_properties.type;
import com.example.demo.flower_properties.Flower;
import com.example.demo.flower_properties.FlowerColor;
import com.example.demo.flower_properties.FlowerType;


public class Tulip extends Flower {
    public static final int TULIP_SEPAL_LENGTH = 11;

    public static final int COEFF = 5;

    public Tulip() {
        setFlowerType(FlowerType.TULIP);
        setColor(FlowerColor.BLUE);
        setSepalLength(TULIP_SEPAL_LENGTH);
        setPrice(getSepalLength()*COEFF);
    }
}
