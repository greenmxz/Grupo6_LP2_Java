/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Pedido;
import Utilidades.PassHash;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Jose Bejarano
 */
public class PedidosDA {
    
    public PedidosDA(){
        
    }
    
    public void setDespachado(int id){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            Statement sentencia= con.createStatement();
            
            String instruccion = "UPDATE Pedido SET idEstadoPedido="+4+" WHERE idPedido="+id;
            
            sentencia.executeUpdate(instruccion);
            con.close();
            JOptionPane.showMessageDialog(null, "Estado cambiado a despachado");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error base de datos: " + ex.getMessage());
        }
    }
    
    public ArrayList<Pedido> getPedidos(){
        
        ArrayList<Pedido> ret = new ArrayList<Pedido>();
        
        try{
            //Registro del Driver
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6", "inf282g6", "ta1RQx6flDXdiTpr");
            
            Statement sentencia = con.createStatement();
            
            String instruccion = "SELECT * FROM Pedido Where idEstadoPedido = 1";
            
            ResultSet rs = sentencia.executeQuery(instruccion);
            
            while(rs.next()){
                Pedido ped = new Pedido(rs.getInt("idCliente"));
                ped.setFecha(rs.getString("fechaPedido"));
                ped.setImporte(rs.getFloat("importeTotal"));
                ped.setIdPedido(rs.getInt("idPedido"));
                ret.add(ped);
            }
            
             
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return ret;
    }
    
}
