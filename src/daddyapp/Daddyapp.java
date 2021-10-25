/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daddyapp;

import java.sql.Connection;
import java.sql.DriverManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Brandon Tchoffo
 */
public class Daddyapp extends Application {
    public static Connection cnx;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("loginpagee.fxml"));        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
      
        stage.show();
    }
    
    
    
     @Override
    public void init(){
        cnx = connecterDB();
   
    }

    
     //fonction pour se connecter à la base de données
    public static Connection connecterDB(){
        String url = "jdbc:mysql://localhost:3306/gestion?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password ="root";
        Connection con = null;

        try {
            con = DriverManager.getConnection(url, user,password);
            if (con != null) {
                System.out.println("Database connection is successful !!!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }  

        return con;
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              launch(args);
        
    }
    
}
