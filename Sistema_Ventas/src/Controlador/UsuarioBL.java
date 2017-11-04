/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.UsuarioDA;
import Modelo.Usuario;

/**
 *
 * @author Moises
 */
public class UsuarioBL {
    private UsuarioDA accesoDatos;
    public UsuarioBL(){
        accesoDatos=new UsuarioDA();
    }
    public Usuario obtenerUsuario(String nombreUsuario,String contrasena){
        return accesoDatos.obtenerUsuario(nombreUsuario,contrasena);
    }
}
