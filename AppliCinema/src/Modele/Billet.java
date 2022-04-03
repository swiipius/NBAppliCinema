/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author prohd
 */
public class Billet {
    private int id;
    private float facture;
    private int id_client;
    private int id_film;
    private int id_seance;
    private String TypePlace;
    
    public Billet(){
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
     * @return the facture
     */
    public float getFacture() {
        return facture;
    }

    /**
     * @param facture the facture to set
     */
    public void setFacture(float facture) {
        this.facture = facture;
    }

    /**
     * @return the id_client
     */
    public int getId_client() {
        return id_client;
    }

    /**
     * @param id_client the id_client to set
     */
    public void setId_client(int id_client) {
        this.id_client = id_client;
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

    /**
     * @return the id_seance
     */
    public int getId_seance() {
        return id_seance;
    }

    /**
     * @param id_seance the id_seance to set
     */
    public void setId_seance(int id_seance) {
        this.id_seance = id_seance;
    }

    /**
     * @return the TypePlace
     */
    public String getTypePlace() {
        return TypePlace;
    }

    /**
     * @param TypePlace the TypePlace to set
     */
    public void setTypePlace(String TypePlace) {
        this.TypePlace = TypePlace;
    }
    
    //on affiche les informations du billet
    @Override
    public String toString(){
        return "Prix : "+facture+"\nID_Client : "+id_client+"\nID_Film : "+id_film+"\nID_Seance : "+id_seance+"\nType de place : "+TypePlace;
    }
}
