/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.*;
/**
 *
 * @author Moises
 */
public class OrdenCompra {
    private int idOrdenCompra;
    private int cantidadTotalProducto;
    private Date fechaOrdenCompra;
    private ArrayList<DetalleOrdenCompra> detalleOrdenCompra;
    
    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public int getCantidadTotalProducto() {
        return cantidadTotalProducto;
    }

    public void setCantidadTotalProducto(int cantidadTotalProducto) {
        this.cantidadTotalProducto = cantidadTotalProducto;
    }

    public Date getFechaOrdenCompra() {
        return fechaOrdenCompra;
    }

    public void setFechaOrdenCompra(Date fechaOrdenCompra) {
        this.fechaOrdenCompra = fechaOrdenCompra;
    }
    public ArrayList<DetalleOrdenCompra> getDetalleOrdenCompra() {
        return detalleOrdenCompra;
    }

    public void setDetalleOrdenCompra(ArrayList<DetalleOrdenCompra> detalleOrdenCompra) {
        this.detalleOrdenCompra = detalleOrdenCompra;
    }
}
