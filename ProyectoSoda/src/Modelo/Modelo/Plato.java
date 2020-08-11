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
public class Plato extends Producto {
    private TPlato tipo;

    public Plato(TPlato tipo, int codigo, String nombre, boolean disponibilidad, float precio) {
        super(codigo, nombre, disponibilidad, precio);
        this.tipo = tipo;
    }
    
}
