/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Vista_Menu;

import Vista.frmGenerarGuiaRemision;
import Vista.frmOrdenCompra;
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

        setBackground(new java.awt.Color(136, 161, 192));
        setBorder(null);

        btnGuiaRemision.setText("Guia de remisión");
        btnGuiaRemision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiaRemisionActionPerformed(evt);
            }
        });

        btnDespachoPedido.setText("Despacho pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuiaRemision, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDespachoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnDespachoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnGuiaRemision, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDespachoPedido;
    private javax.swing.JButton btnGuiaRemision;
    // End of variables declaration//GEN-END:variables
}
