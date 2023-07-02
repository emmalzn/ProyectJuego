/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author emmal
 */
public class VistaSoporteController implements Initializable {

    @FXML
    private Button BtInicio;
    @FXML
    private Button BtInstrucciones;
    @FXML
    private Button Btsalir;
    @FXML
    private Button BtEnviar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Instrucciones(ActionEvent event) {
        try {
            // Cargar el archivo FXML de la vista de juego
            Parent vistaJuego = FXMLLoader.load(getClass().getResource("/vistas/VistaInstrucciones.fxml"));

            // Crear una nueva escena con la vista de juego
            Scene scene = new Scene(vistaJuego);

            // Obtener la ventana actual y establecer la nueva escena
            Stage stage = (Stage) BtInstrucciones.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void salirApp(ActionEvent event) {

    }

    @FXML
    private void inicio(ActionEvent event) {
        try {
            // Cargar el archivo FXML de la vista de juego
            Parent vistaJuego = FXMLLoader.load(getClass().getResource("/vistas/VistaInicial.fxml"));

            // Crear una nueva escena con la vista de juego
            Scene scene = new Scene(vistaJuego);

            // Obtener la ventana actual y establecer la nueva escena
            Stage stage = (Stage) BtInicio.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void Enviar(ActionEvent event) {
         try {
            // Cargar el archivo FXML de la vista de juego
            Parent vistaJuego = FXMLLoader.load(getClass().getResource("/vistas/VistaSoporte.fxml"));

            // Crear una nueva escena con la vista de juego
            Scene scene = new Scene(vistaJuego);

            // Obtener la ventana actual y establecer la nueva escena
            Stage stage = (Stage) BtEnviar.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }         
    }

}
