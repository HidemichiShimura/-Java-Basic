package com.javaclasses.Animal.Fish.Eel;

import com.javaclasses.Animal.Fish.Fish;;

public class Eel extends Fish {
    String releaseElectricCharge;

    // Constructor
    public Eel() {
        super();
    }

    public Eel(int height, int weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills,
            String releaseElectricCharge) {
        super();
        this.releaseElectricCharge = releaseElectricCharge;
    }

    // GET
    public String getReleaseElectricCharge() {
        return this.releaseElectricCharge;
    }

    // SET
    public void setReleaseElectricCharge(String releaseElectricCharge) {
        this.releaseElectricCharge = releaseElectricCharge;
    }

    public void showInfo() {
        System.out.println("Height: " + this.getHeight);
        System.out.println("Weight: " + this.getWeigth);
        System.out.println("Animal Type: " + this.getAnimalType);
        System.out.println("BloodType: " + this.getBloodType);
        System.out.println("Animals with Feather: " + this.LiveInWater());
        System.out.println("CanFly: " + this.HasGills());
        System.out.println("Release Electric Charge: " + getReleaseElectricCharge());
    }
}