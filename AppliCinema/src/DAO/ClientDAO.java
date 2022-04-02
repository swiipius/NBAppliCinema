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
    
    public void addClient(Client client) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO film(Nom, Prenom, Age, email, loginClient) VALUES('" + client.getNom() + "','" + client.getPrenom() + "'," + client.getAge() + ",'" + client.getEmail() + "','" + client.getLoginClient() + "')";
        connect.executeUpdate(requetAjout);
    }
    
    public String getNbClientByEmail(String email) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requeteDemande = "SELECT COUNT(*) FROM client WHERE email LIKE '" + email + "'";
        return (String)connect.requestDemande(requeteDemande).get(0);
    }
}
