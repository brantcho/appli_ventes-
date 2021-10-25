/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daddyapp;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Brandon Tchoffo
 */
public class Produit {
    
    private final StringProperty idProduit;
    private final StringProperty NomProduit;
    private final StringProperty quantite;
    private final StringProperty prixDAchat;
    private final StringProperty prixDeVente;
    public Produit (String n0,String n1,String n3,String n4,String n5 ){
        idProduit=new SimpleStringProperty(n0);
        NomProduit=new SimpleStringProperty(n1);
                                               
        quantite=new SimpleStringProperty(n3);
        prixDAchat=new SimpleStringProperty(n4);
        prixDeVente=new SimpleStringProperty(n5);
     
    }

     public String getidProduit() {
         
        return idProduit.get();
    }
    public String getNomProduit() {
        return NomProduit.get();
    }

    public String getQuantite() {
        return quantite.get();
    }

  
    public String getPrixDAchat() {
        return prixDAchat.get();
    }

    public String getPrixDeVente() {
        return prixDeVente.get();
    }
    
     public StringProperty idProduitProperty() {
        return idProduit;
    }

    public StringProperty nomProduitProperty() {
        return NomProduit;
    }

    public StringProperty quantiteProperty() {
        return quantite;
    }

  
    public StringProperty prixDAchatProperty() {
        return prixDAchat;
    }

    public StringProperty prixDeVenteProperty() {
        return prixDeVente;
    }
    //setters
  
      
    public void setidProduit(String n0){
        idProduit.set(n0);}
    public void setNomProduit(String n1){
        NomProduit.set(n1);
    }
    
    public void setQuantite(String n1){
        quantite.set(n1);
    }
    public void setPrixDAchat(String n1){
        prixDAchat.set(n1);
    }
    public void setPrixDeVente(String n1){
        prixDeVente.set(n1);
    }

}
