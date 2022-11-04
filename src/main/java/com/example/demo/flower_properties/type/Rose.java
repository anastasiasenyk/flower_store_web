package com.example.demo.flower_properties.type;
import com.example.demo.flower_properties.Flower;
import com.example.demo.flower_properties.FlowerColor;
import com.example.demo.flower_properties.FlowerType;


public class Rose extends Flower {
    public static final int ROSE_SEPAL_LENGTH = 7;
    public static final int COEFF = 5;

    public Rose() {
        setFlowerType(FlowerType.ROSE);
        setColor(FlowerColor.RED);
        setSepalLength(ROSE_SEPAL_LENGTH);
        setPrice(getSepalLength()*COEFF);
    }
}
