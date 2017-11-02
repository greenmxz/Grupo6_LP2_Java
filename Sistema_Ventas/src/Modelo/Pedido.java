/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jose Bejarano
 */
public class Pedido {

   
    
    private int idCliente;
    private float importe;
    private String fecha;
    private ArrayList<Producto> ListaProd;
    private int idPedido;
    
    public Pedido(int idCli){
        this.idCliente = idCli;
    }
    
    public void setProductos(ArrayList<Producto> prods){
        this.ListaProd = prods;
    }
    
    public void addProducto(Producto prod){
        this.ListaProd.add(prod);
    }
    
    public float getImporte() {
        return importe;
    }

    
    public void setImporte(float importe) {
        this.importe = importe;
    }

    
    public String getFecha() {
        return fecha;
    }

    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
}
