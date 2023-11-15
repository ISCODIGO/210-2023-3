package com.example.demo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class BindController implements Initializable {
    @FXML private Label etiqueta;
    @FXML private TextField texto;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        etiqueta.textProperty().bind(
                texto.textProperty()
        );
    }
}
