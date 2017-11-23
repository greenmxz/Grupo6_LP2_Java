/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;
import Utilidades.PassHash;

/**
 *
 * @author Moises
 */
public class UsuarioDA {
    public Usuario obtenerUsuario(String nombreUsuario,String contra){
        String contrasena = PassHash.MD5Hash(contra);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            Statement sentencia= con.createStatement();
            
            String instruccion = "Select * from Usuario where idTipoUsuario not in ("+2+","+5+") and "+"nombreUsuario='"+nombreUsuario+"' and "+"contraseña='"+contrasena+"'";
            //System.out.println(instruccion);
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
                
                System.out.println(user.getNombreUsuario() +"  "+user.getContrasena()+ " "+user.getTipoUsuario());
                return user;   
            }
            con.close();
            System.out.println("Usuario no encontrado");
            return null;
        }catch(Exception ex){
            return null;
        }
        
    }
    
    public boolean RegistrarUsuario(String usuario, String pass, String nombre, String appat, String apmat, String correo, int idtipo ){
        
        try{
            //Registro del Driver
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6", "inf282g6", "ta1RQx6flDXdiTpr");
            
            Statement sentencia = con.createStatement();
            
            String instruccion = "SELECT count(*) as dato FROM Usuario";
            ResultSet rs = sentencia.executeQuery(instruccion);
            int idaux;
            rs.next();
            idaux = rs.getInt(1)+1;
            
            String auxpass = PassHash.MD5Hash(pass);
            if(pass.isEmpty())throw new Exception();
            System.out.println(auxpass);
            
            instruccion = "INSERT INTO Usuario(nombreUsuario, contraseña, nombre, apellidoPaterno, apellidoMaterno, correo, idTipoUsuario, estadoRegistro)"
                    + " values("+                   
                    "'"+usuario+
                    "','"+auxpass+
                    "','"+nombre+
                    "','"+appat+
                    "','"+apmat+
                    "','"+correo+
                    "',"+idtipo+
                    ","+1+
                    ")";
            
            sentencia.executeUpdate(instruccion);
            
            con.close();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error base de datos: " + ex.getMessage());
            return false;
        }
        
        
    }
    
    public Usuario getUsuario(String nomUsuario){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            Statement sentencia= con.createStatement();
            
            String instruccion = "Select * from Usuario where "+"nombreUsuario='"+nomUsuario+"'";
            //System.out.println(instruccion);
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
                
                System.out.println(user.getNombreUsuario() +"  "+user.getContrasena()+ " "+user.getTipoUsuario());
                return user;   
            }
            con.close();
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            return null;
        }catch(Exception ex){
            return null;
        }
    }
    
    public boolean UpdatePassword(int id, String pass){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            Statement sentencia= con.createStatement();
            
            String instruccion = "UPDATE Usuario SET contraseña='"+PassHash.MD5Hash(pass)+"' WHERE idUsuario="+id;
            
            sentencia.executeUpdate(instruccion);
            con.close();
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean UpdateTipo(int id, int tipo){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            Statement sentencia= con.createStatement();
            
            String instruccion = "UPDATE Usuario SET idTipoUsuario="+tipo+" WHERE idUsuario="+id;
            
            sentencia.executeUpdate(instruccion);
            con.close();
            return true;
        }catch(Exception ex){
            return false;
        }
    }
}
