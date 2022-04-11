/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafx.chapter31;

import javafx.chapter15.GpaCalculator;
import javafx.stage.Stage;

/**
 *
 * @author eyas
 */
public class GpaCalculatorWithStyle extends GpaCalculator{

    @Override
    public void start(Stage primaryStage) {
        super.start(primaryStage);
        primaryStage.getScene().getStylesheets().add("style/gpastyle.css");
        primaryStage.getScene().getRoot().getStyleClass().add("borderpane");
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
