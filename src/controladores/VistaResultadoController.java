/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author emmal
 */
public class VistaResultadoController implements Initializable {

    @FXML
    private Button BtReiniciar;
    @FXML
    private Button BtErorres;
    @FXML
    private Label ResultAciertos;
    @FXML
    private Label ResultErrores;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void reiniciarVistaResultado(ActionEvent event) {
    }

    @FXML
    private void salirVistaResultado(ActionEvent event) {
    }
    
}
