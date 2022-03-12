/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafx.chapter15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GpaCalculator extends Application {
  private TextField tfGrade1 = new TextField();
  private TextField tfHours1 = new TextField();
  private TextField tfGrade2 = new TextField();
  private TextField tfHours2 = new TextField();
  private TextField tfGrade3 = new TextField();
  private TextField tfHours3 = new TextField();
  private TextField tfGpa = new TextField();

  private Button btCalculate = new Button("Calculate");
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create UI
    tfGrade1.setPrefWidth(70);
    tfHours1.setPrefWidth(70);
    tfGrade2.setPrefWidth(70);
    tfHours2.setPrefWidth(70);
    tfGrade3.setPrefWidth(70);
    tfHours3.setPrefWidth(70);
    tfGpa.setPrefWidth(70);
    GridPane gridPane = new GridPane();
    gridPane.setPadding(new Insets(10));
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(new Label("Grade"), 1, 0);
    gridPane.add(new Label("Hours"), 2, 0);
    gridPane.add(new Label("Programming I"), 0, 1);
    gridPane.add(tfGrade1, 1, 1);
    gridPane.add(tfHours1, 2, 1);
    gridPane.add(new Label("Database"), 0, 2);
    gridPane.add(tfGrade2, 1, 2);
    gridPane.add(tfHours2, 2, 2);
    gridPane.add(new Label("Data Structures"), 0, 3);
    gridPane.add(tfGrade3, 1, 3);
    gridPane.add(tfHours3, 2, 3);
    gridPane.add(new Label("GPA"), 0, 4);
    gridPane.add(tfGpa, 1, 4);
    gridPane.add(btCalculate, 2, 5);

    // Set properties for UI
    gridPane.setAlignment(Pos.CENTER);
    tfGrade1.setAlignment(Pos.BOTTOM_RIGHT);
    tfHours1.setAlignment(Pos.BOTTOM_RIGHT);
    tfGrade2.setAlignment(Pos.BOTTOM_RIGHT);
    tfHours2.setAlignment(Pos.BOTTOM_RIGHT);
    tfGrade3.setAlignment(Pos.BOTTOM_RIGHT);
    tfHours3.setAlignment(Pos.BOTTOM_RIGHT);
    tfGpa.setAlignment(Pos.BOTTOM_RIGHT);
    tfGpa.setEditable(false);
    GridPane.setHalignment(btCalculate, HPos.RIGHT);

    // Process events
    btCalculate.setOnAction(e -> calculateGpa());

    // Create a scene and place it in the stage
    Scene scene = new Scene(gridPane, 300, 200);
    primaryStage.setTitle("GpaCalculator"); // Set title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  private void calculateGpa() {
    // Get values from text fields
    double grade1 = Double.parseDouble(tfGrade1.getText());
    int hours1 = Integer.parseInt(tfHours1.getText());
    double grade2 = Double.parseDouble(tfGrade2.getText());
    int hours2 = Integer.parseInt(tfHours2.getText());
    double grade3 = Double.parseDouble(tfGrade3.getText());
    int hours3 = Integer.parseInt(tfHours3.getText());

    // Create a loan object. Loan defined in Listing 10.2
    Gpa gpa = new Gpa(new Course(grade1, hours1), 
            new Course(grade2, hours2), 
            new Course(grade3, hours3));

    // Display monthly payment and total payment
    tfGpa.setText(String.format("%%%.2f",
      gpa.getGpa()));
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
