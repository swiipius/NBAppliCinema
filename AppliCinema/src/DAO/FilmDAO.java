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
    
    private String nomBDD;
    private String username;
    private String password;
    
    public FilmDAO(String nomBDD, String username, String password){
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
    public void addFilm(String titre, String NReal, String PReal, String duree, String genre, String note, String synopsis, String affiche) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO film(Titre,NomRealisateur,PrenomRealisateur,duree,genre,note,synopsis, Affiche) VALUES('" + titre + "','" + NReal + "','" + PReal + "','" + duree + "','" + genre + "','" + note + "','" + synopsis + "', '" + affiche + ")";
        connect.executeUpdate(requetAjout);
    }
    
    public DefaultListModel<String> getFilmByTitre(String Titre) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT * FROM film WHERE titre = '" + Titre+"';";
        return connect.requestDemande(requeteDemande);
    }
    
    public DefaultListModel<String> getTitreByTitreApprox(String Titre) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT titre FROM film WHERE titre LIKE '%" + Titre+"%';";
        return connect.requestDemande(requeteDemande);
    }
    
    public DefaultListModel<String> getFilmByID(String id) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT * FROM film WHERE id_film = " + id+";";
        return connect.requestDemande(requeteDemande);
    }
    
    public void delFilmByTitreAndReal(String Titre, String NomReal) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteSuppr = "DELETE FROM Film WHERE Titre = '" + Titre + "' AND Nomrealisateur = '" + NomReal + "'";
        connect.executeUpdate(requeteSuppr);
    }
    
    public DefaultListModel<String> getFilmTitre() throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT titre FROM film;";
        return connect.requestDemande(requeteDemande);
    }
    
    public DefaultListModel<String> getRealByTitre(String titre) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT NomRealisateur, PrenomRealisateur FROM film WHERE titre = '" + titre + "'";
        return connect.requestDemande(requeteDemande);
    }
    
    public DefaultListModel<String> getFilmTriNbVue(String titre) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT titre FROM film ORDER BY nombreVues DESC";
        return connect.requestDemande(requeteDemande);
    }
    
    public DefaultListModel<Integer> getNbVue() throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return connect.requestDemande("SELECT nombreVues FROM film ");
    }
    
    public int getNbFilm() throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return Integer.parseInt((String)connect.requestDemande("SELECT nombreVues FROM film ").get(0));
    }
}
