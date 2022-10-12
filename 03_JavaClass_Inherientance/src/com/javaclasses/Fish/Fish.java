package com.javaclasses.Fish;

import com.javaclasses.Animal.Animal;

public class Fish extends Animal {
    private boolean liveInWater;
    private boolean hasGills;

    // Constructor
    public Fish() {
    }

    public Fish(int height, int weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills) {
        super(height, weight, animalType, bloodType);
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;
    }

    // SET
    public void setLiveInWater(boolean liveInWater) {
        this.liveInWater = liveInWater;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }
}