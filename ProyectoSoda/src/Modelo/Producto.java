/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author bryan
 */
public abstract class Producto {
    protected int codigo=0;
    protected String nombre="";
    protected boolean disponibilidad=true;
    protected float precio=0;

    public Producto(int codigo, String nombre, boolean disponibilidad, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }
    
}
