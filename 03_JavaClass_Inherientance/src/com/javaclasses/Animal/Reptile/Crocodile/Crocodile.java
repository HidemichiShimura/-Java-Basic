package com.javaclasses.Animal.Reptile.Crocodile;

import com.javaclasses.Animal.Reptile.Reptile;

public class Crocodile extends Reptile {
    private String hardShelledEggs;

    // Constructor
    public Crocodile() {
    }

    Crocodile(int height, int weight, String animalType, String bloodType, String hardShelledEggs) {
        super();
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
        System.out.println("Height: " + this.getHeight);
        System.out.println("Weight: " + this.getWeigth);
        System.out.println("Animal Type: " + this.getAnimalType);
        System.out.println("BloodType: " + this.getBloodType);
        System.out.println("Hard shelled eggs" + this.getHardShelledEggs());
    }
}