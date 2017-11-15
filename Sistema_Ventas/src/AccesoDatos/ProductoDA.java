/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Producto;
import Modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author Moises
 */
public class ProductoDA {
    
    public ArrayList<Producto> getProd_ped(int idped){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            ArrayList<Producto> lista = new ArrayList<>();
            Statement sentencia= con.createStatement();
            //SELECT p.* from Producto p, (SELECT * FROM DetallePedido WHERE idPedido=1) d WHERE d.IdProducto = p.IdProducto
            String instruccion = "SELECT p.*"
                    + " from Producto p, (SELECT * FROM DetallePedido WHERE idPedido="+idped+") d "
                    + "WHERE d.IdProducto = p.IdProducto";
            
            ResultSet rs = sentencia.executeQuery(instruccion);
            while (rs.next( )){
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioUnitario(rs.getDouble("precioUnitario"));
                producto.setPeso(rs.getDouble("peso"));
                producto.setStock(rs.getInt("stock"));                
                lista.add(producto);
            }
            con.close();
            return lista;
        }catch(Exception ex){
            return null;
        }
    }
    
    public ArrayList<Producto> devolverProductos(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            ArrayList<Producto> lista = new ArrayList<>();
            Statement sentencia= con.createStatement();
            
            //String instruccion = "Select * from Usuario where idTipoUsuario not in ("+2+","+5+") and "+"nombreUsuario='"+nombreUsuario+"' and "+"contraseña='"+contrasena+"'";
            String instruccion = "Select * from Producto";
            //System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            while (rs.next( )){
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioUnitario(rs.getDouble("precioUnitario"));
                producto.setPeso(rs.getDouble("peso"));
                producto.setStock(rs.getInt("stock"));                
                lista.add(producto);
            }
            con.close();
            return lista;
        }catch(Exception ex){
            return null;
        }
    }
    public ArrayList<Producto> devolverProductos(int i){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            ArrayList<Producto> lista = new ArrayList<>();
            Statement sentencia= con.createStatement();
            
            //String instruccion = "Select * from Usuario where idTipoUsuario not in ("+2+","+5+") and "+"nombreUsuario='"+nombreUsuario+"' and "+"contraseña='"+contrasena+"'";
            
            String instruccion = "Select * from Producto where stock<="+i;
            //System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            while (rs.next( )){
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioUnitario(rs.getDouble("precioUnitario"));
                producto.setPeso(rs.getDouble("peso"));
                producto.setStock(rs.getInt("stock"));                
                lista.add(producto);
            }
            con.close();
            return lista;
        }catch(Exception ex){
            return null;
        }
    }
    
    public ArrayList<Producto> devolverListaMayores(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            ArrayList<Producto> lista = new ArrayList<>();
            Statement sentencia= con.createStatement();
            String instruccion = "Select Count(P.idProducto) as _contador,P.idCliente as _idCliente,C.razonSocial as _razonSocial from Pedido as P inner join Cliente as C on (P.idCliente=C.idCliente) order by ASC";
            //System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            while(rs.next()){
                Producto producto = new Producto();
                //producto.setIdProducto(0);
                
                lista.add(producto);
            }
            return lista;
        }catch(Exception ex){
            return null;
        }
    }
    
    public ArrayList<Producto> devolverListaMenores(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            ArrayList<Producto> lista = new ArrayList<>();
            Statement sentencia= con.createStatement();
            String instruccion = "Select Count(P.idProducto) as _contador,P.idCliente as _idCliente,C.razonSocial as _razonSocial from Pedido as P inner join Cliente as C on (P.idCliente=C.idCliente) order by ASC";
            //System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            while(rs.next()){
                Producto producto = new Producto();
                //producto.setIdProducto(0);
                
                lista.add(producto);
            }
            return lista;
        }catch(Exception ex){
            return null;
        }
    }
}
