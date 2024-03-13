package com.example.whackamole;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class MoleGameController implements Initializable {
    @FXML
    private Button playButton, resetButton;
    @FXML
    private Label scoreLabel;
    @FXML
    private GridPane board;
    @FXML
    private TabPane tabPane;
    private int score;
    private Timeline moleSpawnTimeline;

    Image backgroundImage = new Image("file:src/main/resources/com/example/whackamole/mole-bg.jpg");

    // Create BackgroundImage
    BackgroundImage background = new BackgroundImage(
            backgroundImage,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            null,
            new BackgroundSize(1.0, 1.0, true, true, false, false)
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playButton.setOnAction(this::play);
        resetButton.setOnAction(this::reset);
        score = 0;
        tabPane.setBackground(new Background(background));
    }
    private void initializeMoleSpawnTimeline() {
        moleSpawnTimeline = new Timeline(new KeyFrame(Duration.seconds(1.5), event -> spawnMole()));
        moleSpawnTimeline.setCycleCount(20);
        moleSpawnTimeline.play();
    }

    private void play(ActionEvent actionEvent) {
        initializeMoleSpawnTimeline();
        playButton.setDisable(true);
    }

    private void reset(ActionEvent actionEvent){
        moleSpawnTimeline.stop(); // Stop the mole spawn timeline
        playButton.setDisable(false); // Enable controls
        board.getChildren().clear(); // Clear the board
        score = 0; // Reset score
        scoreLabel.setText("0");
    }
    private void spawnMole(){
        double rand = randomMoleGenerator();
        int picker;
        if(rand < 0.9){
            picker = 1;
        } else {
            picker = 2;
        }
        Mole mole = MoleFactory.getMole(picker);
        int xValue = getRandom();
        int yValue = getRandom();

        mole.putIn(xValue, yValue, board);
        // Randomly choose duration for mole visibility
        double duration;
        if(rand < 0.9){
            duration = Math.random() * 0.5 + 0.5;
        } else {
            duration = Math.random() * 0.5 + 0.3;
        }
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(duration), event -> {
            board.getChildren().remove(mole);
        });

        Timeline moleDisappearTimeline = new Timeline(keyFrame);
        moleDisappearTimeline.play();
        for (Node node : board.getChildren()) {
            node.setOnMouseClicked(this::whack); // Add click listener to each node
        }

    }
    private void whack(MouseEvent event){
        Mole whackedMole = (Mole) event.getSource();
        score += whackedMole instanceof SuperMole ? ((SuperMole) whackedMole).getPOINTS() : whackedMole.getPOINTS();
        scoreLabel.setText(Integer.toString(score));
        board.getChildren().remove(whackedMole);
    }
    private int getRandom(){
        return (int) (Math.random() * 4); // Random Y position between 0 and 3 inclusive (Used Board Size 4x4)
    }
    private double randomMoleGenerator(){
        return Math.random();
    }
}