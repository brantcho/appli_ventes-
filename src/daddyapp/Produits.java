/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daddyapp;

/**
 *
 * @author Brandon Tchoffo
 */
public class Produits {
       
    private int idProduit;
    private String NomProduit;
    private int quantite;
    private int prixDAchat;
    private int prixDeVente;

    public Produits(int idProduit, String NomProduit, int quantite, int prixDAchat, int prixDeVente) {
        this.idProduit = idProduit;
        this.NomProduit = NomProduit;
        this.quantite = quantite;
        this.prixDAchat = prixDAchat;
        this.prixDeVente = prixDeVente;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public String getNomProduit() {
        return NomProduit;
    }

    public int getQuantite() {
        return quantite;
    }

    public int getPrixDAchat() {
        return prixDAchat;
    }

    public int getPrixDeVente() {
        return prixDeVente;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public void setNomProduit(String NomProduit) {
        this.NomProduit = NomProduit;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrixDAchat(int prixDAchat) {
        this.prixDAchat = prixDAchat;
    }

    public void setPrixDeVente(int prixDeVente) {
        this.prixDeVente = prixDeVente;
    }
    

   
       
}

