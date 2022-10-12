package com.javaclasses.Animal.Reptile;

import com.javaclasses.Animal.Animal;

public class Reptile extends Animal {
    private String drySkin;
    private String backBone;
    private String softShelledEggs;

    // Constructor
    public Reptile() {
        super();
    }

    public Reptile(int height, int weight, String animalType, String bloodType, String drySkin, String backBone,
            String softShelledEggs) {
        super(height, weight, animalType, bloodType);
        this.drySkin = drySkin;
        this.backBone = backBone;
        this.softShelledEggs = softShelledEggs;
    }

    // GET
    public String getDrySkin() {
        return this.drySkin;
    }

    public String getBackBone() {
        return this.backBone;
    }

    public String getSoftShelledEggs() {
        return this.softShelledEggs;
    }

    // SET
    public void setDrySkin(String drySkin) {
        this.drySkin = drySkin;
    }

    public void setBackBone(String backBone) {
        this.backBone = backBone;
    }

    public void setSoftShelledEggs(String softShelledEggs) {
        this.softShelledEggs = softShelledEggs;
    }
}