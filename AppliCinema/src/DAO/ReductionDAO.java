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
  
    //Elements de connexion a la bdd
    private String nomBDD;
    private String username;
    private String password;
    
    public ReductionDAO(String nomBDD, String username, String password){
        //Recuperation des elements de connexion a la bdd
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
    //Requete pour ajouter une reduction
    public void addReduction(String Film, String Heure, String Reduction) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        if(Film == null){;
            connect.executeUpdate("INSERT INTO  reduction(Pourcentage, ConditionHeure) VALUES ("+Reduction+", '"+Heure+"');");
        }
        else{
            connect.executeUpdate("INSERT INTO  reduction(Pourcentage, ID_film) VALUES ("+Reduction+", "+Film+");");
        }
    }
    
    //Requete pour supprimer une reduction
    public void delReducByID(String id) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        connect.executeUpdate("DELETE FROM reduction WHERE id_reduction = " + id + ";");
    }
    
    //Requete pour obtenir les reductions
    public DefaultListModel<String> getReduc() throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return connect.requestDemande("SELECT * FROM reduction;");
    }
    
    //Requete pour les reduction a partir d'un film (triees par ordre decroissant)
    public DefaultListModel<String> getReducByFilm(String id_film) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requete = "SELECT pourcentage FROM reduction WHERE id_film = " + id_film + " ORDER BY pourcentage DESC;";
        return connect.requestDemande(requete);
    }
    
    //Requete pour les reduction a partir d'une seance (triees par ordre decroissant)
    public DefaultListModel<String> getReducBySeance(String id_seance) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requete = "SELECT pourcentage FROM reduction JOIN seance WHERE seance.heureDebut < reduction.conditionHeure AND seance.id_seance = "+id_seance+" ORDER BY pourcentage DESC;";
        return connect.requestDemande(requete);
    }
}
