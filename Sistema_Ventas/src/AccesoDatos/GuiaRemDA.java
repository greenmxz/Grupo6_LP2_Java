/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Utilidades.PassHash;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Bejarano
 */
public class GuiaRemDA {
    
    public GuiaRemDA(){
        
    }
    
    public boolean registrarGuiaRem(int idalm, Date fechat, String origen, String destino, int idped, int idcli){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            Statement sentencia= con.createStatement();
            
            java.util.Date dt = new java.util.Date();
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String currentTime = sdf.format(dt);
            java.sql.Date fechatraslado = new java.sql.Date(fechat.getTime());
            
            String instruccion = "Insert into GuiaRemision (idAlmacenero,"
                    + " fechaDeEmision, "
                    + "fechaDeTraslado, "
                    + "domicilioPartida, "
                    + "domicilioDestino, "
                    + "idPedido, "
                    + "idMotivoTraslado, "
                    + "estadoRegistro, "
                    + "idTransporte, "
                    + "idCliente"
                    + ") values "+
                    "(" + idalm+
                    ", '"+currentTime+
                    "', '"+fechatraslado+
                    "', '"+origen+
                    "', '"+destino+
                    "', "+idped+
                    ", "+1+
                    ", "+1+
                    ", "+1+
                    ", "+idcli+")";
                  
            
            sentencia.executeUpdate(instruccion);
            con.close();
            JOptionPane.showMessageDialog(null, "Guia registrada");
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error de Registro" + ex.getMessage());
            return false;
        }
        
        
        
    }
    
}
