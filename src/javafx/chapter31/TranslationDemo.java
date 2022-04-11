/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafx.chapter31;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TranslationDemo extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        double x = 10;
        double y = 10;
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(10, 10, 50, 60);
            rectangle.setFill(Color.WHITE);
            rectangle.setStroke(Color.color(random.nextDouble(),
                    random.nextDouble(), random.nextDouble()));
            rectangle.setTranslateX(x += 20);
            rectangle.setTranslateY(y += 5);
            System.out.println(rectangle.getX());
            pane.getChildren().add(rectangle);
            
            rectangle.setScaleX(2);
                        
        }
        

        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("TranslationDemo"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the window
        primaryStage.show(); // Display the window
    }

    // Lauch the program from command-line
    public static void main(String[] args) {
        launch(args);
    }
}
