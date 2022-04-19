/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxcombobox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafxcombobox.model.Categoria;

/**
 * FXML Controller class
 *
 * @author Victor
 */
public class FXMLComboBoxController implements Initializable {
    
    @FXML
    private ComboBox<Categoria> cbCategorias;
    
    @FXML
    private TextField tfCidade;

    @FXML
    private TextField tfLong;

    @FXML
    private TextField tfLat;

    @FXML
    private TextField tfIrradiacao;

    @FXML
    private Button buttonInserir;
    
    @FXML
    private Label label;
        
    private List<Categoria> categorias = new ArrayList<>();
    
    private ObservableList<Categoria> obsCategorias;
    
    /**
     * Initializes the controller class.
     */
    
    @FXML
    public void carregarCategorias(){
        Categoria categoria1 = new Categoria(1,"São Paulo",23.601,46.649,4.43);
        Categoria categoria2 = new Categoria(2,"Campinas",22.901,47.049,4.90);
        Categoria categoria3 = new Categoria(3,"Belo Horizonte",19.901,43.949,5.13);
        Categoria categoria4 = new Categoria(4,"Uberlândia",18.901,48.249,5.24);
        Categoria categoria5 = new Categoria(5,"Florianópolis",27.601,48.549,4.25);
        Categoria categoria6 = new Categoria(6,"Porto Alegre",30,51.149,4.40);
        
        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
        categorias.add(categoria5);
        categorias.add(categoria6);
        
        obsCategorias = FXCollections.observableArrayList(categorias);
        
        cbCategorias.setItems(obsCategorias);
    }
    
    @FXML
    private void comboAction(ActionEvent event){
        label.setText("Cidade: "+cbCategorias.getValue().getCidade()
                    +"\n"+"Latitude: "+cbCategorias.getValue().getLat()+"º"
                    +"\n"+"Longitude: "+cbCategorias.getValue().getLongit()+"º"
                    +"\n"+"Irradiação Solar: "+cbCategorias.getValue().getIrradiacao()+" kWh/m².dia");
    }
    
    private int i = 6;
    @FXML
    private void buttonAction(ActionEvent event){
        i++;
        String cidade = tfCidade.getText();
        String strLat = tfLat.getText();
        double lat = Double.parseDouble(strLat);
        String strLong = tfLong.getText();
        double longit = Double.parseDouble(strLong);
        String strIrradiacao = tfIrradiacao.getText();
        double irradiacao = Double.parseDouble(strIrradiacao);
        //Adiciona novo objeto a Combo Box
        obsCategorias.add(new Categoria(i,cidade,lat,longit,irradiacao));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        carregarCategorias();
    }
}
