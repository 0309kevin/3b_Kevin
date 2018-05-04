/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 02120588279
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField txtValo1;
    @FXML
    private TextField txtValor2;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnSoma;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void soma(ActionEvent event) {
        Double num1 = Double.parseDouble(txtValo1.getText());
        Double num2 = Double.parseDouble(txtValor2.getText());
        Double result = num1 + num2;
        txtResultado.setText(result.toString());
    }
    
}
