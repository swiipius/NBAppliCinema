/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modele.Employe;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import jdbc2020.Connexion;
/**
 *
 * @author pierr
 */
public class EmployeDAO {
  
    //Elements de connexion a la bdd
    private String nomBDD;
    private String username;
    private String password;
    
    public EmployeDAO(String nomBDD, String username, String password){
        //Recuperation des elements de connexion a la bdd
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
     //Requete pour ajouter un employe
    public void addFilm(Employe employe) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO film(NomEmplye, Prenom, loginEmploye) VALUES('" + employe.getNomEmploye() + "','" + employe.getPrenom() + "','" + employe.getLoginEmploye()  + "')";
        connect.executeUpdate(requetAjout);
    }
    
     //Requete pour obtenir le login de l'employe a partir de son nom
    public String getLoginByNom(String nom) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        return (String)connect.requestDemande("SELECT loginEmploye FROM employe WHERE NomEmploye LIKE '"+nom+"'").get(0);
    }
}
