package com.example.whackamole;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Mole extends ImageView {
    private int currentGridX;
    private int currentGridY;
    public static final int POINTS = 1;

    public Mole(Image image) {
        // Set image and dimensions
        this.setImage(image);
        this.setFitWidth(100.0);
        this.setFitHeight(80.0);
    }
    public int getGridX() {
        return currentGridX;
    }
    public int getGridY() {
        return currentGridY;
    }
    public void putIn(int gridX, int gridY, GridPane board) {
        currentGridX = gridX;
        currentGridY = gridY;
        board.add(this, gridX, gridY);
    }
    public int getPOINTS() {
        return POINTS;
    }
}

