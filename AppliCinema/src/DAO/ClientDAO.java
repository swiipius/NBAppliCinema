/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.Client;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import jdbc2020.Connexion;

/**
 *
 * @author pierr
 */
public class ClientDAO {
   
    //Elements de connexion a la bdd
    private String nomBDD;
    private String username;
    private String password;
    
    public ClientDAO(String nomBDD, String username, String password){
        //Recuperation des elements de connexion a la bdd
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
    //Requete pour ajouter un client
    public void addClient(String nom, String prenom, String age, String email, String loginClient) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO film(Nom, Prenom, Age, email, loginClient) VALUES('" + nom + "','" + prenom + "'," + age + ",'" + email + "','" + loginClient + "')";
        connect.executeUpdate(requetAjout);
    }
    
    //Requete pour obtenir le nombre de client grace a un email
    public String getNbClientByEmail(String email) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT COUNT(*) FROM client WHERE email LIKE '" + email + "'";
        return (String)connect.requestDemande(requeteDemande).get(0);
    }
    
    //Requete pour obtenir l'id d'un client grace au mail
    public String getIDByMail(String mail) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return (String)connect.requestDemande("SELECT id_client FROM client WHERE email = '"+mail+"'").get(0);
    }
    
    //Requete pour obtenir le mdp du client grace au mail
    public String getLoginByEmail(String mail) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return (String)connect.requestDemande("SELECT loginClient FROM client WHERE email = '"+mail+"'").get(0);
    }
}

