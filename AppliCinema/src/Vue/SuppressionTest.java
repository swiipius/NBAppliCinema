/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc2020.*;

/**
 *
 * @author pierr
 * 
 * code issu de https://www.youtube.com/watch?v=MLZOO0bq6M4
 */
public class SuppressionTest extends javax.swing.JFrame {

    public Connexion connect;
    private String requete;

    DefaultListModel<String> listModel = new DefaultListModel<>();

    public SuppressionTest() throws SQLException, ClassNotFoundException {
        initComponents();

        BtnDel.setEnabled(false);
        //BtnAdd.setEnabled(true);

        //Connection a la bdd
        connect = new Connexion("Cinema", "root", "");
        requete = "SELECT titre FROM film";
        listModel = connect.requestDemande(requete);
        listTitreFilm.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTitreFilm = new javax.swing.JList<>();
        BtnDel = new javax.swing.JButton();
        pAdd = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Suppression Film");
        setResizable(false);

        listTitreFilm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTitreFilmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listTitreFilm);

        BtnDel.setText("SUPPRIMER");
        BtnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pListLayout = new javax.swing.GroupLayout(pList);
        pList.setLayout(pListLayout);
        pListLayout.setHorizontalGroup(
            pListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1822, Short.MAX_VALUE)
            .addGroup(pListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pListLayout.createSequentialGroup()
                    .addGap(457, 457, 457)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(458, Short.MAX_VALUE)))
            .addGroup(pListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pListLayout.createSequentialGroup()
                    .addGap(807, 807, 807)
                    .addComponent(BtnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(808, Short.MAX_VALUE)))
        );
        pListLayout.setVerticalGroup(
            pListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
            .addGroup(pListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pListLayout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(99, Short.MAX_VALUE)))
            .addGroup(pListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pListLayout.createSequentialGroup()
                    .addGap(281, 281, 281)
                    .addComponent(BtnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pAddLayout = new javax.swing.GroupLayout(pAdd);
        pAdd.setLayout(pAddLayout);
        pAddLayout.setHorizontalGroup(
            pAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1153, Short.MAX_VALUE)
        );
        pAddLayout.setVerticalGroup(
            pAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(pList, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(346, 346, 346)
                    .addComponent(pAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(347, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(pAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2502, 2502, 2502)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(878, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelActionPerformed
        String SelectedTitle = (String) listTitreFilm.getSelectedValue();//Capture de l'element selectionne
        int index = listTitreFilm.getSelectedIndex();
        //Creer et execute la requete sql pour obtenir les 
        String requeteInfo = "SELECT NomRealisateur, PrenomRealisateur FROM film WHERE titre LIKE '" + SelectedTitle + "'";
        DefaultListModel<String> eltRech = new DefaultListModel<>();
        try {
            eltRech = connect.requestDemande(requeteInfo);
        } catch (SQLException ex) {
            Logger.getLogger(SuppressionTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        String textAffich = "Voulez vous supprimer ce film ?\n" + SelectedTitle + "\n" + eltRech.get(1) + ", " + eltRech.get(0);
        int result = JOptionPane.showConfirmDialog(null, textAffich, "Suppression", JOptionPane.YES_NO_OPTION);
        
        if(result == JOptionPane.YES_OPTION){
            listModel.removeElementAt(index);
            String requeteSuppr = "DELETE FROM Film WHERE Titre LIKE '" + SelectedTitle + "' AND Nomrealisateur LIKE '" + eltRech.get(1) + "'";
            try {
                connect.executeUpdate(requeteSuppr);
            } catch (SQLException ex) {
                Logger.getLogger(SuppressionTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Film Supprime");
        }
        else{
            
        }
    }//GEN-LAST:event_BtnDelActionPerformed

    private void listTitreFilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTitreFilmMouseClicked
        if (listTitreFilm.getSelectedIndex() > -1) {
            BtnDel.setEnabled(true);
            //BtnAdd.setEnabled(false);
        }
    }//GEN-LAST:event_listTitreFilmMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuppressionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuppressionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuppressionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuppressionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SuppressionTest().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SuppressionTest.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SuppressionTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listTitreFilm;
    private javax.swing.JPanel pAdd;
    private javax.swing.JPanel pList;
    // End of variables declaration//GEN-END:variables
}
