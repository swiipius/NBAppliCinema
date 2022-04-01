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
    
    public void addFilm(Film film) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO film(Titre,NomRealisateur,PrenomRealisateur,duree,genre,note,synopsis, Affiche) VALUES('" + film.getTitre() + "','" + film.getNomRealisateur() + "','" + film.getPrenomRealisateur() + "','" + film.getDuree() + "','" + film.getGenre() + "','" + film.getNote() + "','" + film.getSynopsis() + "', '" + film.getAffiche()+ ")";
        connect.executeUpdate(requetAjout);
    }
    
    public DefaultListModel<String> getFilmByTitre(String Titre) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT * FROM film WHERE titre = '" + Titre+"';";
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
}
