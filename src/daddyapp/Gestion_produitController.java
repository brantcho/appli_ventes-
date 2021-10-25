/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daddyapp;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Brandon Tchoffo
 */
public class Gestion_produitController implements Initializable {

   
    
    @FXML
    private TableView<Produits> table_produit;
    @FXML
    private TableColumn<Produits, Integer> identifiant;
    @FXML
    private TableColumn<Produits, String> nom;
    @FXML
    private TableColumn<Produits, Integer> prix_achat;
    @FXML
    private TableColumn<Produits, Integer> prix_vente;
    @FXML
    private TableColumn<Produits, Integer> quantite;
    @FXML
    private TextField tfid;
    @FXML
    private TextField tfnom;
    @FXML
    private TextField tfquantite;
    @FXML
    private TextField tfprix_achat;
    @FXML
    private TextField tfprix_vente;
    @FXML
    private JFXButton btnajout;
    @FXML
    private JFXButton btnmodifier;
    @FXML
    private JFXButton btnsupp;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        try {
            // TODO
            showProduit();
        } catch (SQLException ex) {
            Logger.getLogger(Gestion_produitController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }    
    
  /*  public Connection  getConnection () {
        Connection conn ;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_bd?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","root");
            return conn ;                  
                    
                    } catch (Exception ex) {
                        System.out.println("Error" +ex.getMessage());
                        return null ;
                    }
    }*/
    
    public ObservableList<Produits> getProduitList() throws SQLException {
  
    ObservableList<Produits> produitList = FXCollections.observableArrayList();
    //Connection conn = getConnection() ;
    String query = "select * from produit" ;
    Statement st ;
    ResultSet rst ;
    
    try {
         st =Daddyapp.cnx.createStatement();
         rst=st.executeQuery(query);
         Produits produit ;
         while (rst.next()) {
             produit = new Produits (rst.getInt("idProduit"), rst.getString("nom"), rst.getInt("quantite"), rst.getInt("prix_achat"),rst.getInt("prix_vente")) ;
             produitList.add(produit);
         }
         
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    
 
return produitList ;
}

    public void showProduit() throws SQLException {
     ObservableList<Produits> list = getProduitList();
     identifiant.setCellValueFactory(new PropertyValueFactory<Produits , Integer>("idProduit"));
     nom.setCellValueFactory(new PropertyValueFactory<Produits , String>("NomProduit"));
     quantite.setCellValueFactory(new PropertyValueFactory<Produits ,Integer>("quantite"));
     prix_achat.setCellValueFactory(new PropertyValueFactory<Produits ,Integer>("prixDAchat"));
     prix_vente.setCellValueFactory(new PropertyValueFactory<Produits ,Integer>("prixDeVente"));
     table_produit.setItems(list);  
}
    
    private void insertRecord() throws SQLException{
       String query = " insert into produit(nom ,quantite ,prix_achat ,prix_vente ) values ('"+tfnom.getText()+"',"+tfquantite.getText()+","+tfprix_achat.getText()+","+tfprix_vente.getText()+")";
       executeQuery(query);
       showProduit();
    }
    
    private void updateRecord() throws SQLException{
        String query ="update produit set nom = '"+tfnom.getText()+"',quantite ="+tfquantite.getText()+", prix_achat ="+tfprix_achat.getText()+" , prix_vente = "+tfprix_vente.getText()+" where idproduit = "+tfid.getText()+" " ;
        executeQuery(query);
        showProduit();
    }
    
    private void deleteButton() throws SQLException{
        String query = "delete from produit where idproduit ="+tfid.getText()+" " ;
        executeQuery(query); 
        showProduit();
    }
    
    private void executeQuery(String query){
        Statement st ;
        
        try {
        
        st = Daddyapp.cnx.createStatement();
        st.executeUpdate(query);
        
    } catch (Exception ex )
    {
        ex.printStackTrace();
    }
}

    @FXML
    private void fonction(ActionEvent event) throws SQLException {
        
        if (event.getSource()==btnajout){
            insertRecord();
        } else if (event.getSource() ==btnmodifier){
            updateRecord();
    }else if (event.getSource() ==btnsupp){
            deleteButton();
    }
        
    }

    @FXML
    private void fonction_table(MouseEvent event) {
      Produits produit =  table_produit.getSelectionModel().getSelectedItem();
      tfid.setText(""+ produit.getIdProduit());
      tfnom.setText(produit.getNomProduit());
      tfquantite.setText(""+ produit.getQuantite());
      tfprix_achat.setText(""+ produit.getPrixDAchat());
      tfprix_vente.setText(""+ produit.getPrixDeVente());
     
      
     
     
    }
    

}
 
