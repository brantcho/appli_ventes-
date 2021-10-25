/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daddyapp;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Brandon Tchoffo
 */
public class AcceuilController implements Initializable {

    @FXML
    private BorderPane border;
    @FXML
    private JFXButton bouton_affichage;
    @FXML
    private JFXButton btndeconnexion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    FxmlLoader object = new FxmlLoader();
    Pane view = object.getPage("acceuil_page");
    border.setCenter(view);
    }    

   /* @FXML
    private void fonction_affichage(MouseEvent event) throws Exception {
      
        Parent parent = FXMLLoader.load(getClass().getResource("gestion des utilisateurs.fxml")); //nom de ta page fxml
        Scene scene = new Scene (parent);
        Stage app_stage;
        app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();  
      
        
    }*/
    @FXML
    private void fonction_affichage_employes(MouseEvent event){
    FxmlLoader object = new FxmlLoader();
    Pane view = object.getPage("gestion des utilisateurs");
    border.setCenter(view);
    
    
    }

    @FXML
    private void fonction_affichage_produits(MouseEvent event) {
    FxmlLoader object = new FxmlLoader();
    Pane view = object.getPage("gestion_produit");
    border.setCenter(view);
    }

    @FXML
    private void deconnexion(ActionEvent event) throws IOException {
        JOptionPane.showMessageDialog(null, "Vous etes sur que vous voulez vous deconnecter ? ");
         Parent parent = FXMLLoader.load(getClass().getResource("loginpagee.fxml"));  //nom de ta page fxml
         Scene scene = new Scene (parent);
         Stage app_stage;
         app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         app_stage.setScene(scene);
         app_stage.show();
   
    }

    @FXML
    private void acceuil(ActionEvent event) {
    FxmlLoader object = new FxmlLoader();
    Pane view = object.getPage("acceuil_page");
    border.setCenter(view);
   
    }
    
    
}


