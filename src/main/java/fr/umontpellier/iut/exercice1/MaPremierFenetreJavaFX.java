package fr.umontpellier.iut.exercice1;

import javafx.application.Application;
import javafx.stage.Stage;

public class MaPremierFenetreJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("La page d'un Pro de JavaFX");
        primaryStage.show();
    }
}