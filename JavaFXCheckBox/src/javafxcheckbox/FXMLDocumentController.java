/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxcheckbox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Victor
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private CheckBox checkbox1;

    @FXML
    private CheckBox checkbox2;

    @FXML
    private CheckBox checkbox3;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private TextField text3;
    
    private String str = new String();
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        str="";
        if (checkbox1.isSelected()){
            str=str.concat(text1.getText()).concat("\n");
        }
        if (checkbox2.isSelected()){
            str=str.concat(text2.getText()).concat("\n");
        }
        if (checkbox3.isSelected()){
            str=str.concat(text3.getText()).concat("\n");
        }
        label.setText(str);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
