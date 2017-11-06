/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.ProductoDA;
import Modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author Moises
 */
public class ProductoBL {
    private ProductoDA accesoDatos;
    
    public ProductoBL(){
        accesoDatos = new ProductoDA();
    }
    public ArrayList<Producto> devolverProductos(){
        return accesoDatos.devolverProductos();
    }
    public ArrayList<Producto> devolverProductos(int i){
        return accesoDatos.devolverProductos(i);
    }
}
