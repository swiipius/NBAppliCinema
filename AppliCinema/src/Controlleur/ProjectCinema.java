/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;
import Modele.*;
import java.sql.SQLException;
//import Vue.*;
import jdbc2020.*;

/**
 *
 * @author prohd
 */
public class ProjectCinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Employe Pierre = new Employe();
        Pierre.AjouterFilm();
    }
    
}
