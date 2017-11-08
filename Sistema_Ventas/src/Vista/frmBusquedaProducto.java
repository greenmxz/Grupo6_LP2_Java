/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ProductoBL;
import Modelo.Producto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moises
 */
public class frmBusquedaProducto extends javax.swing.JDialog {
    private ProductoBL logicaNegocioProducto;

    private Producto productoSeleccionado;
    private ArrayList<Producto> lista ;
    private int stock=200;
    
    DefaultTableModel modelo;
    /**
     * Creates new form frmBusquedaProducto
     */
    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }
    public frmBusquedaProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBackground(new Color(54,63,69));
        logicaNegocioProducto = new ProductoBL();
        this.setSize(1021, 604);
        //((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        panelTitulo.setBackground(new Color(54,63,69));
        textTituloProducto.hide();
        btnTerminar.hide();
        lista = logicaNegocioProducto.devolverProductos();
        actualizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStock = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        txtStock = new javax.swing.JTextField();
        panelTitulo = new javax.swing.JPanel();
        textTituloProducto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(54, 63, 69));

        lblStock.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        lblStock.setText("Stock:");

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Stock"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        panelTitulo.setBackground(new java.awt.Color(96, 125, 138));

        textTituloProducto.setBackground(new java.awt.Color(255, 255, 255));
        textTituloProducto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        textTituloProducto.setForeground(new java.awt.Color(255, 255, 255));
        textTituloProducto.setText("Productos Agotados");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(788, Short.MAX_VALUE)
                .addComponent(textTituloProducto)
                .addGap(24, 24, 24))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textTituloProducto)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnConsultar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTerminar)
                            .addGap(70, 70, 70)
                            .addComponent(btnSeleccionar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(137, 137, 137)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 555, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConsultar)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStock)
                        .addComponent(btnTerminar)
                        .addComponent(btnSeleccionar))
                    .addGap(34, 34, 34)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(168, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        if(tablaProductos.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione al menos un producto");
            return;
        }
        int index=tablaProductos.getSelectedRow();
        productoSeleccionado=lista.get(index);
        this.dispose();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        if (txtStock.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese un stock");
            return;
        }
        lista=logicaNegocioProducto.devolverProductos(Integer.parseInt(txtStock.getText()));
        modelo= (DefaultTableModel)tablaProductos.getModel();
        Object fila[] = new Object[3];
        deleteRows();

        for (int i=0;i<lista.size();i++){
            fila[0]=lista.get(i).getIdProducto();
            fila[1]=lista.get(i).getNombre();
            fila[2]=lista.get(i).getStock();
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed
    public void deleteRows(){
        modelo= (DefaultTableModel)tablaProductos.getModel();
        int rowCount = modelo.getRowCount();
        for (int i=rowCount-1;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    private void actualizarTabla(){
        DefaultTableModel modelo= (DefaultTableModel)tablaProductos.getModel();
        Object fila[] = new Object[3];

        for (int i=0; i < lista.size();i++){
            fila[0]=lista.get(i).getIdProducto();
            fila[1]=lista.get(i).getNombre();
            fila[2]=lista.get(i).getStock();
            modelo.addRow(fila);
        }
    }
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
            java.util.logging.Logger.getLogger(frmBusquedaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBusquedaProducto dialog = new frmBusquedaProducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStock;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JLabel textTituloProducto;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
