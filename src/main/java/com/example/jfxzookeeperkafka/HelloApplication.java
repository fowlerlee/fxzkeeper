package com.example.jfxzookeeperkafka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fxzookeeper.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        stage.setTitle("Zookeeper");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException {
        int currentPort = 8080;
        if (args.length == 1) {
            currentPort = Integer.parseInt(args[0]);
        }
        launch();
    }
}