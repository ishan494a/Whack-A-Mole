package com.example.whackamole;

import javafx.scene.image.Image;

public class SuperMole extends Mole{
    public final int POINTS = 5;

    public SuperMole(Image image){
        super(image);
    }

    public int getPOINTS() {
        return this.POINTS;
    }
}
