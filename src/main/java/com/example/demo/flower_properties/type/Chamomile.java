package com.example.demo.flower_properties.type;
import com.example.demo.flower_properties.Flower;
import com.example.demo.flower_properties.FlowerColor;
import com.example.demo.flower_properties.FlowerType;


public class Chamomile extends Flower {
    public static final int CHAMOMILE_SEPAL_LENGTH = 3;
    public static final int COEFF = 5;

    public Chamomile() {
        setFlowerType(FlowerType.CHAMOMILE);
        setColor(FlowerColor.WHITE);
        setSepalLength(CHAMOMILE_SEPAL_LENGTH);
        setPrice(getSepalLength()*COEFF);
    }
}
