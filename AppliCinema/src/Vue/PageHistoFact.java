/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc2020.*;
import DAO.*;

/**
 *
 * @author pierr
 */
public class PageHistoFact extends javax.swing.JFrame {

    private BilletDAO billet;
    private SeanceDAO seance;
    private String requeteSuppr, requeteInfo, NomClient, Date, Titre, Prix, selectTitre, TypePlace, requeteID;
    public boolean connexionValid;
    public int client;
    public int nbBillet;

    DefaultListModel<String> listModelTitre = new DefaultListModel<>();
    DefaultListModel<String> listModelInfo = new DefaultListModel<>();
    DefaultListModel<String> listModelTitreInfo = new DefaultListModel<>();
    DefaultListModel<String> listModelID = new DefaultListModel<>();
    DefaultListModel<String> listModelInfoManquante = new DefaultListModel<>();
    
    public PageHistoFact(boolean connexionValid, int client) throws SQLException, ClassNotFoundException {
        super("Liste des achats");
        this.client = client;
        this.connexionValid = connexionValid;
        initComponents();
        
        listModelTitre = billet.getIDTitreDateFactureTypeplaceByIDClient(Integer.toString(client));
        for (int i = 0; i < listModelTitre.size(); i += 5) {
            listModelTitreInfo.add(i / 5, listModelTitre.get(i) + ", " + listModelTitre.get(i + 3) + ", " + listModelTitre.get(i + 2) + ", " + listModelTitre.get(i + 1));

        }
        //nbBillet = listModelTitre.size();
        listHistorique.setModel(listModelTitreInfo);
        btnImpr.setEnabled(false);
        Dereserver.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInfoCpt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listHistorique = new javax.swing.JList<>();
        PanelInfoFilm = new javax.swing.JPanel();
        Dereserver = new javax.swing.JButton();
        btnImpr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Historique des factures");

        listHistorique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listHistoriqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listHistorique);

        javax.swing.GroupLayout PanelInfoFilmLayout = new javax.swing.GroupLayout(PanelInfoFilm);
        PanelInfoFilm.setLayout(PanelInfoFilmLayout);
        PanelInfoFilmLayout.setHorizontalGroup(
            PanelInfoFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        PanelInfoFilmLayout.setVerticalGroup(
            PanelInfoFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Dereserver.setText("Déreserver la séance ");
        Dereserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DereserverActionPerformed(evt);
            }
        });

        btnImpr.setText("Imprimer le billet");
        btnImpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelInfoCptLayout = new javax.swing.GroupLayout(PanelInfoCpt);
        PanelInfoCpt.setLayout(PanelInfoCptLayout);
        PanelInfoCptLayout.setHorizontalGroup(
            PanelInfoCptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoCptLayout.createSequentialGroup()
                .addGroup(PanelInfoCptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInfoCptLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1)
                        .addGap(0, 229, Short.MAX_VALUE))
                    .addGroup(PanelInfoCptLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(PanelInfoCptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelInfoCptLayout.createSequentialGroup()
                                .addComponent(btnImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dereserver)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelInfoFilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelInfoCptLayout.setVerticalGroup(
            PanelInfoCptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoCptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelInfoCptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelInfoFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelInfoCptLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelInfoCptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dereserver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImpr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInfoCpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInfoCpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listHistoriqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listHistoriqueMouseClicked
        if (listHistorique.getSelectedIndex() > -1) {   
            btnImpr.setEnabled(true);
            Dereserver.setEnabled(true);
        }
    }//GEN-LAST:event_listHistoriqueMouseClicked

    private void DereserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DereserverActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Etes vous sur de ne pas venir a cette séance ?", "Annulation", JOptionPane.YES_NO_OPTION);
        int index =  listHistorique.getSelectedIndex();
        
        if (result == JOptionPane.YES_OPTION) {
            try {
                billet.delBilletByID(listModelTitre.get(5*index+4));
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PageHistoFact.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Séance annulée");
        } else {
            try {
                PageHistoFact phf = new PageHistoFact(connexionValid, client);
                phf.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(PageHistoFact.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PageHistoFact.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DereserverActionPerformed

    private void btnImprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprActionPerformed
        //Demande du nom inscrit sur le billet
        String Nom = JOptionPane.showInputDialog(null, "Veuillez entrer le nom de la personne à qui appartient ce billet");
        
        //Recuperation des infos du billet
        int index = listHistorique.getSelectedIndex();
        String sPrix, sFilm, sDate, sHeure, sSalle, sTypePlace;
        sFilm = listModelTitre.get(index*5);
        sPrix = listModelTitre.get(index*5 + 2);
        sDate = listModelTitre.get(index*5 + 1);
        sTypePlace = listModelTitre.get(index*5 + 3);
        try {
            listModelInfoManquante = seance.getSalleHeureByBillet(listModelTitre.get(5*index+4));
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageHistoFact.class.getName()).log(Level.SEVERE, null, ex);
        }
        sHeure = listModelInfoManquante.get(0);
        sSalle = listModelInfoManquante.get(1);       
        //System.out.println(sFilm + ", " + sPrix + ", "+ sDate+ ", " + sTypePlace+ ", " + sHeure+ ", " + sSalle);
        String billet = "Résumé Achat :\nPlace " + sTypePlace + ", " + sPrix + "€\nFilm : " + sFilm + "\nSeance du " + sDate + " a " + sHeure + " en salle " + sSalle;
        
        //Enregistrement du billet
        File fBillet = new File("C:\\Users\\pierr\\Documents\\Billet_"+ Nom +".txt");

                            if (!fBillet.exists()) {
                                try {
                                    fBillet.createNewFile();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }

                            try (PrintWriter print = new PrintWriter(new FileOutputStream(fBillet))) {
                                print.print(billet);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(PagePayement.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            JOptionPane.showMessageDialog(null, "Votre billet a été imprimé");
        
    }//GEN-LAST:event_btnImprActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dereserver;
    private javax.swing.JPanel PanelInfoCpt;
    private javax.swing.JPanel PanelInfoFilm;
    private javax.swing.JButton btnImpr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listHistorique;
    // End of variables declaration//GEN-END:variables
}
