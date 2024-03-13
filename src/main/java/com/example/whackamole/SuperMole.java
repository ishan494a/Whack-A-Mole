package com.example.whackamole;

import javafx.scene.image.Image;

public class SuperMole extends Mole{
    private final int POINT = 5;

    public SuperMole(Image image){
        super(image);
    }

    public int getPOINT() {
        return POINT;
    }
}
