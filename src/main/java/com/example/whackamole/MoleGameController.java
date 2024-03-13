package com.example.whackamole;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;

public class MoleGameController implements Initializable {
    @FXML
    private Button playButton, resetButton;
    @FXML
    private Label scoreLabel;
    @FXML
    private GridPane board;
    private int score;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playButton.setOnAction(this::play);
        resetButton.setOnAction(this::reset);
        score = 0;
    }

    private void play(ActionEvent actionEvent) {
        playButton.setDisable(true);
    }

    private void reset(ActionEvent actionEvent){
        playButton.setDisable(false); // Enable controls
        board.getChildren().clear(); // Clear the board
        score = 0; // Reset score
    }
    private void pickAMole(){
        // Pick a Mole randomly, 1:4 chances of picking Super Mole that lasts only for a short time;
        // Implement a timer and a delete function that removes the mole

    }
    private void populate(int picker){

    }
    private int getRandom(){
        return (int) (Math.random() * 4); // Random Y position between 0 and 3 inclusive (Used Board Size 4x4)
    }
    private double randomMoleGenerator(){
        return Math.random();
    }
}