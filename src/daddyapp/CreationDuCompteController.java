/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daddyapp;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Brandon Tchoffo
 */
public class CreationDuCompteController implements Initializable {

    @FXML
    private JFXTextField prenom;
    @FXML
    private JFXTextField addresse;
    @FXML
    private JFXTextField nom;
    @FXML
    private JFXTextField mail;
    @FXML
    private JFXTextField tel;
    @FXML
    private JFXTextField mot_de_passe;
    @FXML
    private JFXComboBox poste;
    @FXML
    private JFXButton enregistrer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       try {
            Statement st = Daddyapp.cnx.createStatement();
            ResultSet res = st.executeQuery("select * from poste;");
            while(res.next()){
                poste.getItems().add(res.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreationDuCompteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
  
    

    @FXML
    private void add_user(ActionEvent event) throws SQLException {
        
        Statement st = Daddyapp.cnx.createStatement();
        String query = "insert into employee(nom, prenom, tel, mail,idPoste,addresse,motDepasse) values( '"+nom.getText()+"','"+prenom.getText()+"','"+tel.getText()+"','"+mail.getText()+"','"+poste.getValue()+"','"+addresse.getText()+"','"+mot_de_passe.getText()+"') ";
        st.executeUpdate(query);
        
            JOptionPane.showMessageDialog(null, "compte crée");
        
        }
    }
    
    
