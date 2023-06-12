/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuego;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;
import javafx.scene.control.ProgressBar;

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
    private int contadorErrores = -1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        generarNumeroAleatorio();
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
        

        evaluaOperador();
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
                int solucion = numeroAleatorio1 * numeroAleatorio2;

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
}
