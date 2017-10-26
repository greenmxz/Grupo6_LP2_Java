/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.frmReportes;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Moises
 */
public class frmReportes extends javax.swing.JInternalFrame {
    GridBagLayout layout = new GridBagLayout();
    Menu1 menu1;
    Menu2 menu2;
    /**
     * Creates new form frmReportes
     */
    public frmReportes() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        menu1= new Menu1();
        menu2= new Menu2();
        dynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(menu1,c);
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(menu2,c);
        menu1.setVisible(true);
        menu2.setVisible(false);
    }
    void setColor(JPanel panel){
        panel.setBackground(new Color(30,67,112));
        //85,65,118
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(173, 192, 206));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btnReporte1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnReporte3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnReporte2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dynamicPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(136, 161, 192));
        setBorder(null);

        panelMenu.setBackground(new java.awt.Color(30, 67, 112));

        btnReporte1.setBackground(new java.awt.Color(173, 192, 206));
        btnReporte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporte1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporte1MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReporte1MouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reporte 1");

        javax.swing.GroupLayout btnReporte1Layout = new javax.swing.GroupLayout(btnReporte1);
        btnReporte1.setLayout(btnReporte1Layout);
        btnReporte1Layout.setHorizontalGroup(
            btnReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReporte1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(62, 62, 62))
        );
        btnReporte1Layout.setVerticalGroup(
            btnReporte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReporte1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReporte3.setBackground(new java.awt.Color(173, 192, 206));
        btnReporte3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporte3MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReporte3MouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reporte 3");

        javax.swing.GroupLayout btnReporte3Layout = new javax.swing.GroupLayout(btnReporte3);
        btnReporte3.setLayout(btnReporte3Layout);
        btnReporte3Layout.setHorizontalGroup(
            btnReporte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReporte3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(62, 62, 62))
        );
        btnReporte3Layout.setVerticalGroup(
            btnReporte3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReporte3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReporte2.setBackground(new java.awt.Color(173, 192, 206));
        btnReporte2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporte2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporte2MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnReporte2MouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reporte 2");

        javax.swing.GroupLayout btnReporte2Layout = new javax.swing.GroupLayout(btnReporte2);
        btnReporte2.setLayout(btnReporte2Layout);
        btnReporte2Layout.setHorizontalGroup(
            btnReporte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReporte2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(62, 62, 62))
        );
        btnReporte2Layout.setVerticalGroup(
            btnReporte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReporte2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnReporte1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReporte3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReporte2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnReporte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnReporte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dynamicPanel.setBackground(new java.awt.Color(136, 161, 192));

        javax.swing.GroupLayout dynamicPanelLayout = new javax.swing.GroupLayout(dynamicPanel);
        dynamicPanel.setLayout(dynamicPanelLayout);
        dynamicPanelLayout.setHorizontalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        dynamicPanelLayout.setVerticalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporte1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte1MouseClicked
        // TODO add your handling code here:
        menu1.setVisible(true);
        menu2.setVisible(false);
    }//GEN-LAST:event_btnReporte1MouseClicked

    private void btnReporte2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte2MouseClicked
        // TODO add your handling code here:
        menu2.setVisible(true);
        menu1.setVisible(false);
    }//GEN-LAST:event_btnReporte2MouseClicked

    private void btnReporte1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte1MouseEntered
        // TODO add your handling code here:
        setColor(btnReporte1);
        resetColor(btnReporte2);
        resetColor(btnReporte3);
    }//GEN-LAST:event_btnReporte1MouseEntered

    private void btnReporte1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte1MouseReleased
        // TODO add your handling code here:
        resetColor(btnReporte3);
        resetColor(btnReporte2);
        resetColor(btnReporte1);
    }//GEN-LAST:event_btnReporte1MouseReleased

    private void btnReporte2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte2MouseEntered
        // TODO add your handling code here:
        setColor(btnReporte2);
        resetColor(btnReporte1);
        resetColor(btnReporte3);
    }//GEN-LAST:event_btnReporte2MouseEntered

    private void btnReporte2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte2MouseReleased
        // TODO add your handling code here:
        resetColor(btnReporte3);
        resetColor(btnReporte2);
        resetColor(btnReporte1);
    }//GEN-LAST:event_btnReporte2MouseReleased

    private void btnReporte3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte3MouseEntered
        // TODO add your handling code here:
        setColor(btnReporte3);
        resetColor(btnReporte2);
        resetColor(btnReporte1);
    }//GEN-LAST:event_btnReporte3MouseEntered

    private void btnReporte3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporte3MouseReleased
        // TODO add your handling code here:
        resetColor(btnReporte3);
        resetColor(btnReporte2);
        resetColor(btnReporte1);
    }//GEN-LAST:event_btnReporte3MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnReporte1;
    private javax.swing.JPanel btnReporte2;
    private javax.swing.JPanel btnReporte3;
    private javax.swing.JPanel dynamicPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}