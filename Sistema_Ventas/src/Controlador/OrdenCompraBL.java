/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.OrdenCompraDA;
import Modelo.OrdenCompra;
import java.util.ArrayList;

/**
 *
 * @author Moises
 */
public class OrdenCompraBL {
    private OrdenCompraDA accesoDatos;
    public ArrayList<OrdenCompra> OrdenCompraBL(){
        return accesoDatos.devolverLista();
    }
}
