package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FoodStorageTest {
    FoodStorage currentFoodStorage = new FoodStorage();
    LinkedHashMap<String, ArrayList<Edible>> foodStorage;
    ArrayList<Edible> foodToAdd = new ArrayList<>();
    //Produce corn = new Corn();
    String foodName = "Corn";

    @Test
    public void foodStorageConstructorTest() {
        //foodToAdd.add(corn);

    }

}
