/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author pierr
 */
public class Film {
    private int id;
    private String Titre;
    private String NomRealisateur;
    private String PrenomRealisateur;
    private int duree;
    private String genre;
    private float note;
    private String synopsis;
    private String Affiche;
    private int nombreVues;
    
    public Film(){
    }
    
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    
    public String getTitre(){
        return Titre;
    }
    
    public void setTitre(){
        this.Titre = Titre;
    }
    
    public String getNomRealisateur(){
        return NomRealisateur;
    }
    
    public void setNomRealisateur(){
        this.NomRealisateur = NomRealisateur;
    }
    
    public String getPrenomRealisateur(){
        return PrenomRealisateur;
    }
    
    public void setPrenomRealisateur(){
        this.PrenomRealisateur = PrenomRealisateur;
    }
    
    public int getDuree(){
        return duree;
    }
    
    public void setDuree(){
        this.duree = duree;
    }
    
    public float getNote(){
        return note;
    }
    public void setNote(){
        this.note = note;
    }
    
    public String getSynopsis(){
        return synopsis;
    }
    public void setSynopis(){
        this.synopsis = synopsis;
    }
    
    public String getGenre(){
        return genre;
    }
    public void setGenre(){
        this.genre = genre;
    }
    
    public String getAffiche(){
        return Affiche;
    }
    
    public void setAffiche(){
        this.Affiche = Affiche;
    }
    
    public int getnombreVues(){
        return nombreVues;
    }
    
    public void setNombreVues(){
        this.nombreVues = nombreVues;
    }
    
    /**
     * 
     * @return les infromations du film
     */
    @Override
    public String toString(){
        return "Film : "+ Titre + ", "+ NomRealisateur + " " + PrenomRealisateur + "\nDuree : " + duree + "\nNote : "+note+"\nSynopsis : "+synopsis+ "\nGenre : "+genre+"\nAffiche : "+Affiche+"\nNombre de vues : "+nombreVues;
    }
}
