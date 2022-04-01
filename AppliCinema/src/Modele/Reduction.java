/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc2020.*;
/**
 *
 * @author pierr
 */
public class Reduction {
    
    Connexion connect = new Connexion("Cinema", "root", "");
    
    public Reduction() throws SQLException, ClassNotFoundException{
        
    }
    
    public void reduction(String Film, String Heure, String Reduction) throws SQLException{
        if(Film == null){
            System.out.println("INSERT INTO  reduction(Pourcentage, ConditionHeure) VALUES ("+Reduction+", '"+Heure+"');");
            connect.executeUpdate("INSERT INTO  reduction(Pourcentage, ConditionHeure) VALUES ("+Reduction+", '"+Heure+"');");
        }
        else{
            connect.executeUpdate("INSERT INTO  reduction(Pourcentage, ID_film) VALUES ("+Reduction+", "+Film+");");
        }
    }
}
