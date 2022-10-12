package com.javaclasses.Animal.Birds.Eagle;

import com.javaclasses.Animal.Birds.Birds;

public class Eagle extends Birds {
    // Constructor
    public Eagle() {
        super();
    }

    public Eagle(String animalsWithFeathers, boolean canFly) {
        super();
    }

    public void showInfo() {
        System.out.println("Height: " + this.getHeight);
        System.out.println("Weight: " + this.getWeigth);
        System.out.println("Animal Type: " + this.getAnimalType);
        System.out.println("BloodType: " + this.getBloodType);
        System.out.println("Animals with Feather: " + this.getAnimalsWithFeathers());
        System.out.println("CanFly: " + this.getCanFly());
    }
}