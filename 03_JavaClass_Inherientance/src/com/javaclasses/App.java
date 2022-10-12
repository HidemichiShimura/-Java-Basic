package com.javaclasses;

import com.javaclasses.Animal.Birds.Eagle.Eagle;
import com.javaclasses.Animal.Fish.Eel.Eel;
import com.javaclasses.Animal.Reptile.Crocodile.Crocodile;

public class App {
    public static void main(String[] args) throws Exception {
        Crocodile crocodile1 = new Crocodile(3, 100, "Unknown", "Unknown", "Unknown", "Unknown", "Unknown");
        Eel eel1 = new Eel(2, 10, "Unknown", "Unknown", true, false,
                true);
        Eagle eagle1 = new Eagle(5, 3, "Unknown", "Unknown", true,
                true);

        System.out.println("Crocodile's info");
        System.out.println("----------------------------");
        crocodile1.showInfo();
        System.out.println("----------------------------");
        System.out.println();

        System.out.println("Eel's info");
        System.out.println("----------------------------");
        eel1.showInfo();
        System.out.println("----------------------------");
        System.out.println();

        System.out.println("Eagle's info");
        System.out.println("----------------------------");
        eagle1.showInfo();
        System.out.println("----------------------------");
        System.out.println();
    }
}