/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.Billet;
import java.sql.SQLException;
import jdbc2020.Connexion;

/**
 *
 * @author pierr
 */
public class BilletDAO {
    
    private String nomBDD;
    private String username;
    private String password;
    
    public BilletDAO(String nomBDD, String username, String password){
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
    public void addFilm(Billet billet) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO film(facture,id_client,id-film,id_seance,TypePlace) VALUES(" + billet.getFacture() + "," + billet.getId_client() + "," + billet.getId_film() + "," + billet.getId_seance() + ",'" + billet.getTypePlace() + "')";
        connect.executeUpdate(requetAjout);
    }
}
