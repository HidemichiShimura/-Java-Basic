package com.javaclasses.Animal;

public class Animal {
    private int height;
    private int weight;
    private String animalType;
    private String bloodType;

    // Constructor
    public Animal() {
        this.height = 1;
        this.weight = 50;
        this.animalType = "";
        this.bloodType = "B";
    }

    public Animal(int height, int weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    // GET
    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    // SET
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
