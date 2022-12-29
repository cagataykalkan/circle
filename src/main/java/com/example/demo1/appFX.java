package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class appFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
       FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("main.fxml"));
       Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
       Scene scene = new Scene(root, Color.RED);

       stage.setScene(scene);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
