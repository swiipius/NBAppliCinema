/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.*;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import jdbc2020.Connexion;

/**
 *
 * @author pierr
 */
public class ReductionDAO {
    
    private String nomBDD;
    private String username;
    private String password;
    
    public ReductionDAO(String nomBDD, String username, String password){
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
    public void addReduction(String Film, String Heure, String Reduction) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        if(Film == null){;
            connect.executeUpdate("INSERT INTO  reduction(Pourcentage, ConditionHeure) VALUES ("+Reduction+", '"+Heure+"');");
        }
        else{
            connect.executeUpdate("INSERT INTO  reduction(Pourcentage, ID_film) VALUES ("+Reduction+", "+Film+");");
        }
    }
}
