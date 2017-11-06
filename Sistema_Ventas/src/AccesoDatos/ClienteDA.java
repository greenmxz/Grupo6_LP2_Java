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
}
