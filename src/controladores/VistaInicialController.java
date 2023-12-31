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
public class VistaInicialController implements Initializable {

    @FXML
    private Button iniciarJuego;
    @FXML
    private Button instrucciones;
    @FXML
    private Button soporte;
    @FXML
    private Button salir;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inicioJuego(ActionEvent event) {
                try {
            // Cargar el archivo FXML de la vista de juego
            Parent vistaJuego = FXMLLoader.load(getClass().getResource("/vistas/VistaJuego.fxml"));
            
            // Crear una nueva escena con la vista de juego
            Scene scene = new Scene(vistaJuego);
            
            // Obtener la ventana actual y establecer la nueva escena
            Stage stage = (Stage) iniciarJuego.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
        
    }

    @FXML
    private void Instrucciones(ActionEvent event) {
         try {
            // Cargar el archivo FXML de la vista de juego
            Parent vistaJuego = FXMLLoader.load(getClass().getResource("/vistas/VistaInstrucciones.fxml"));
            
            // Crear una nueva escena con la vista de juego
            Scene scene = new Scene(vistaJuego);
            
            // Obtener la ventana actual y establecer la nueva escena
            Stage stage = (Stage) instrucciones.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void soporte(ActionEvent event) {
         try {
            // Cargar el archivo FXML de la vista de juego
            Parent vistaJuego = FXMLLoader.load(getClass().getResource("/vistas/VistaSoporte.fxml"));
            
            // Crear una nueva escena con la vista de juego
            Scene scene = new Scene(vistaJuego);
            
            // Obtener la ventana actual y establecer la nueva escena
            Stage stage = (Stage) soporte.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    @FXML
    private void salirApp(ActionEvent event) {
    }
    
}
