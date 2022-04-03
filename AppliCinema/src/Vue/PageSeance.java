/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.sql.SQLException;
import javax.swing.*;
import jdbc2020.Connexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAO.SeanceDAO;

/**
 *
 * @author user
 */
public class PageSeance extends javax.swing.JFrame {

    //Initialisation pour la connection a la bdd
    private SeanceDAO seance;
    
    //Variables recuperees a partir des arguments
    public int numFilm, numClient;
    public boolean ConnexionValid;
    
    //Variable interne au programme
    public boolean choixOk = false;
    private String requeteSeance;
    DefaultListModel<String> ListModelID = new DefaultListModel<>();
    DefaultListModel<String> ListModelSeance = new DefaultListModel<>();
    DefaultListModel<String> ListModelSeanceConcat = new DefaultListModel<>();
    
    //Variables renvoyees a d'autre classe
    public int numSeance;

    /**
     * Creates new form PageSeance
     *
     * @param ID_Film
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public PageSeance(int ID_Film, int ID_Client, boolean ConnexionValid) throws SQLException, ClassNotFoundException {
        initComponents();
        
        //Recuperation des elements recus en arguments
        numFilm = ID_Film;
        this.ConnexionValid = ConnexionValid;
        numClient = ID_Client;        
        
        //Instanciation de l'objet permettant la co a la bdd et obtention des seances
        seance = new SeanceDAO("cinema", "root", "");
        ListModelSeance = seance.getDateHeureByID(ID_Film);
        //Mise en forme de la liste des seances
        for (int i = 0; i < ListModelSeance.size(); i += 2) {
            ListModelSeanceConcat.add(i / 2, ListModelSeance.get(i) + ", " + ListModelSeance.get(i + 1));

        }
        listSeance.setModel(ListModelSeanceConcat);

        //Initailisation bouton de reservation a false car rien n'a pu etre selectionne
        btnResa.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRecherche = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSeance = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JFormattedTextField();
        Instruction = new javax.swing.JLabel();
        btnResa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(168, 26, 3));

        btnRecherche.setForeground(new java.awt.Color(168, 26, 3));
        btnRecherche.setText("Recherche");
        btnRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercheActionPerformed(evt);
            }
        });

        listSeance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSeanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listSeance);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText(" Seances");

        try {
            date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Instruction.setText("Liste des seances a venir pour votre film:");

        btnResa.setForeground(new java.awt.Color(168, 26, 3));
        btnResa.setText("Reserver");
        btnResa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResaActionPerformed(evt);
            }
        });

        btnReset.setForeground(new java.awt.Color(168, 26, 3));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(Instruction)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                        .addComponent(btnResa)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnReset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addComponent(btnRecherche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnResa))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * //Filtrage des seances par rapport a la date
     * @param evt 
     */
    private void btnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercheActionPerformed
        //Recuperation des donnees dans la bdd a partir de la recherche
        try {
            ListModelSeanceConcat = seance.getDateHeureFilmByIDAnddate(numFilm, date.getText());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageSeance.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Mise en forme de la liste des seances
        for (int i = 0; i < ListModelSeance.size(); i += 2) {
            ListModelSeanceConcat.add(i / 2, ListModelSeance.get(i) + ", " + ListModelSeance.get(i + 1));

        }
        listSeance.setModel(ListModelSeanceConcat);

    }//GEN-LAST:event_btnRechercheActionPerformed
    
    /**
    *  //Valisation du choix de la seance
    * @param evt 
    */
    private void btnResaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResaActionPerformed
        //Recuperation dans la bdd de l'id de la seance a partir de la date, l'heure et l'id du film
        try {
            ListModelID = seance.getIDByDateAndheureAndFilm(getDate(listSeance.getSelectedValue()), getHour(listSeance.getSelectedValue()), numFilm);
            numSeance = Integer.parseInt(ListModelID.get(0));
            
            //Instanciation de la page de selection des prix
            PageSelecPrix pr = new PageSelecPrix(ConnexionValid, numFilm, numClient, numSeance);
            pr.setVisible(true);
            
            //Fermuture de cette fenetre
            this.dispose();
            
            //Passage du boolean a true pour dire que le client a valider son choix
            choixOk = true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageSeance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnResaActionPerformed

    /**
     * //Le bouton de reservation est rendu cliquable si un choix a ete fait
     * @param evt 
     */
    private void listSeanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSeanceMouseClicked
        if (listSeance.getSelectedIndex() > -1) {
            btnResa.setEnabled(true);
        }
    }//GEN-LAST:event_listSeanceMouseClicked

    /**
     * //Action lors de la fermeture de la fenetre
     * @param evt 
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //Si le choix n'a pas ete fait retour a la page d'accueil
        if (!choixOk) {
            try {
                PageAccueil pa = new PageAccueil(ConnexionValid, false);
                pa.setVisible(true);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PageSeance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowClosed

    /**
     * //Retour a une liste contenant toutes les seances (elle n'est plus filtree)
     * @param evt 
     */
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //Recherche dans la bdd de toutes les seances
        try {
            ListModelSeance = seance.getDateHeureByID(numFilm);
        } catch (SQLException ex) {
            Logger.getLogger(PageSeance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PageSeance.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Mise en forme de la liste des seances
        for (int i = 0; i < ListModelSeance.size(); i += 2) {
            ListModelSeanceConcat.add(i / 2, ListModelSeance.get(i) + ", " + ListModelSeance.get(i + 1));

        }
        listSeance.setModel(ListModelSeanceConcat);
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * //Obtention de la date a partir d'une string conteant la date et l'heure
     * @param DateAndHour
     * @return 
     */
    public String getDate(String DateAndHour) {
        String strDate = "";
        for (int i = 10; i < 20; i++) {
            //Recuperation des char dans la string correspondant a la date
            strDate += DateAndHour.charAt(i);
        }
        return strDate;
    }

    /**
     * //Obtention de l'heure a partir d'une string conteant la date et l'heure
     * @param DateAndHour
     * @return 
     */
    public String getHour(String DateAndHour) {
        String strHour = "";
        for (int i = 0; i < 8; i++) {
            //Recuperation des char dans la string correspondant a l'heure
            strHour += DateAndHour.charAt(i);
        }
        return strHour;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Instruction;
    private javax.swing.JButton btnRecherche;
    private javax.swing.JButton btnResa;
    private javax.swing.JButton btnReset;
    private javax.swing.JFormattedTextField date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listSeance;
    // End of variables declaration//GEN-END:variables
}
