package com.javaclasses.Animal.Birds;

import com.javaclasses.Animal.Animal;

public class Birds extends Animal {
    private String animalsWithFeathers;
    private boolean canFly;

    // Constructor
    public Birds() {
        super();
    }

    public Birds(int height, int weight, String animalType, String bloodType, String animalsWithFeathers,
            boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.animalsWithFeathers = animalsWithFeathers;
        this.canFly = canFly;
    }

    // GET
    public String getAnimalsWithFeathers() {
        return this.animalsWithFeathers;
    }

    public boolean getCanFly() {
        return this.canFly;
    }

    // SET
    public void setAnimalsWithFeathers(String animalsWithFeathers) {
        this.animalsWithFeathers = animalsWithFeathers;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}