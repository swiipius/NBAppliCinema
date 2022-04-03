/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;
import java.sql.SQLException;
import jdbc2020.Connexion;
import java.util.*;


/**
 *
 * @author prohd
 */
public class Employe {
    private int id;
    private String nomEmploye;
    private String Prenom;
    private String loginEmploye;
    
    public Employe(){
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nomEmploye
     */
    public String getNomEmploye() {
        return nomEmploye;
    }

    /**
     * @param nomEmploye the nomEmploye to set
     */
    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    /**
     * @return the Prenom
     */
    public String getPrenom() {
        return Prenom;
    }

    /**
     * @param Prenom the Prenom to set
     */
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    /**
     * @return the loginEmploye
     */
    public String getLoginEmploye() {
        return loginEmploye;
    }

    /**
     * @param loginEmploye the loginEmploye to set
     */
    public void setLoginEmploye(String loginEmploye) {
        this.loginEmploye = loginEmploye;
    }
    
    /**
     * 
     * @return les informations de l'employé
     */
    @Override
    public String toString(){
        return "Nom : "+nomEmploye+"\nPrenom : "+Prenom+"\nLogin Employe : "+loginEmploye;
    }
}
