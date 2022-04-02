/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;
import DAO.FilmDAO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.*;
import jdbc2020.*;

/**
 *
 * @author user
 */
public class GestiondeSeance extends javax.swing.JFrame {
    public Connexion connection;
    private String maRequete;
    private int count = 0;
    private FilmDAO film;
    public int nbSalle = 10;
    
    DefaultListModel<String> listModelTitre = new DefaultListModel<>();
    DefaultListModel<String> listModel1 = new DefaultListModel<>();
    /**
     * Creates new form GestiondeSeance
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public GestiondeSeance() throws SQLException, ClassNotFoundException {
        super("Gestion des seances");
        initComponents();
        
        connection = new Connexion("Cinema", "root", "");
        maRequete = "SELECT date FROM seance";
        listModel1 = connection.requestDemande(maRequete);
        
        //Creation de la combo box des films
        film = new FilmDAO("cinema", "root", "");
        listModelTitre = film.getFilmTitre();
        for (int i = 0; i < listModelTitre.size(); i++) {
            NomFilm.addItem(listModelTitre.get(i));
        }
        
        //Creation de la combo box des films
        for(int i = 1; i<nbSalle+1; i++){
            SalleProjection.addItem(Integer.toString(i));
        }
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
        BtnRecherche = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnAjouter = new javax.swing.JButton();
        BtnSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeSeance = new javax.swing.JList<>();
        HeureDebut = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        NomFilm = new javax.swing.JComboBox<>();
        SalleProjection = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        DateSeance = new javax.swing.JFormattedTextField();
        RechercheSeance = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        BtnRecherche.setText("Recherche");
        BtnRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRechercheActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRecherche);
        BtnRecherche.setBounds(740, 60, 100, 40);

        BtnReset.setText("Reset");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(BtnReset);
        BtnReset.setBounds(850, 60, 70, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Gestion des Seances");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(98, 30, 178, 41);

        BtnAjouter.setText("AJOUTER");
        BtnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAjouterActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAjouter);
        BtnAjouter.setBounds(70, 340, 132, 50);

        BtnSupprimer.setText("SUPPRIMER");
        BtnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSupprimerActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSupprimer);
        BtnSupprimer.setBounds(240, 340, 137, 50);

        jScrollPane1.setViewportView(ListeSeance);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(450, 120, 470, 300);

        try {
            HeureDebut.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(HeureDebut);
        HeureDebut.setBounds(48, 252, 132, 40);

        jLabel2.setText("Heure de la séance : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(48, 231, 103, 15);

        jPanel1.add(NomFilm);
        NomFilm.setBounds(206, 158, 226, 40);

        jPanel1.add(SalleProjection);
        SalleProjection.setBounds(210, 250, 220, 40);

        jLabel3.setText("Date de la séance :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 140, 100, 15);

        try {
            DateSeance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(DateSeance);
        DateSeance.setBounds(50, 160, 130, 40);

        try {
            RechercheSeance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(RechercheSeance);
        RechercheSeance.setBounds(450, 60, 280, 40);

        jLabel4.setText("Recherche selon la date :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 40, 150, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSupprimerActionPerformed
        // TODO add your handling code here:
        String Selecteddate = (String) ListeSeance.getSelectedValue();//Capture de l'element selectionne
        int index = ListeSeance.getSelectedIndex();
        //Creer et execute la requete sql pour obtenir les 
        String requeteInfo = "SELECT heureDebut,salle FROM seance WHERE date LIKE '" + Selecteddate + "'";
        DefaultListModel<String> eltRech = new DefaultListModel<>();
        try {
            eltRech = connection.requestDemande(requeteInfo);
        } catch (SQLException ex) {
            Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
        }

        String textAffich = "Voulez vous supprimer cette seance ?\n" + Selecteddate + "\n" + eltRech.get(1) + ", " + eltRech.get(0);
        int result = JOptionPane.showConfirmDialog(null, textAffich, "Suppression", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            listModel1.removeElementAt(index);
            String requeteSuppr = "DELETE FROM seance WHERE date LIKE '" + Selecteddate + "' AND heureDebut LIKE '" + eltRech.get(1) + "'";
            try {
                connection.executeUpdate(requeteSuppr);
            } catch (SQLException ex) {
                Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "seance Supprime");
        } else {

        }                   
    }//GEN-LAST:event_BtnSupprimerActionPerformed

    private void BtnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAjouterActionPerformed
        if((DateSeance.getText().equals("    -  -  "))||(NomFilm.getSelectedItem()==null)||(HeureDebut.getText().equals("  :  :  "))||(SalleProjection.getSelectedItem()==null)){
            JOptionPane.showMessageDialog(null, "Veuillez completer tout les champs");
        }else{
            String maRequete = "INSERT INTO seance(Heure de Debut,Nom du Film,Salle de Projection,Date de la seance,Affiche) VALUES('" + HeureDebut.getText() + "','" + NomFilm.getSelectedItem() + "','" + SalleProjection.getSelectedItem() + "','" + DateSeance.getText()+ "'" ;
            try {
                connection.executeUpdate(maRequete);
            } catch (SQLException ex) {
                Logger.getLogger(GestiondeSeance.class.getName()).log(Level.SEVERE, null, ex);
            }
            listModel1.addElement(DateSeance.getText());
            JOptionPane.showMessageDialog(null, "La seance a ete ajoute");
        }
    }//GEN-LAST:event_BtnAjouterActionPerformed

    private void BtnRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRechercheActionPerformed
        ListeSeance.setModel(listModel1);
        if ((RechercheSeance.getText().equals("")) || (DateSeance.getText().equals("Recherche de la seance"))) {
            JOptionPane.showMessageDialog(null, "Veuillez rentrer une date à chercher");
        } else {
            String MaRequete = "SELECT date FROM seance WHERE date = '" + RechercheSeance.getText() + "'";
            try {
                listModel1 = connection.requestDemande(maRequete);
            } catch (SQLException ex) {
                Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
            }
            ListeSeance.setModel(listModel1);
            //RechercheSeance.setText("Recherche de la seance ");
        }
    }//GEN-LAST:event_BtnRechercheActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:
        String Marequete = "SELECT date FROM seance";
        try {
            listModel1 = connection.requestDemande(Marequete);
        } catch (SQLException ex) {
            Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
        }
        ListeSeance.setModel(listModel1);
        
    }//GEN-LAST:event_BtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(GestiondeSeance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestiondeSeance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestiondeSeance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestiondeSeance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestiondeSeance().setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(GestiondeSeance.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAjouter;
    private javax.swing.JButton BtnRecherche;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnSupprimer;
    private javax.swing.JFormattedTextField DateSeance;
    private javax.swing.JFormattedTextField HeureDebut;
    private javax.swing.JList<String> ListeSeance;
    private javax.swing.JComboBox<String> NomFilm;
    private javax.swing.JFormattedTextField RechercheSeance;
    private javax.swing.JComboBox<String> SalleProjection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
