package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML private TextField usuario;
    @FXML private PasswordField clave;
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void cambiarScene(String recurso) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(recurso));
        Scene scene = new Scene(fxmlLoader.load(), stage.getWidth(), stage.getHeight());
        stage.setScene(scene);
    }

    @FXML public void entrarClick() throws IOException {
        if (usuario.getText().equals("admin") && clave.getText().equals("1234")) {
            cambiarScene("calculadora-view.fxml");
        } else {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("No pudo ingresar");
            alerta.setHeaderText(null);
            alerta.setContentText("Las credenciales no son validas");
            alerta.showAndWait();
        }
    }
}
