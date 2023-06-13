/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuego;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class VistaJuegoController implements Initializable {

    @FXML
    private TextField aciertos;
    @FXML
    private TextField errores;
    @FXML
    private Label num1;
    @FXML
    private Label num2;
    @FXML
    private Label resultado1;
    @FXML
    private ProgressBar barraProgreso;

    private int solucionAleatorio;
    private int numeroAleatorio1;
    private int numeroAleatorio2;
    private int solucion;
    private char operador = ' ';
    private int contadorAciertos = 0;
    private int contadorErrores = 0;
    private AnchorPane menuImagen;

    private Timeline timeline;
    private int segundosTotales = 10;
    private int segundosRestantes = segundosTotales;

    @FXML

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generarNumeroAleatorio();

        // Configurar la ProgressBar
        barraProgreso.setProgress(1.0);
        barraProgreso.setMaxWidth(Double.MAX_VALUE);
        barraProgreso.setStyle("-fx-accent: FFC93C");

        // Configurar el Timeline para repetir cada segundo
        timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), this::actualizarProgreso),
                new KeyFrame(Duration.seconds(6), this::manejarCambioNumero));
        timeline.setCycleCount(segundosTotales);
        timeline.setOnFinished(this::manejarFinTiempo);
        timeline.play();
    }

    @FXML
    private void Clic_Mas(ActionEvent event) {
        operador = '+';
        evaluaOperador();
    }

    @FXML
    private void Clic_Dividir(ActionEvent event) {
        operador = '/';
        evaluaOperador();
    }

    @FXML
    private void Clic_Menos(ActionEvent event) {
        operador = '-';
        evaluaOperador();
    }

    @FXML
    private void Clic_Multiplicar(ActionEvent event) {
        operador = '*';
        evaluaOperador();
    }

    private void generarNumeroAleatorio() {
        Random random = new Random();
        numeroAleatorio1 = random.nextInt(16) + 1;
        numeroAleatorio2 = random.nextInt(16) + 1;
        int operacion = random.nextInt(4) + 1;

        switch (operacion) {
            case 1:
                solucionAleatorio = numeroAleatorio1 + numeroAleatorio2;
                break;
            case 2:
                solucionAleatorio = numeroAleatorio1 - numeroAleatorio2;
                break;
            case 3:
                solucionAleatorio = numeroAleatorio1 * numeroAleatorio2;
                break;
            case 4:
                solucionAleatorio = numeroAleatorio1 * numeroAleatorio2;
                break;
        }

        num1.setText("" + numeroAleatorio1);
        num2.setText("" + numeroAleatorio2);
        resultado1.setText("" + solucionAleatorio);
    }

    private void evaluaOperador() {
        switch (operador) {
            case '+':
                solucion = numeroAleatorio1 + numeroAleatorio2;
                break;
            case '-':
                solucion = numeroAleatorio1 - numeroAleatorio2;
                break;
            case '*':
                solucion = numeroAleatorio1 * numeroAleatorio2;
                break;
            case '/':
                int division = numeroAleatorio1 * numeroAleatorio2;

                if (numeroAleatorio2 >= numeroAleatorio1) {
                    solucion = division / numeroAleatorio1;
                } else if (numeroAleatorio1 >= numeroAleatorio2) {
                    solucion = division / numeroAleatorio2;
                }

                break;
        }

        if (solucionAleatorio == solucion) {
            contadorAciertos++;
        } else {
            contadorErrores++;
        }

        aciertos.setText("" + contadorAciertos);
        errores.setText("" + contadorErrores);
    }

    private void manejarFinTiempo(ActionEvent event) {
        barraProgreso.setProgress(0.0);
        timeline.stop();
        // Aquí puedes agregar la lógica para el final del tiempo (30 segundos)
    }

    private void actualizarProgreso(ActionEvent event) {
        segundosRestantes--;
        double progreso = (double) segundosRestantes / segundosTotales;
        barraProgreso.setProgress(progreso);
    }

    private void manejarCambioNumero(ActionEvent event) {
        generarNumeroAleatorio();
    }

}
