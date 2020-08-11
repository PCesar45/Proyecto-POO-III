/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bryan
 */
public class Pedido extends Servicio {
    private int numOrden;
    private String direccion;
    private ArrayList<Pedido> pedidos= new ArrayList<>();

    public Pedido(int numOrden, String direccion, Date fecha, int telefono, long identificacion) {
        super(fecha, telefono, identificacion);
        this.numOrden = numOrden;
        this.direccion = direccion;
    }
    
}
