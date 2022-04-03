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
    
    private String nomBDD;
    private String username;
    private String password;
    
    public ClientDAO(String nomBDD, String username, String password){
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
    public void addClient(String nom, String prenom, String age, String email, String loginClient) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO film(Nom, Prenom, Age, email, loginClient) VALUES('" + nom + "','" + prenom + "'," + age + ",'" + email + "','" + loginClient + "')";
        connect.executeUpdate(requetAjout);
    }
    
    public String getNbClientByEmail(String email) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT COUNT(*) FROM client WHERE email LIKE '" + email + "'";
        return (String)connect.requestDemande(requeteDemande).get(0);
    }
    
    public String getIDByMail(String mail) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return (String)connect.requestDemande("SELECT id_client FROM client WHERE email = '"+mail+"'").get(0);
    }
    
    public String getLoginByEmail(String mail) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return (String)connect.requestDemande("SELECT loginClient FROM client WHERE email = '"+mail+"'").get(0);
    }
}

