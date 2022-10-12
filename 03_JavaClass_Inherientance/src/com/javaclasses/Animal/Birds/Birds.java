package com.javaclasses.Animal.Birds;

import com.javaclasses.Animal.Animal;

public class Birds extends Animal {
    private boolean animalsWithFeathers;
    private boolean canFly;

    // Constructor
    public Birds() {
        animalsWithFeathers = true;
        canFly = false;
    }

    public Birds(int height, int weight, String animalType, String bloodType, boolean animalsWithFeathers,
            boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.animalsWithFeathers = animalsWithFeathers;
        this.canFly = canFly;
    }

    // GET
    public boolean getAnimalsWithFeathers() {
        return this.animalsWithFeathers;
    }

    public boolean getCanFly() {
        return this.canFly;
    }

    // SET
    public void setAnimalsWithFeathers(boolean animalsWithFeathers) {
        this.animalsWithFeathers = animalsWithFeathers;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}