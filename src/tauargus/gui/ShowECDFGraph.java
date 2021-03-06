/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tauargus.gui;

import java.awt.BorderLayout;
import org.jfree.chart.ChartPanel;
import tauargus.model.ECDFGraphBuilder;

/**
 *
 * @author pwof
 */
public class ShowECDFGraph extends javax.swing.JDialog {

    /**
     * Creates new form ShowECDFGraph
     */
    private ChartPanel cp = null;

    public ShowECDFGraph(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Plot of the Empirical Cumulative Distribution Function");
        setLocationRelativeTo(parent);
    }
    
    public void showChart(String Name, double[] X, int N) {
        if (this.jPanelChart.getComponentCount() > 0) {
            this.jPanelChart.remove(this.cp);
            this.jPanelChart.revalidate();
        }

        ECDFGraphBuilder builder = new ECDFGraphBuilder();
        this.jPanelChart.setLayout(new BorderLayout());
        this.cp = builder.CreateChart(Name, X, 1.0/N);
        this.jPanelChart.add(this.cp, BorderLayout.CENTER);
        this.jPanelChart.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelChart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setName("DisplayECDFGraph"); // NOI18N

        javax.swing.GroupLayout jPanelChartLayout = new javax.swing.GroupLayout(jPanelChart);
        jPanelChart.setLayout(jPanelChartLayout);
        jPanelChartLayout.setHorizontalGroup(
            jPanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        jPanelChartLayout.setVerticalGroup(
            jPanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelChart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelChart;
    // End of variables declaration//GEN-END:variables
}
