/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Pedido;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Jose Bejarano
 */
public class PedidosDA {
    
    public PedidosDA(){
        
    }
    
    public ArrayList<Pedido> getPedidos(){
        
        ArrayList<Pedido> ret = new ArrayList<Pedido>();
        
        try{
            //Registro del Driver
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96", "inf282g6", "ta1RQx6flDXdiTpr");
            
            Statement sentencia = con.createStatement();
            
            String instruccion = "SELECT * FROM Pedido";
            
            ResultSet rs = sentencia.executeQuery(instruccion);
            
            while(rs.next()){
                Pedido ped = new Pedido(rs.getInt("idCliente"));
                ped.setFecha(rs.getString("fechaPedido"));
                ped.setImporte(rs.getFloat("importeTotal"));
                ret.add(ped);
            }
     
            con.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return ret;
    }
    
}
