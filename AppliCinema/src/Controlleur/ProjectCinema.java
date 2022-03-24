/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlleur;

import Modele.*;
import Vue.*;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;
//import Vue.*;
import jdbc2020.*;

/**
 *
 * @author prohd
 */
public class ProjectCinema {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        PageSuppression p = new PageSuppression();
        p.setVisible(true);
    }

}
