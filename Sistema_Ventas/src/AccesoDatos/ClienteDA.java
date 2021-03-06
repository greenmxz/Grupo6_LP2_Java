/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Cliente;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Moises
 */
public class ClienteDA {
    
    public String getNombreCliente(int id){
        String ret = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            Statement sentencia= con.createStatement();
            
            //String instruccion = "Select * from Usuario where idTipoUsuario not in ("+2+","+5+") and "+"nombreUsuario='"+nombreUsuario+"' and "+"contraseña='"+contrasena+"'";
            
            String instruccion = "SELECT razonSocial FROM Cliente where idCliente="+id;
            
            ResultSet rs = sentencia.executeQuery(instruccion);
            while (rs.next( )){
                ret = ret + rs.getString("razonSocial");
            }
        
        }catch(Exception e){
            
        }
        
        return ret;
    }
    
    public String getRucCliente(int id){
        String ret = "";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            Statement sentencia= con.createStatement();
            
            //String instruccion = "Select * from Usuario where idTipoUsuario not in ("+2+","+5+") and "+"nombreUsuario='"+nombreUsuario+"' and "+"contraseña='"+contrasena+"'";
            
            String instruccion = "SELECT ruc FROM Cliente where idCliente="+id;
            
            ResultSet rs = sentencia.executeQuery(instruccion);
            while (rs.next( )){
                ret = ret + rs.getString("ruc");
            }
        
        }catch(Exception e){
            
        }
        
        return ret;
    }
    public ArrayList<Cliente> devolverLista(int i){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            ArrayList<Cliente> lista = new ArrayList<>();
            Statement sentencia= con.createStatement();
            
            //String instruccion = "Select * from Usuario where idTipoUsuario not in ("+2+","+5+") and "+"nombreUsuario='"+nombreUsuario+"' and "+"contraseña='"+contrasena+"'";
            
            String instruccion = "Select Count(P.idCliente),P.idCliente from Pedido as P inner join Cliente as C on (P.idPedido=C.idPedido)";
            //System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            while (rs.next( )){
                Cliente cliente = new Cliente();
                            
                lista.add(cliente);
            }
            con.close();
            return lista;
        
        }catch(Exception ex){
            return null;
        }
        
        
    }
    
    public ArrayList<Cliente> devolverListaMayores(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            ArrayList<Cliente> lista = new ArrayList<>();
            Statement sentencia= con.createStatement();
            String instruccion = "Select Count(P.idCliente) as _contador,P.idCliente as _idCliente,C.razonSocial as _razonSocial from Pedido as P inner join Cliente as C on (P.idCliente=C.idCliente) order by ASC";
            //System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setRazonSocial(rs.getString("_razonSocial"));
                cliente.setIdCliente(rs.getInt("_idCliente"));
                cliente.setRuc(String.valueOf(rs.getInt("_contador")));
                lista.add(cliente);
            }
            return lista;
        }catch(Exception ex){
            return null;
        }
    }
    
    public ArrayList<Cliente> devolverListaMenores(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            ArrayList<Cliente> lista = new ArrayList<>();
            Statement sentencia= con.createStatement();
            String instruccion = "Select Count(P.idCliente) as _contador,P.idCliente as _idCliente,C.razonSocial as _razonSocial from Pedido as P inner join Cliente as C on (P.idCliente=C.idCliente) order by DESC";
            //System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setRazonSocial(rs.getString("_razonSocial"));
                cliente.setIdCliente(rs.getInt("_idCliente"));
                cliente.setRuc(String.valueOf(rs.getInt("_contador")));
                lista.add(cliente);
            }
            return lista;
        }catch(Exception ex){
            return null;
        }
    }
}
