package com.javaclasses.Animal.Reptile.Crocodile;

import com.javaclasses.Animal.Reptile.Reptile;

public class Crocodile extends Reptile {
    private String hardShelledEggs;

    // Constructor
    public Crocodile(int i, int j, String string, String string2, boolean b, boolean c) {
        hardShelledEggs = "Unknown";
    }

    public Crocodile(int height, int weight, String animalType, String bloodType, String drySkin, String backBone,
            String softShelledEggs) {
        super(height, weight, animalType, bloodType, drySkin, backBone, softShelledEggs);
        this.hardShelledEggs = hardShelledEggs;
    }

    // GET
    public String getHardShelledEggs() {
        return this.hardShelledEggs;
    }

    // SET
    public void setHardShelledEggs(String hardShelledEggs) {
        this.hardShelledEggs = hardShelledEggs;
    }

    public void showInfo() {
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Animal Type: " + this.getAnimalType());
        System.out.println("BloodType: " + this.getBloodType());
        System.out.println("Hard shelled eggs" + this.getHardShelledEggs());
    }
}