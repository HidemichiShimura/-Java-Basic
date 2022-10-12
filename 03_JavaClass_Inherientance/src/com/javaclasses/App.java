package com.javaclasses;

import com.javaclasses.Animal.Birds.Eagle.Eagle;
import com.javaclasses.Animal.Fish.Eel.Eel;
import com.javaclasses.Animal.Reptile.Crocodile.Crocodile;

public class App {
    public static void main(String[] args) throws Exception {
        Crocodile crocodile = new Crocodile();
        Eel eel = new Eel();
        Eagle eagle = new Eagle();

        System.out.println("Crocodile's info");
        System.out.println("----------------------------");
        crocodile.showInfo();
        System.out.println("----------------------------");
        System.out.println();

        System.out.println("Eel's info");
        System.out.println("----------------------------");
        eel.showInfo();
        System.out.println("----------------------------");
        System.out.println();

        System.out.println("Eagle's info");
        System.out.println("----------------------------");
        eagle.showInfo();
        System.out.println("----------------------------");
        System.out.println();
    }
}