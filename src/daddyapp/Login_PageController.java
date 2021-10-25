/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daddyapp;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Brandon Tchoffo
 */
public class Login_PageController implements Initializable {

    @FXML
    private JFXTextField email;
    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXButton login;
    private JFXComboBox poste;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        poste.getItems().addAll("Patron","Employé");
    }    

    @FXML
    private void connexion(ActionEvent event) throws SQLException, IOException {
        
        String Email = email.getText();
        String mot_de_passe  = password.getText();
        
        Statement st = Daddyapp.cnx.createStatement();
        String query = "select mail, motDepasse from employee where mail = '" + Email + "' and  motDepasse ='" + mot_de_passe + "' ";
        ResultSet rst = st.executeQuery(query);
       
        
        if (email.getText().equals("") && password.getText().equals("")){
        
        JOptionPane.showMessageDialog(null, "entrez l'email et le mot de passe ");
        }
        
        else if (email.getText().equals("")&& !password.getText().equals("")){
            
             JOptionPane.showMessageDialog(null, "champs email vide ");
        }
        
        else if(!email.getText().equals("")&& password.getText().equals("")) {
         JOptionPane.showMessageDialog(null, "champs mot de passe vide ");
        }
         
        else  if ((rst.next())&&(!email.getText().equals("")) && (!password.getText().equals("")))  {                                          //bouton qui effectuera l'action
            JOptionPane.showMessageDialog(null, "l'email et le mot de passe sont corrects");
            Parent parent = FXMLLoader.load(getClass().getResource("acceuill.fxml")); //nom de ta page fxml
            Scene scene = new Scene (parent);
            Stage app_stage;
            app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(scene);
            app_stage.show();
   
        }else if (!(rst.next())&&(!email.getText().equals("")) && (!password.getText().equals(""))){
          JOptionPane.showMessageDialog(null, "email ou mot de passe invalide");
        }
        
    }

   

    }
    

