/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Combo extends Producto {
    private String descripcion="";
    private ArrayList<Plato> losPlatos= new ArrayList<>();

    public Combo(String descripcion, int codigo, String nombre, boolean disponibilidad, float precio) {
        super(codigo, nombre, disponibilidad, precio);
        this.descripcion = descripcion;
    }

    public Combo(int codigo, String nombre, boolean disponibilidad, float precio) {
        super(codigo, nombre, disponibilidad, precio);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Plato> getLosPlatos() {
        return losPlatos;
    }

    public void setLosPlatos(ArrayList<Plato> losPlatos) {
        this.losPlatos = losPlatos;
    }

    @Override
    public String toString() {
        return "Combo{" + "descripcion=" + descripcion + ", losPlatos=" + losPlatos + '}';
    }
    
}
