/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxbásico1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Victor
 */
public class FXMLButtonController implements Initializable {
    
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    
    @FXML
    private TextField textField;
    
    @FXML
    private void handleSurpriseAction(ActionEvent event) {
        System.out.println("You scared the shit out of me!");
        label2.setText("Surprise! It is me, Mario.");
    }
    @FXML
    private void handleKnockKnockAction(ActionEvent event){
        System.out.println("Somebody knocked the door.");
        label1.setText("Who is it?");
    }
    @FXML
    private void papagayoAction(ActionEvent event){
        String str = textField.getText();
        label3.setText(str);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
