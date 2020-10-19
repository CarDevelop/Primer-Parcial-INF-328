/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 59165
 */
public class SumavistaController implements Initializable {

    @FXML
    private Button btnsumar;
    @FXML
    private TextField txtope1;
    @FXML
    private TextField txtope2;
    @FXML
    private TextField resultado;
    @FXML
    private Button btnrestar;
    @FXML
    private Button btndividir;
    @FXML
    private Button btnmultiplicar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void sumar(ActionEvent event) {

        try{
        int op1=Integer.parseInt(this.txtope1.getText());
        int op2=Integer.parseInt(this.txtope2.getText());
        int r=op1+op2;
        this.resultado.setText(r+" ");
            
        }catch(NumberFormatException e){
        }
        
    }

    @FXML
    private void restar(ActionEvent event) {
           try{
        int op1=Integer.parseInt(this.txtope1.getText());
        int op2=Integer.parseInt(this.txtope2.getText());
        int r=op1-op2;
        this.resultado.setText(r+" ");
            
        }catch(NumberFormatException e){
        }
    }

    @FXML
    private void dividir(ActionEvent event) {
           try{
        int op1=Integer.parseInt(this.txtope1.getText());
        int op2=Integer.parseInt(this.txtope2.getText());
        int r=op1/op2;
        this.resultado.setText(r+" ");
            
        }catch(NumberFormatException e){
        }
    }

    @FXML
    private void multiplicar(ActionEvent event) {
           try{
        int op1=Integer.parseInt(this.txtope1.getText());
        int op2=Integer.parseInt(this.txtope2.getText());
        int r=op1*op2;
        this.resultado.setText(r+" ");
            
        }catch(NumberFormatException e){
        }
    }
    
}
