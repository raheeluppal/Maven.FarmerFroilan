package com.zipcodewilmington.froilansfarm.Produce;

public class TomatoPlant extends Crop {

    @Override
    public Edible yield() {
        return new Tomato();
    }
}
