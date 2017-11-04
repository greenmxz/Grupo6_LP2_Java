/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Usuario;
import java.sql.*;


/**
 *
 * @author Moises
 */
public class UsuarioDA {
    public Usuario obtenerUsuario(String nombreUsuario,String contrasena){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            Statement sentencia= con.createStatement();
            
            String instruccion = "Select * from Usuario where idTipoUsuario not in ("+2+","+5+") and "+"nombreUsuario='"+nombreUsuario+"' and "+"contraseña='"+contrasena+"'";
            System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            while (rs.next( )){
                Usuario user=new Usuario();
                user.setIdUsuario(rs.getInt("idUsuario"));
                user.setNombreUsuario(rs.getString("nombreUsuario"));
                user.setContrasena(rs.getString("contraseña"));
                user.setNombre(rs.getString("nombre"));
                user.setApellidoPaterno(rs.getString("apellidoPaterno"));
                user.setApellidoMaterno(rs.getString("apellidoMaterno"));
                user.setCorreo(rs.getString("correo"));
                user.setTipoUsuario(rs.getInt("idTipoUsuario"));
                con.close();
                System.out.println(user.getNombreUsuario() +"  "+user.getContrasena()+ " "+user.getTipoUsuario());
                return user;   
            }
            System.out.println("Usuario no encontrado");
            return null;
        }catch(Exception ex){
            return null;
        }
        
    }
}
