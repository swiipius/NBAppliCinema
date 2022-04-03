/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.Film;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import jdbc2020.Connexion;

/**
 *
 * @author pierr
 */
public class FilmDAO {
 
    //Elements de connexion a la bdd
    private String nomBDD;
    private String username;
    private String password;
    
    public FilmDAO(String nomBDD, String username, String password){
        //Recuperation des elements de connexion a la bdd
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
    /**
     * Requete pour ajouter un film
     * @param titre
     * @param NReal
     * @param PReal
     * @param duree
     * @param genre
     * @param note
     * @param synopsis
     * @param affiche
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void addFilm(String titre, String NReal, String PReal, String duree, String genre, String note, String synopsis, String affiche) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO film(Titre,NomRealisateur,PrenomRealisateur,duree,genre,note,synopsis, Affiche) VALUES('" + titre + "','" + NReal + "','" + PReal + "','" + duree + "','" + genre + "','" + note + "','" + synopsis + "', '" + affiche + "')";
        connect.executeUpdate(requetAjout);
    }
    
    /**
     * Requete pour obtenir un film grace au titre
     * @param Titre
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public DefaultListModel<String> getFilmByTitre(String Titre) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT * FROM film WHERE titre = '" + Titre+"';";
        return connect.requestDemande(requeteDemande);
    }
    
    /**
     * Requete pour obtenir un titre grace a une partie de titre
     * @param Titre
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public DefaultListModel<String> getTitreByTitreApprox(String Titre) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT titre FROM film WHERE titre LIKE '%" + Titre+"%';";
        return connect.requestDemande(requeteDemande);
    }
    
    /***
     * Requete pour obtenir un film a partir de l'id
     * @param id
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public DefaultListModel<String> getFilmByID(String id) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT * FROM film WHERE id_film = " + id+";";
        return connect.requestDemande(requeteDemande);
    }
    
    /**
     * Requete pour supprimer un film a partir du titre et du realisateur
     * @param Titre
     * @param NomReal
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void delFilmByTitreAndReal(String Titre, String NomReal) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteSuppr = "DELETE FROM Film WHERE Titre = '" + Titre + "' AND Nomrealisateur = '" + NomReal + "'";
        connect.executeUpdate(requeteSuppr);
    }
    
    /**
     * Requete pour obtenir la liste des titres
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public DefaultListModel<String> getFilmTitre() throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT titre FROM film;";
        return connect.requestDemande(requeteDemande);
    }
  
    /**
     * Requete pour obtenir un realisateur grace a un titre
     * @param titre
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public DefaultListModel<String> getRealByTitre(String titre) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT NomRealisateur, PrenomRealisateur FROM film WHERE titre = '" + titre + "'";
        return connect.requestDemande(requeteDemande);
    }
    
    /**
     * Requete pour le nombre de vue des films (triees)
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public DefaultListModel<String> getFilmTriNbVue() throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT titre FROM film ORDER BY nombreVues DESC";
        return connect.requestDemande(requeteDemande);
    }
   
    /**
     * Requete pour obtenir le nombre de vue d'un film
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public DefaultListModel<String> getNbVue() throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return connect.requestDemande("SELECT nombreVues FROM film ");
    }
    
    /**
     * Requete pour compter le nombre de film
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public int getNbFilm() throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return Integer.parseInt((String)connect.requestDemande("SELECT COUNT(*) FROM film ").get(0));
    }
    
    /**
     * Requete pour mettre a jour le nombre de vue d'un film grace au titre
     * @param titre
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void majNbVueByTitre(String titre) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        connect.executeUpdate("UPDATE film SET nombreVues = nombreVues + 1 WHERE titre LIKE '" + titre + "'");
    }
    
    /**
     * Requete pour obtenir l'id du film grace au titre
     * @param titre
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public String getIDByTitre(String titre) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return (String)connect.requestDemande("SELECT id_film FROM film WHERE titre = '"+titre+"';").get(0);
    }
}
