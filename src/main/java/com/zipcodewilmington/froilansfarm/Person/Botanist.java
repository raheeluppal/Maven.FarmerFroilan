package com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;

public class Botanist extends Person {

    public Botanist(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void plant(Crop crop, CropRow cropRow) {
        //cropRow.addCrop(crop);
    }

    @Override
    public void eat(Edible object) {

    }
}
