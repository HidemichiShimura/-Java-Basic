package com.javaclasses.Crocodile;

import com.javaclasses.Reptile.Reptile;;

public class Crocodile extends Reptile {
    private String hardShelledEggs;

    // Constructor
    public Crocodile() {
    }

    Crocodile(String drySkin, String backBone, String softShelledEggs, String hardShelledEggs) {
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
    }
}