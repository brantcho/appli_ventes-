/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daddyapp;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Brandon Tchoffo
 */
public class GestionDesProduitsController implements Initializable {

    @FXML
    private TableView<Produit> table_produit;
    @FXML
    private TableColumn<Produit, String> identifiant;
    @FXML
    private TableColumn<Produit, String> nom;
    @FXML
    private TableColumn<Produit, String> prix_achat;
    @FXML
    private TableColumn<Produit, String> prix_vente;
    @FXML
    private TableColumn<Produit, String> quantite;
   
    // private ObservableList<Produit> data;
    /**
     * Initializes the controller class.
     */
  /*  Statement st;
    ResultSet rst;*/
    
   @Override
    public void initialize(URL url, ResourceBundle rb) {
      /*  try {
            //  data=FXCollections.observableArrayList();
            showProduit();
        } catch (SQLException ex) {
            Logger.getLogger(GestionDesProduitsController.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }    
    
    
    
   /* @FXML
    void actualiser(ActionEvent event) throws SQLException{
        st = Daddyapp.cnx.createStatement();
     
     String query="select * from produit ";
     rst=st.executeQuery(query);
     data.clear();
        while(rst.next())
        {
            data.add(new Produit(rst.getString(1), rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5)));
        }
        identifiant.setCellValueFactory(new PropertyValueFactory<>("idProduit"));
        nom.setCellValueFactory(new PropertyValueFactory<>("NomProduit"));
        quantite.setCellValueFactory(new PropertyValueFactory<>("quantite"));
        prix_achat.setCellValueFactory(new PropertyValueFactory<>("prixDAchat"));
        prix_vente.setCellValueFactory(new PropertyValueFactory<>("prixDeVente"));
        table_produit.setItems(data);
     

    }*/
    
    
    
/*public ObservableList<Produit> getProduitList() throws SQLException {
  
    ObservableList<Produit> produitList = FXCollections.observableArrayList();
    String query = "select * from produit";
    Statement st ;
    ResultSet rst ;
    
    try {
         st = Daddyapp.cnx.createStatement();
         rst=st.executeQuery(query);
         Produit produit ;
         while (rst.next()) {
             produit = new Produit (rst.getString("idProduit"), rst.getString("NomProduit"), rst.getString("quantite"), rst.getString("prixDAchat"),rst.getString("prixDeVente")) ;
             produitList.add(produit);
         }
         
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    
 
return produitList ;
}

public void showProduit() throws SQLException{
     ObservableList<Produit> list = getProduitList();
     identifiant.setCellValueFactory(new PropertyValueFactory<Produit , String>("idProduit"));
     nom.setCellValueFactory(new PropertyValueFactory<Produit , String>("NomProduit"));
     quantite.setCellValueFactory(new PropertyValueFactory<Produit ,String>("quantite"));
     prix_achat.setCellValueFactory(new PropertyValueFactory<Produit ,String>("prixDAchat"));
     prix_vente.setCellValueFactory(new PropertyValueFactory<Produit ,String>("prixDeVente"));
     table_produit.setItems(list);  
}
*/
   

}