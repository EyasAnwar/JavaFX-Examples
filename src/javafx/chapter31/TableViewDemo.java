/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafx.chapter31;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TableViewDemo extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        TableView<Country> tableView = new TableView<>();
        
        Country usa = new Country("USA", "Washington DC", 280, true);
        
        ObservableList<Country> data
                = FXCollections.observableArrayList(
                        usa,
                        new Country("Canada", "Ottawa", 32, true),
                        new Country("United Kingdom", "London", 60, true),
                        new Country("Germany", "Berlin", 83, true),
                        new Country("France", "Paris", 60, true));
        
        tableView.setItems(data);
        
        TableColumn countryColumn = new TableColumn("Country");
        countryColumn.setMinWidth(100);
        countryColumn.setCellValueFactory(
                new PropertyValueFactory<Country, String>("country"));

        TableColumn capitalColumn = new TableColumn("Capital");
        capitalColumn.setMinWidth(100);
        capitalColumn.setCellValueFactory(
                new PropertyValueFactory<Country, String>("capital"));

        TableColumn populationColumn
                = new TableColumn("Population (million)");
        populationColumn.setMinWidth(200);
        populationColumn.setCellValueFactory(
                new PropertyValueFactory<Country, Double>("population"));

        TableColumn democraticColumn
                = new TableColumn("Is Democratic?");
        democraticColumn.setMinWidth(200);
        democraticColumn.setCellValueFactory(
                new PropertyValueFactory<Country, Boolean>("democratic"));

        tableView.getColumns().addAll(countryColumn, capitalColumn,
                populationColumn, democraticColumn);

        Pane pane = new Pane();
        pane.getChildren().add(tableView);
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("TableViewDemo"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the window
        primaryStage.show(); // Display the window
        
        usa.setPopulation(350);
        System.out.println(usa.getPopulation());
    }

    public static class Country {

        private final StringProperty country;
        private final StringProperty capital;
        private final DoubleProperty population;
        private final BooleanProperty democratic;

        private Country(String country, String capital,
                double population, boolean democratic) {
            this.country = new SimpleStringProperty(country);
            this.capital = new SimpleStringProperty(capital);
            this.population = new SimpleDoubleProperty(population);
            this.democratic = new SimpleBooleanProperty(democratic);
        }

        public String getCountry() {
            return country.get();
        }

        public void setCountry(String country) {
            this.country.set(country);
        }
        
        public StringProperty countryProperty(){
            return country;
        }

        public String getCapital() {
            return capital.get();
        }

        public void setCapital(String capital) {
            this.capital.set(capital);
        }
        
        public StringProperty capitalProperty(){
            return capital;
        }

        public double getPopulation() {
            return population.get();
        }

        public void setPopulation(double population) {
            this.population.set(population);
        }
        
        public DoubleProperty populationProperty(){
            return population;
        }

        public boolean isDemocratic() {
            return democratic.get();
        }

        public void setDemocratic(boolean democratic) {
            this.democratic.set(democratic);
        }
        
        public BooleanProperty democraticProperty(){
            return democratic;
        }

        @Override
        public String toString() {
            return country.get();
        }
        
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line. line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
