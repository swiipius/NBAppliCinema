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
    
    public void addSeance(int salle, int film, String date, String heure) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO seance(salle, ID_Film, Date, heureDebut) VALUES(" + salle + "," + film + ",'" + date + "','" + heure + "');";
        connect.executeUpdate(requetAjout);
    }
    
    public void delSeanceByFilmDateHeure(int id_film, String date, String heure) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteSuppr = "DELETE FROM seance WHERE id_film = " + id_film + " AND date = '" + date + "' AND heureDebut = '"+heure+"';";
        connect.executeUpdate(requeteSuppr);
    }
    
    public DefaultListModel<String> getSeanceByID(int id_seance) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return connect.requestDemande("SELECT * FROM Seance WHERE id_seance = "+id_seance+";");
    }
    
    public DefaultListModel<String> getDateHeureByID(int id_film) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return connect.requestDemande("SELECT  date,heureDebut FROM Seance  WHERE ID_Film =" + id_film + " ORDER BY date ASC;");
    }
    
    public DefaultListModel<String> getIDByDateAndheureAndFilm(String date, String heure, int id_film) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return connect.requestDemande("SELECT id_seance FROM seance WHERE date LIKE '" + date + "' AND heureDebut LIKE '" + heure + "' AND ID_Film = " + id_film + ";");
    }
    
    public DefaultListModel<String> getSalleHeureByBillet(String billet) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requete = "SELECT seance.salle, seance.heureDebut FROM seance JOIN billet ON seance.id_seance = billet.id_seance WHERE billet.id_billet = " + billet + ";";
        return connect.requestDemande(requete);
    }
    
    public DefaultListModel<String> getDateHeureFilmByDate(String date) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requete = "SELECT seance.date, seance.heureDebut, film.titre FROM seance JOIN film ON seance.id_film = film.id_film WHERE seance.date = '"+date+"';";
        return connect.requestDemande(requete);
    }
    
    public DefaultListModel<String> getDateHeureFilm() throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requete = "SELECT seance.date, seance.heureDebut, film.titre FROM seance JOIN film ON seance.id_film = film.id_film;";
        return connect.requestDemande(requete);
    }
}
