package com.example.jfxzookeeperkafka;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;


import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label appName = new Label("FX Zookeeper app");
    @FXML
    private CheckBox StartZookeeper;
    @FXML
    private CheckBox StopZookeeper;
    private LeaderElection z;


    @FXML
    protected void onHelloButtonClick() {
        try {
            z = new LeaderElection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        welcomeText.setText("zookeeper ON!");


    }

    @FXML
    protected void StartZookeeper() {
       z.startSession();
    }

    @FXML
    protected void StopZookeeper() {
        z.endSession();
    }
}