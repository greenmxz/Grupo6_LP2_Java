/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import AccesoDatos.UsuarioDA;
import Modelo.Usuario;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Jose Bejarano
 */
public class frmModificarCuenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmModificarCuenta
     */
    String[] roles = { "Almacenero", "Seguridad", "Logistica" };
    Usuario user;
    public frmModificarCuenta() {
        initComponents();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setLocation(144,0);
        jComboBox1.setModel(new DefaultComboBoxModel(roles));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Usuario:");

        jLabel3.setText("Nueva Contraseña:");

        jTextField3.setEnabled(false);

        jLabel5.setText("Repetir Contraseña:");

        jTextField4.setEnabled(false);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setEnabled(false);

        jLabel6.setText("Rol:");

        jButton2.setText("Modificar Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton2)
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addGap(0, 177, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vacio");
            return;
        }
        
        //busco al usuario
        UsuarioDA uda = new UsuarioDA();
        Usuario user = uda.getUsuario(this.jTextField1.getText());
        this.user = user;
        
        if(user == null){
            return;
        }
        
        int index = 0;
        if(user.getTipoUsuario() == 1) index = 1;
        else if(user.getTipoUsuario() == 3) index = 0;
        else if(user.getTipoUsuario() == 4) index = 2;
        
        this.jTextField1.setEnabled(false);
        this.jComboBox1.setEnabled(true);
        this.jComboBox1.setSelectedIndex(index);
        this.jTextField3.setEnabled(true);
        this.jTextField4.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //modificar usuario
        if(this.user == null) return;
        
        int idtipo = 0;
        if(this.jComboBox1.getSelectedItem().toString().equals(roles[0])) idtipo = 1;
        else if(this.jComboBox1.getSelectedItem().toString().equals(roles[1])) idtipo = 3;
        else if(this.jComboBox1.getSelectedItem().toString().equals(roles[2])) idtipo = 4;
        
        UsuarioDA uda = new UsuarioDA();
        
        boolean flag = true;
        
        if(idtipo != this.user.getTipoUsuario() && (!this.jTextField3.getText().isEmpty() && !this.jTextField3.getText().isEmpty() )){    
            flag = flag && uda.UpdateTipo(this.user.getIdUsuario(), idtipo);
            flag = flag && uda.UpdatePassword(this.user.getIdUsuario(), this.jTextField3.getText());   
        }
        else if(idtipo == this.user.getTipoUsuario() && (!this.jTextField3.getText().isEmpty() && !this.jTextField3.getText().isEmpty() )){
            flag = flag && uda.UpdatePassword(this.user.getIdUsuario(), this.jTextField3.getText()); 
        }
        else if(idtipo != this.user.getTipoUsuario() && (this.jTextField3.getText().isEmpty() && this.jTextField3.getText().isEmpty() )){
            flag = flag && uda.UpdateTipo(this.user.getIdUsuario(), idtipo);
        }
        
        if(flag){
            JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
            this.user = null;
            this.jComboBox1.setSelectedIndex(0);
            this.jTextField1.setText("");
            this.jTextField3.setText("");
            this.jTextField4.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Error de Actualizacion");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
