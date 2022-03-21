/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc2020;

import java.sql.SQLException;
import java.sql.*;

/**
 *
 * Contrôle l'interrogation de la BDD dans la Fenetre
 *
 * @author segado
 */
public class Controleur {

    /**
     *
     * une methode principal (main) pour lancer l'application
     *
     * @param s
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] s) throws SQLException, ClassNotFoundException {
        // creation de la fenetre
        //Fenetre f = new Fenetre();
        Connexion connect = new Connexion("Cinema", "root", "");//connection a la bdd reussie
        /*String requeteAjout = "INSERT INTO film (Titre,NomRealisateur,PrenomRealisateur,duree,genre,note,synopsis) VALUES ('The King s Man:Premiere Mission','Vaugh',' Matthew','131','espionnage',3.4,'Lorsque les pires tyrans et les plus grands génies criminels de l’Histoire se réunissent pour planifier l’élimination de millions d’innocents, un homme se lance dans une course contre la montre pour contrecarrer leurs plans. ')";
        connect.executeUpdate(requeteAjout);*/
        /*String requeteSupprimer = "DELETE FROM Film WHERE Titre LIKE 'The Batman' ";
        connect.executeUpdate(requeteSupprimer);*/
        String requeteAjout = "INSERT INTO film (Titre,NomRealisateur,PrenomRealisateur,duree,genre,note,synopsis) VALUES ('Test','Test',' test','0','test',3.4,'Lorsque les pires tyrans et les plus grands génies criminels de l’Histoire se réunissent pour planifier l’élimination de millions d’innocents, un homme se lance dans une course contre la montre pour contrecarrer leurs plans. ')";
        connect.executeUpdate(requeteAjout);

        String requete = "SELECT titre FROM film";
        System.out.println(connect.remplirChampsRequete(requete));

    }
}
