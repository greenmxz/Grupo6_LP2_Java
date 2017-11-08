/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;


import Modelo.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Moises
 */
public class OrdenCompraDA {
    public ArrayList<OrdenCompra> devolverLista(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            ArrayList<OrdenCompra> lista = new ArrayList<>();
            Statement sentencia= con.createStatement();
            
            //String instruccion = "Select * from Usuario where idTipoUsuario not in ("+2+","+5+") and "+"nombreUsuario='"+nombreUsuario+"' and "+"contraseña='"+contrasena+"'";
            String instruccion = "select * from OrdenCompra";
            //System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            
            
            while (rs.next( )){
                OrdenCompra oc = new OrdenCompra();
                oc.setIdOrdenCompra(rs.getInt("idOrdenCompra"));
                oc.setFechaOrdenCompra(rs.getDate("fechaOrdenCompra"));
                oc.setCantidadTotalProducto(rs.getInt("CantidadTotalProducto"));
                
                String instruccion2 = "select * from DetalleCompra";//
                
                
                //DetalleOrdenCompra d = new DetalleOrdenCompra();
                
                lista.add(oc);
            }
            con.close();
            return lista;
        }catch(Exception ex){
            return null;
        }
    }

}
