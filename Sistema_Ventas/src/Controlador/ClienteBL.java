/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.ClienteDA;

/**
 *
 * @author Moises
 */
public class ClienteBL {
    private ClienteDA accesoDatos;
    public ClienteBL (){
        accesoDatos=new ClienteDA();
    }
}
