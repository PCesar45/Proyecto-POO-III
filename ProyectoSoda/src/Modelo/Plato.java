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

    public Plato(int codigo, String nombre, boolean disponibilidad, float precio) {
        super(codigo, nombre, disponibilidad, precio);
    }

    public TPlato getTipo() {
        return tipo;
    }

    public void setTipo(TPlato tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        return "Plato{" + "codigo: " + codigo + ", nombre: "+ nombre + ", precio: "+ precio + '}';
    }
    
}
