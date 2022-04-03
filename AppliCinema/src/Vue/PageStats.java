/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.sql.SQLException;
import jdbc2020.Connexion;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import java.awt.Color;
import javax.swing.DefaultListModel;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import java.util.*;
import java.sql.*;
import jdbc2020.*;
import DAO.FilmDAO;

/**
 *
 * @author prohd https://www.youtube.com/watch?v=RUDrjqywD1g CodeTech Club
 */
public class PageStats extends javax.swing.JFrame {

    private FilmDAO film;
    int nombreDeFilms = 0;
    public DefaultListModel<String> liste1 = new DefaultListModel<>();
    public ArrayList<Integer> liste2 = new ArrayList<>();
    public DefaultListModel<String> listeNbVue = new DefaultListModel<>();

    public PageStats() throws SQLException, ClassNotFoundException {
        super("Statistiques");
        initComponents();

        film = new FilmDAO("cinema", "root", "");
        //on ajoute tout les titres de film dans la liste1
        liste1 = film.getFilmTitre();
        //on ajoute tout les nombres de vues de film dans la liste2
        /*
        connect.rset = connect.stmt.executeQuery(requeteNBVues);
        connect.rsetMeta = connect.rset.getMetaData();
        while ((connect.rset).next()) {
            int nbVues = (connect.rset).getInt("nombreVues");
            liste2.add(nbVues);
            nombreDeFilms++;
        }*/
        
        listeNbVue = film.getNbVue();
        nombreDeFilms = film.getNbFilm();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelStats = new javax.swing.JPanel();
        boutonStats = new javax.swing.JButton();
        graphique = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelStats.setLayout(new java.awt.BorderLayout());

        boutonStats.setText("Afficher Statistiques");
        boutonStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonStatsActionPerformed(evt);
            }
        });

        graphique.setBackground(new java.awt.Color(204, 214, 223));
        graphique.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 0, 18))); // NOI18N
        graphique.setLayout(new javax.swing.BoxLayout(graphique, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graphique, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutonStats)
                        .addGap(0, 1061, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphique, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boutonStats)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutonStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonStatsActionPerformed
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        //on va rajouter les films sur le graphique, en utilisant les elements des deux listes precedentes au rang i jusqu'a atteindre le nombre de films qui est determine avant
        for (int i = 0; i < nombreDeFilms; i++) {
            dcd.setValue(Integer.parseInt(listeNbVue.get(i)), "Nombre de vues", liste1.get(i));
        }

        JFreeChart jchart = ChartFactory.createBarChart("Popularite des films ", "Titre des films ", "Nombre de vues ", dcd, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);

        ChartPanel chartPanel = new ChartPanel(jchart);
        graphique.removeAll();
        graphique.add(chartPanel);
        graphique.updateUI();

    }//GEN-LAST:event_boutonStatsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelStats;
    private javax.swing.JButton boutonStats;
    private javax.swing.JPanel graphique;
    // End of variables declaration//GEN-END:variables
}
