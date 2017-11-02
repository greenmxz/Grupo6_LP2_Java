/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jose Bejarano
 */
public class Producto {
    
    private String nombre;
    private String descripcion;
    private float precio;
    //private String id??
    
    public Producto(String nom, String des, float pre){
        this.descripcion = des;
        this.nombre = nom;
        this.precio = pre;
    }
}
