package com.example.jfxzookeeperkafka;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import org.apache.zookeeper.ZooKeeper;

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
    private FXWatcher z;


    @FXML
    protected void onHelloButtonClick() {
        Process proc = null;
        try {
            String[] cmdss= {"cd /home/lee/Documents/java/zookeeper3.8.2/bin"};
            String[] cmdss1= {"./zkServer.sh start"};
            proc = Runtime.getRuntime().exec(cmdss, null);
            proc = Runtime.getRuntime().exec(cmdss1, null);
            welcomeText.setText("zookeeper ON!");
        } catch (IOException e) {
            System.out.println("Failed to connect to zookeeper!");
        }
    }

    @FXML
    protected void StartZookeeper() throws IOException {
       z = new FXWatcher();
    }

    @FXML
    protected void StopZookeeper() {

    }
}