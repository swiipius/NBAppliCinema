/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc2020.*;
import java.util.regex.*;
import java.util.*;
import DAO.*;

/**
 *
 * @author prohd
 */
public class PageInscription extends javax.swing.JFrame {

    private ClientDAO client;
    private String requete;
    boolean inscriptionOK;
    private int countAge = 0;

    private String testPresence;

    public PageInscription() throws SQLException, ClassNotFoundException {
        super("Page d'Inscription");
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        PrenomClient = new javax.swing.JTextField();
        NomClient = new javax.swing.JTextField();
        EmailClient = new javax.swing.JTextField();
        AgeClient = new javax.swing.JFormattedTextField();
        LoginClient = new javax.swing.JTextField();
        BoutonInscription = new javax.swing.JButton();
        btnCo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(750, 300, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(168, 26, 3));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Formulaire d'inscription Client:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(35, 25, 369, 39);

        PrenomClient.setText("Prenom");
        PrenomClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrenomClientMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrenomClientMouseExited(evt);
            }
        });
        jPanel1.add(PrenomClient);
        PrenomClient.setBounds(218, 82, 200, 45);

        NomClient.setText("Nom");
        NomClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomClientMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NomClientMouseExited(evt);
            }
        });
        jPanel1.add(NomClient);
        NomClient.setBounds(12, 82, 200, 45);

        EmailClient.setText("Email");
        EmailClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailClientMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmailClientMouseExited(evt);
            }
        });
        jPanel1.add(EmailClient);
        EmailClient.setBounds(12, 133, 406, 45);

        AgeClient.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));
        AgeClient.setText("Age");
        AgeClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgeClientMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgeClientMouseExited(evt);
            }
        });
        jPanel1.add(AgeClient);
        AgeClient.setBounds(20, 190, 50, 40);

        LoginClient.setText("Mot de passe");
        LoginClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginClientMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginClientMouseExited(evt);
            }
        });
        LoginClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginClientActionPerformed(evt);
            }
        });
        jPanel1.add(LoginClient);
        LoginClient.setBounds(80, 190, 338, 45);

        BoutonInscription.setText("Inscription");
        BoutonInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonInscriptionActionPerformed(evt);
            }
        });
        jPanel1.add(BoutonInscription);
        BoutonInscription.setBounds(151, 396, 143, 58);

        btnCo.setText("Connexion");
        btnCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCo);
        btnCo.setBounds(151, 459, 143, 58);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginClientActionPerformed

    private void NomClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomClientMouseClicked
        //si on clique sur le champ des noms, il se vide
        NomClient.setText(null);
    }//GEN-LAST:event_NomClientMouseClicked

    private void PrenomClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenomClientMouseClicked
        //si on clique sur le champ des prenoms, il se vide
        PrenomClient.setText(null);
    }//GEN-LAST:event_PrenomClientMouseClicked

    private void EmailClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailClientMouseClicked
        //si on clique sur le champ des email et qu'il est a sa valeur de base, il se vide
        if (EmailClient.getText().equals("Email")) {
            EmailClient.setText(null);
        }
    }//GEN-LAST:event_EmailClientMouseClicked

    private void LoginClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginClientMouseClicked
        //si on clique le champ des mdp et qu'il est a sa valeur de base, il se vide
        if (LoginClient.getText().equals("Mot de passe")) {
            LoginClient.setText(null);
        }
    }//GEN-LAST:event_LoginClientMouseClicked

    private void NomClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomClientMouseExited
        //si on quitte le champ des noms et qu'il est vide, il se remet a sa valeur de base
        if (NomClient.getText().equals("")) {
            NomClient.setText("Nom");
        }
    }//GEN-LAST:event_NomClientMouseExited

    private void PrenomClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenomClientMouseExited
        //si on quitte le champ des prenoms et qu'il est vide, il se remet a sa valeur de base
        if (PrenomClient.getText().equals("")) {
            PrenomClient.setText("Prenom");
        }
    }//GEN-LAST:event_PrenomClientMouseExited

    private void EmailClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailClientMouseExited
        //si on quitte le champ des email et qu'il est vide,ou bien s'il est incorrecte, il se remet a sa valeur de base
        String RegExpression = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(RegExpression);
        Matcher matcher = pattern.matcher(EmailClient.getText());
        if (EmailClient.getText().equals("")) {
            EmailClient.setText("Email");
        } else {
            if((!matcher.matches())&&(!EmailClient.getText().equals("Email"))){
                JOptionPane.showMessageDialog(null, "Email incorrect, veuillez le re-saisir");
                EmailClient.setText(null);
            }
        }
    }//GEN-LAST:event_EmailClientMouseExited

    private void LoginClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginClientMouseExited
        //si on quitte sur le champ des mdp et qu'il est vide, il se remet a sa valeur de base
        if (LoginClient.getText().equals("")) {
            LoginClient.setText("Mot de passe");
        }
    }//GEN-LAST:event_LoginClientMouseExited

    private void BoutonInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonInscriptionActionPerformed
        inscriptionOK = !((NomClient.getText().equals("Nom")) || (PrenomClient.getText().equals("Prenom")) || (AgeClient.getText().equals("Age")) || (EmailClient.getText().equals("Email")) || (LoginClient.getText().equals("Mot de passe")));

        client = new ClientDAO("cinema", "root", "");
        //test pour savoir si le client est deja inscrit
        try {
            testPresence = client.getNbClientByEmail(EmailClient.getText());
            if (!(testPresence.equals("0"))) {
                inscriptionOK = false;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageInscription.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*catch(MySQLSyntaxErrorException e){
        JOptionPane.showMessageDialog(null, "Votre inscription a ete enregistree");
        }*/ 
        /*catch(MySQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(null, "Votre inscription a ete enregistree");
        }*/

        if (inscriptionOK) {
            try {
                client.addClient(NomClient.getText(), PrenomClient.getText(), AgeClient.getText(), EmailClient.getText(), LoginClient.getText());
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PageInscription.class.getName()).log(Level.SEVERE, null, ex);
            }
            //on enleve les valeurs precedentes des cases du formulaire
            NomClient.setText("Nom");
            PrenomClient.setText("Prenom");
            AgeClient.setText("Age");
            EmailClient.setText("Email");
            LoginClient.setText("Mot de passe");

            //On affiche le fait que l'inscription ait été faite
            JOptionPane.showMessageDialog(null, "Votre inscription a ete enregistree");

            //On ferme la page
            this.dispose();
        }
    }//GEN-LAST:event_BoutonInscriptionActionPerformed

    private void btnCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoActionPerformed
        //si on appuie sur le bouton de connexion, il nous redirige vers une page de connexion et ferme la page actuelle
        JOptionPane.showMessageDialog(null, "Vous allez être redirige vers la page de connexion");
        this.dispose();
        try {
            PageConnexion p = new PageConnexion();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PageInscription.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PageInscription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCoActionPerformed

    private void AgeClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgeClientMouseClicked
        //si on clique sur le champ des ages,il se vide
        AgeClient.setText(null);
    }//GEN-LAST:event_AgeClientMouseClicked

    private void AgeClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgeClientMouseExited
        //si on quitte sur le champ des ages et qu'il est vide, il se remet a sa valeur de base
        if(AgeClient.getText().equals("")){
            AgeClient.setText("Age");
        }
    }//GEN-LAST:event_AgeClientMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField AgeClient;
    private javax.swing.JButton BoutonInscription;
    private javax.swing.JTextField EmailClient;
    private javax.swing.JTextField LoginClient;
    private javax.swing.JTextField NomClient;
    private javax.swing.JTextField PrenomClient;
    private javax.swing.JButton btnCo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
