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
    
    private String nomBDD;
    private String username;
    private String password;
    
    public EmployeDAO(String nomBDD, String username, String password){
        this.nomBDD = nomBDD;
        this.username = username;
        this.password = password;
    }
    
    public void addFilm(Employe employe) throws SQLException, ClassNotFoundException{
        Connexion connect = new Connexion(nomBDD, username, password);
        String requetAjout = "INSERT INTO film(NomEmplye, Prenom, loginEmploye) VALUES('" + employe.getNomEmploye() + "','" + employe.getPrenom() + "','" + employe.getLoginEmploye()  + "')";
        connect.executeUpdate(requetAjout);
    }
}
