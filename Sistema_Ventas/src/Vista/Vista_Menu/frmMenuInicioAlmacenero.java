/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Vista_Menu;

import Vista.frmDespachoPedido;
import Vista.frmGenerarGuiaRemision;
import Vista.frmOrdenCompra;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Moises
 */
public class frmMenuInicioAlmacenero extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmMenuInicioAlmacenero
     */
    private Estado estado ;
    private frmCabecera padre;
    
    public frmMenuInicioAlmacenero(frmCabecera padre) {
        initComponents();
        this.setLocation(0,111);
        //this.contenedorPadre = contenedorPadre;
        this.padre=padre;
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        estado=Estado.Abierto;
    }
    void setColor(JPanel panel){
        panel.setBackground(new Color(30,67,112));
        //136,161,192
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(173,192,206));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuiaRemision = new javax.swing.JButton();
        btnDespachoPedido = new javax.swing.JButton();
        panelDespachoPedido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelGuiaRemision = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 67, 112));
        setBorder(null);

        btnGuiaRemision.setText("Guia de remisión");
        btnGuiaRemision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiaRemisionActionPerformed(evt);
            }
        });

        btnDespachoPedido.setText("Despacho pedido");
        btnDespachoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespachoPedidoActionPerformed(evt);
            }
        });

        panelDespachoPedido.setBackground(new java.awt.Color(173, 192, 206));
        panelDespachoPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDespachoPedidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelDespachoPedidoMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelDespachoPedidoMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Despacho pedido");

        javax.swing.GroupLayout panelDespachoPedidoLayout = new javax.swing.GroupLayout(panelDespachoPedido);
        panelDespachoPedido.setLayout(panelDespachoPedidoLayout);
        panelDespachoPedidoLayout.setHorizontalGroup(
            panelDespachoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDespachoPedidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        panelDespachoPedidoLayout.setVerticalGroup(
            panelDespachoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDespachoPedidoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        panelGuiaRemision.setBackground(new java.awt.Color(173, 192, 206));
        panelGuiaRemision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGuiaRemisionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelGuiaRemisionMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelGuiaRemisionMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Guia de remisión");

        javax.swing.GroupLayout panelGuiaRemisionLayout = new javax.swing.GroupLayout(panelGuiaRemision);
        panelGuiaRemision.setLayout(panelGuiaRemisionLayout);
        panelGuiaRemisionLayout.setHorizontalGroup(
            panelGuiaRemisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuiaRemisionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        panelGuiaRemisionLayout.setVerticalGroup(
            panelGuiaRemisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuiaRemisionLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDespachoPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuiaRemision, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDespachoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
            .addComponent(panelGuiaRemision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(panelDespachoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelGuiaRemision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(btnDespachoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuiaRemision, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiaRemisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiaRemisionActionPerformed
        frmGenerarGuiaRemision frmGuiaRem = new frmGenerarGuiaRemision(padre);
        padre.getDesktopPane().add(frmGuiaRem);
        frmGuiaRem.show();
        this.hide();
        padre.setEstado(Estado.Cerrado);
        this.estado=Estado.Cerrado;
    }//GEN-LAST:event_btnGuiaRemisionActionPerformed

    private void btnDespachoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespachoPedidoActionPerformed
        // TODO add your handling code here:
        frmDespachoPedido frmDespacho = new frmDespachoPedido();
        padre.getDesktopPane().add(frmDespacho);
        frmDespacho.show();
        this.hide();
        padre.setEstado(Estado.Cerrado);
        this.estado=Estado.Cerrado;
    }//GEN-LAST:event_btnDespachoPedidoActionPerformed

    private void panelDespachoPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDespachoPedidoMouseClicked
        // TODO add your handling code here:
        frmDespachoPedido frmDespacho = new frmDespachoPedido();
        padre.getDesktopPane().add(frmDespacho);
        frmDespacho.show();
        this.hide();
        padre.setEstado(Estado.Cerrado);
        this.estado=Estado.Cerrado;
    }//GEN-LAST:event_panelDespachoPedidoMouseClicked

    private void panelDespachoPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDespachoPedidoMouseEntered
        // TODO add your handling code here:
        setColor(panelDespachoPedido);
        resetColor(panelGuiaRemision);

    }//GEN-LAST:event_panelDespachoPedidoMouseEntered

    private void panelDespachoPedidoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDespachoPedidoMouseReleased
        // TODO add your handling code here:
        resetColor(panelDespachoPedido);
        resetColor(panelGuiaRemision);
    }//GEN-LAST:event_panelDespachoPedidoMouseReleased

    private void panelGuiaRemisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGuiaRemisionMouseClicked
        // TODO add your handling code here:
        frmGenerarGuiaRemision frmGuiaRem = new frmGenerarGuiaRemision(padre);
        padre.getDesktopPane().add(frmGuiaRem);
        frmGuiaRem.show();
        this.hide();
        padre.setEstado(Estado.Cerrado);
        this.estado=Estado.Cerrado;
    }//GEN-LAST:event_panelGuiaRemisionMouseClicked

    private void panelGuiaRemisionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGuiaRemisionMouseEntered
        // TODO add your handling code here:
        setColor(panelGuiaRemision);
        resetColor(panelDespachoPedido);
    }//GEN-LAST:event_panelGuiaRemisionMouseEntered

    private void panelGuiaRemisionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGuiaRemisionMouseReleased
        // TODO add your handling code here:
        resetColor(panelDespachoPedido);
        resetColor(panelGuiaRemision);
    }//GEN-LAST:event_panelGuiaRemisionMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDespachoPedido;
    private javax.swing.JButton btnGuiaRemision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelDespachoPedido;
    private javax.swing.JPanel panelGuiaRemision;
    // End of variables declaration//GEN-END:variables
}
