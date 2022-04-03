/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import javax.swing.DefaultListModel;
import jdbc2020.Connexion;

/**
 *
 * @author pierr
 */
public class BilletDAO {
  
    //Elements de connexion a la bdd
    private String nomBDD;
    private String username;
    private String password;
    
    public BilletDAO(String nomBDD, String username, String password){
        //Recuperation des elements de connexion a la bdd
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
     /**
      * Requete pour ajouter un billet
      * @param facture
      * @param id_client
      * @param id_seance
      * @param id_film
      * @param TypePlace
      * @throws SQLException
      * @throws ClassNotFoundException 
      */
    public void addBillet(int facture, int id_client, int id_seance, int id_film, String TypePlace) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO billet(facture,id_client,id_film,id_seance,TypePlace) VALUES(" + facture + "," + id_client + "," + id_film + "," + id_seance + ",'" + TypePlace + "')";
        connect.executeUpdate(requetAjout);
    }
    
     /**
      * Requete pour supprimer un billet
      * @param id
      * @throws SQLException
      * @throws ClassNotFoundException 
      */
    public void delBilletByID(String id) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        connect.executeUpdate("DELETE FROM billet WHERE id_billet = " + id + ";");
    }
    
     /**
      * Requete pour obtenir l'id du billet, le titre du film, la date de la seance, le prix, le type de place a partir de l'id du client
      * @param id
      * @return
      * @throws SQLException
      * @throws ClassNotFoundException 
      */
    public DefaultListModel<String> getIDTitreDateFactureTypeplaceByIDClient(String id) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requete = "SELECT billet.id_billet, film.Titre, seance.Date, billet.facture, billet.TypePlace FROM billet JOIN film ON billet.id_film=film.id_film JOIN seance ON billet.id_Seance=seance.ID_Seance JOIN client ON billet.ID_client=client.ID_client WHERE client.id_client = " + id;
        return connect.requestDemande(requete);
    }
}
