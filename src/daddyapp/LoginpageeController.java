/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daddyapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Brandon Tchoffo
 */
public class LoginpageeController implements Initializable {
    
    @FXML
    private BorderPane border;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    FxmlLoader object = new FxmlLoader();
    Pane view = object.getPage("connexion");
    border.setCenter(view);
    }    

    @FXML
    private void connexion(ActionEvent event) {
    FxmlLoader object = new FxmlLoader();
    Pane view = object.getPage("connexion");
    border.setCenter(view);
    }
                                                                                                                    
    @FXML
    private void creation_compte(ActionEvent event) {
    FxmlLoader object = new FxmlLoader();
    Pane view = object.getPage("creation du compte");
    border.setCenter(view);
    }
    
}
