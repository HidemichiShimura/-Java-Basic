package com.javaclasses.Animal.Fish.Eel;

import com.javaclasses.Animal.Fish.Fish;;

public class Eel extends Fish {
    boolean releaseElectricCharge;

    // Constructor
    public Eel() {
    }

    public Eel(int height, int weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills,
            boolean releaseElectricCharge) {
        super(height, weight, animalType, bloodType, liveInWater, hasGills);
        this.releaseElectricCharge = releaseElectricCharge;
    }

    // GET
    public boolean getReleaseElectricCharge() {
        return this.releaseElectricCharge;
    }

    // SET
    public void setReleaseElectricCharge(boolean releaseElectricCharge) {
        this.releaseElectricCharge = releaseElectricCharge;
    }

    public void showInfo() {
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Animal Type: " + this.getAnimalType());
        System.out.println("BloodType: " + this.getBloodType());
        System.out.println("Animals with Feather: " + this.LiveInWater());
        System.out.println("CanFly: " + this.HasGills());
        System.out.println("Release Electric Charge: " + getReleaseElectricCharge());
    }
}