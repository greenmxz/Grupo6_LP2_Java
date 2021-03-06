/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.frmReportes;

import Controlador.ClienteBL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Moises
 */
public class Menu1 extends javax.swing.JPanel {
    private String [] tipoReporte={"Clientes con mayores pedidos","Clientes con menores pedidos"};
    private ClienteBL logicaNegocioCliente;
    /**
     * Creates new form Menu1
     */
    public Menu1() {
        initComponents();
        cboTipoReporte.setModel(new DefaultComboBoxModel(tipoReporte));
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
        jLabel2 = new javax.swing.JLabel();
        txtFechaInicial = new com.toedter.calendar.JDateChooser();
        cboTipoReporte = new javax.swing.JComboBox<>();
        btnGenerar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(54, 63, 69));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de reporte:");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha inicio:");

        cboTipoReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha fin:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(cboTipoReporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnGenerar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboTipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(118, 118, 118)
                .addComponent(btnGenerar)
                .addContainerGap(223, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        int index=cboTipoReporte.getSelectedIndex();
        SimpleDateFormat  sdf,sdf1;
        String            f1,f2;
        sdf = new SimpleDateFormat("yyyy-MM-dd");  // Or whatever format you need
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        
        try{
            f1 = sdf.format(txtFechaInicial.getDate());
            f2 = sdf1.format(jDateChooser2.getDate());


            if (f1.equals("")|| f2.equals("")){
                JOptionPane.showMessageDialog(null, "Seleccione las fechas");
                return;
            }
            try{

                if (txtFechaInicial.getDate().after(jDateChooser2.getDate())){
                    JOptionPane.showMessageDialog(null, "Seleccione fechas válidas");
                    return;
                }

                try{
                    switch(index){
                        case 0:
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
                            System.out.println("Se conecto correctamente");
                            JasperReport jr = (JasperReport)
                            JRLoader.loadObjectFromFile(
                                Menu1.class.getResource
                                ("clientesMasPedidos.jasper").getFile());

                            HashMap parametros = new HashMap();
                            parametros.put("fechaInicial", f1);
                            parametros.put("fechaFinal",f2);

                            JasperPrint impresion =
                            JasperFillManager.fillReport(
                                jr, parametros, con);
                            JasperViewer viewer = new JasperViewer(impresion,false);
                            //viewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            viewer.setVisible(true);
                            
                            con.close();
                            break;
                        case 1:
                            //productos  menores pedidos
                            //logicaNegocioProducto.devolverListaMenores();
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con2 = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
                            System.out.println("Se conecto correctamente");


                            JasperReport jr2 = (JasperReport)

                            JRLoader.loadObjectFromFile(
                                Menu1.class.getResource
                                ("clientesMenosPedidos.jasper").getFile());
                            System.out.println("1111111");
                            HashMap parametros2 = new HashMap();
                            parametros2.put("fechaInicial", f1);
                            parametros2.put("fechaFinal",f2);

                            JasperPrint impresion2 =
                            JasperFillManager.fillReport(
                                jr2, parametros2, con2);
                            JasperViewer viewer2 = new JasperViewer(impresion2,false);

                            viewer2.setVisible(true);
                            //viewer2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            
                            System.out.println("2222222");
                            con2.close();
                            break;
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Ocurrió un error al generar reporte");
                    return;
                }
            }catch(Exception ex ){
                JOptionPane.showMessageDialog(null, "Seleccione un tipo de reporte");
                return;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Seleccione las fechas");
            return;
        }
    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cboTipoReporte;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.calendar.JDateChooser txtFechaInicial;
    // End of variables declaration//GEN-END:variables
}
