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
    String login,nom,prenom;
    String titre,prenomRea,nomRea,genre,synopsis;
    int duree;
    float note;
    String requete;
    public void AjouterFilm() throws SQLException, ClassNotFoundException{//methode pour initialiser un film et l'ajouter vers sa bdd
        Scanner scan= new Scanner(System.in);
        Connexion connect = new Connexion("Cinema", "root", "");//connection a la bdd reussie
        do{
            System.out.println("rentrez le titre du film svp");
            titre= scan.nextLine();
        }while(titre.length()==0);
        do{
            System.out.println("rentrez le nom du realisateur du film svp");
            nomRea= scan.nextLine();
        }while(nomRea.length()==0);
        do{
            System.out.println("rentrez le prenom du realisateur du film svp");
            prenomRea= scan.nextLine();
        }while(prenomRea.length()==0);
        do{
            System.out.println("rentrez le genre du film svp");
            genre= scan.nextLine();
        }while(genre.length()==0);
        do{
            System.out.println("rentrez le synopsis du film svp");
            synopsis= scan.nextLine();
        }while(synopsis.length()==0);
        do{
            System.out.println("rentrez la duree du film svp");
            duree= scan.nextInt();
        }while(duree<0);
        do{
            System.out.println("rentrez la note du film svp");
            note= scan.nextFloat();
        }while((note<0)||(note>5));
        
        requete="INSERT INTO film(Titre,NomRealisateur,PrenomRealisateur,duree,genre,note,synopsis) VALUES('"+titre+"','"+nomRea+"','"+prenomRea+"','"+duree+"','"+genre+"','"+note+"','"+synopsis+"'"+")";
        connect.executeUpdate(requete);
    }
    public void SupprimerFilm(){//methode pour supprimer un film de sa bdd
        
    }
    public void ModifierFilm(){//methode pour modifier les attributs d'un film et envoyer ces changments vers sa bdd
        
    }
    public void AjouterSeance(){//methode pour initialiser une seance et l'ajouter vers sa bdd
        
    }
    public void SupprimerSeance(){//methode pour supprimer une seance de sa bdd
        
    }
    public void ModifierSeance(){//methode pour modifier les attributs d'une seance et envoyer ces changments vers sa bdd
        
    }
}
