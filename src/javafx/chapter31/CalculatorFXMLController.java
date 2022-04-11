/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafx.chapter31;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorFXMLController implements Initializable {

    private Label label;
    @FXML
    private TextField tfNumber1;
    @FXML
    private TextField tfNumber2;
    @FXML
    private TextField tfResult;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void addButtonAction(ActionEvent event) {
        tfResult.setText(getResult('+') + "");
    }

    @FXML
    private void subtractButtonAction(ActionEvent event) {
        tfResult.setText(getResult('−') + "");
    }

    @FXML
    private void multiplyButtonAction(ActionEvent event) {
        tfResult.setText(getResult('*') + "");
    }

    @FXML
    private void divideButtonAction(ActionEvent event) {
        tfResult.setText(getResult('/') + "");
    }

    private double getResult(char op) {
        double number1 = Double.parseDouble(tfNumber1.getText());
        double number2 = Double.parseDouble(tfNumber2.getText());
        switch (op) {
            case '+':
                return number1 + number2;
            case '−':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
        }
        return Double.NaN;
    }
}
