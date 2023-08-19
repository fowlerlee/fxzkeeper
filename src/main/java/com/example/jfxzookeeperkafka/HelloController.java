package com.example.jfxzookeeperkafka;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label appName = new Label("FX Zookeeper app");
    @FXML
    private CheckBox StartZookeeper;
    @FXML
    private CheckBox StopZookeeper;



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void StartZookeeper() {

    }

    @FXML
    protected void StopZookeeper() {

    }
}