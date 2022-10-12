package com.javaclasses.Animal.Fish;

import com.javaclasses.Animal.Animal;

public class Fish extends Animal {
    private boolean liveInWater;
    private boolean hasGills;

    // Constructor
    public Fish() {
        super();
    }

    public Fish(int height, int weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills) {
        super(height, weight, animalType, bloodType);
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;
    }

    // GET
    public boolean LiveInWater() {
        return this.liveInWater;
    }

    public boolean HasGills() {
        return this.hasGills;
    }

    // SET
    public void setLiveInWater(boolean liveInWater) {
        this.liveInWater = liveInWater;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }
}