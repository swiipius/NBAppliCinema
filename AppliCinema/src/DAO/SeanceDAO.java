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
  
    //Elements de connexion a la bdd
    private String nomBDD;
    private String username;
    private String password;
    
    public SeanceDAO(String nomBDD, String username, String password){
        //Recuperation des elements de connexion a la bdd
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
    //Requete pour ajouter une seance
    public void addSeance(int salle, int film, String date, String heure) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO seance(salle, ID_Film, Date, heureDebut) VALUES(" + salle + "," + film + ",'" + date + "','" + heure + "');";
        connect.executeUpdate(requetAjout);
    }
    
    //Requete pour supprimer une seance a partir du film, de la date et de l'heure
    public void delSeanceByFilmDateHeure(int id_film, String date, String heure) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteSuppr = "DELETE FROM seance WHERE id_film = " + id_film + " AND date = '" + date + "' AND heureDebut = '"+heure+"';";
        connect.executeUpdate(requeteSuppr);
    }
    
    //Requete pour obtenir les infos d'une seance a partir de l'id
    public DefaultListModel<String> getSeanceByID(int id_seance) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return connect.requestDemande("SELECT * FROM Seance WHERE id_seance = "+id_seance+";");
    }
    
    //Requete pour obtenir la date et l'heure d'une seance a partir de l'id
    public DefaultListModel<String> getDateHeureByID(int id_film) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return connect.requestDemande("SELECT  date,heureDebut FROM Seance  WHERE ID_Film =" + id_film + " ORDER BY date ASC;");
    }
    
    //Requete pour obtenir l'id d'une seance a partir de la date, l'haure et l'id du film
    public DefaultListModel<String> getIDByDateAndheureAndFilm(String date, String heure, int id_film) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return connect.requestDemande("SELECT id_seance FROM seance WHERE date LIKE '" + date + "' AND heureDebut LIKE '" + heure + "' AND ID_Film = " + id_film + ";");
    }
    
    //Requete pour obtenir la salle et l'heure d'une seance a partir de l'id du billet
    public DefaultListModel<String> getSalleHeureByBillet(String billet) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requete = "SELECT seance.salle, seance.heureDebut FROM seance JOIN billet ON seance.id_seance = billet.id_seance WHERE billet.id_billet = " + billet + ";";
        return connect.requestDemande(requete);
    }
    
    //Requete pour la date, l'heure et le titre du film a partir de la date de la eance
    public DefaultListModel<String> getDateHeureFilmByDate(String date) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requete = "SELECT seance.date, seance.heureDebut, film.titre FROM seance JOIN film ON seance.id_film = film.id_film WHERE seance.date = '"+date+"';";
        return connect.requestDemande(requete);
    }
    
    //Requete pour obtenir la date et l'heure de la seance a partir de l'id du film
    public DefaultListModel<String> getDateHeureFilm() throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requete = "SELECT seance.date, seance.heureDebut, film.titre FROM seance JOIN film ON seance.id_film = film.id_film;";
        return connect.requestDemande(requete);
    }
}
