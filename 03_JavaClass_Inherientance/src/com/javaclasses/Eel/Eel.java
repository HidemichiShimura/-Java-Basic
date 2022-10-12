package com.javaclasses.Eel;

import com.javaclasses.Fish.Fish;;

public class Eel extends Fish {
    String releaseElectricCharge;

    // Constructor
    public Eel() {
    }

    public Eel(boolean liveInWater, boolean hasGills, String releaseElectricCharge) {
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
    }
}