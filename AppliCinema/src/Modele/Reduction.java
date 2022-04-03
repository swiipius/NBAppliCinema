/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.*;
/**
 *
 * @author pierr
 */
public class Reduction {
    
    private int id;
    private int pourcentage;
    private String conditionHeure;
    private int id_film;
    
    public Reduction() throws SQLException, ClassNotFoundException{  
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
     * @return the pourcentage
     */
    public int getPourcentage() {
        return pourcentage;
    }

    /**
     * @param pourcentage the pourcentage to set
     */
    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    /**
     * @return the conditionHeure
     */
    public String getConditionHeure() {
        return conditionHeure;
    }

    /**
     * @param conditionHeure the conditionHeure to set
     */
    public void setConditionHeure(String conditionHeure) {
        this.conditionHeure = conditionHeure;
    }

    /**
     * @return the id_film
     */
    public int getId_film() {
        return id_film;
    }

    /**
     * @param id_film the id_film to set
     */
    public void setId_film(int id_film) {
        this.id_film = id_film;
    }
    
    //on affiche les informations de la réduction
    @Override
    public String toString(){
        return "Pourcentage : "+pourcentage+"\nCondition Heure : "+conditionHeure+"\nID_Film : "+id_film;
    }
}
