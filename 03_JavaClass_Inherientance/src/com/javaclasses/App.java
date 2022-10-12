package com.javaclasses;

import com.javaclasses.*;
import com.javaclasses.Reptile.Reptile;

public class App {
    public static void main(String[] args) throws Exception {
        Reptile rep = new Reptile(100, 100, "lizard", "B", "Hard", "faoj", "soft");

        System.out.println(rep.getHeight());
    }
}