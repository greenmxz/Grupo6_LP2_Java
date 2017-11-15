/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.OrdenCompraDA;
import Modelo.OrdenCompra;
import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Moises
 */
public class OrdenCompraBL {
    private OrdenCompraDA accesoDatos;
    public OrdenCompraBL(){
        accesoDatos = new OrdenCompraDA();
    }
    public ArrayList<OrdenCompra> devolverLista(){
        return accesoDatos.devolverLista();
    }
    public boolean registrarOrden(OrdenCompra oc,Usuario us){
        return accesoDatos.registrarOrden(oc,us);
    }
    public boolean actualizarOrden(OrdenCompra oc,Usuario us){
        return accesoDatos.actualizarOrden(oc, us);
    }
}
