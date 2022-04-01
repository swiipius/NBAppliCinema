/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.Seance;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import jdbc2020.Connexion;
/**
 *
 * @author pierr
 */
public class SeanceDAO {
    
    private String nomBDD;
    private String username;
    private String password;
    
    public SeanceDAO(String nomBDD, String username, String password){
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
    public void addSeance(Seance seance) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO film(salle, ID_Film, Date, heureDebut) VALUES('" + seance.getSalle() + "','" + seance.getId_film() + "','" + seance.getDate() + "','" + seance.getHeuredebut() + "');";
        connect.executeUpdate(requetAjout);
    }
}
