package com.example.demo.items;

import com.example.demo.flower_properties.Flower;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Objects;


@Setter @Getter
public class FlowerBucket extends Item {
    /**
     * array of packs.
     */
    private ArrayList<FlowerPack> bucket = new ArrayList<FlowerPack>();

    public double price(){
        return getPrice();
    }

    /**
     * add pack of flower and their amount to the bucket.
     * @param pack flower pack
     */
    public void add(final FlowerPack pack) {
        bucket.add(pack);
        setPrice(pack.getAmount() * pack.getFlower().getPrice());
    }

    public boolean searchFlower(Flower flower){
        for (FlowerPack pack : bucket){
            if (Objects.equals(pack.getFlower().toString(), flower.toString())){
                return true;
            }
        }
        return false;
    }
}
