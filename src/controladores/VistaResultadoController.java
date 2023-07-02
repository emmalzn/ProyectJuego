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
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class VistaResultadoController implements Initializable {

    @FXML
    private Button BtReiniciar;
    @FXML
    private Label ResultAciertos;
    @FXML
    private Label ResultErrores;
    @FXML
    private Button BtSalir;

    private int aciertos;
    private int errores;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ResultAciertos.setText(Integer.toString(aciertos));
        ResultErrores.setText(Integer.toString(errores));
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }

    @FXML
    private void reiniciarVistaResultado(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/VistaJuego.fxml"));
            Parent vistaJuego = loader.load();
            VistaJuegoController vistaJuegoController = loader.getController();

            Scene scene = new Scene(vistaJuego);

            Stage stage = (Stage) BtReiniciar.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

            vistaJuegoController.setAciertos(aciertos);
            vistaJuegoController.setErrores(errores);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void salirVistaResultado(ActionEvent event) {
        try {
            Parent vistaInicial = FXMLLoader.load(getClass().getResource("/vistas/VistaInicial.fxml"));
            Scene scene = new Scene(vistaInicial);
            Stage stage = (Stage) BtSalir.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
