package com.javaclasses.Animal.Birds.Eagle;

import com.javaclasses.Animal.Birds.Birds;

public class Eagle extends Birds {
    // Constructor
    public Eagle() {
    }

    public Eagle(int height, int weight, String animalType, String bloodType, boolean animalsWithFeathers,
            boolean canFly) {
        super(height, weight, animalType, bloodType, animalsWithFeathers, canFly);
    }

    public void showInfo() {
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Animal Type: " + this.getAnimalType());
        System.out.println("BloodType: " + this.getBloodType());
        System.out.println("Animals with Feather: " + this.getAnimalsWithFeathers());
        System.out.println("CanFly: " + this.getCanFly());
    }
}