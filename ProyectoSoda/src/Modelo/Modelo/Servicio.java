/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author bryan
 */
public abstract class Servicio {
    protected Date fecha;
    protected int telefono;
    protected long identificacion;

    public Servicio(Date fecha, int telefono, long identificacion) {
        this.fecha = fecha;
        this.telefono = telefono;
        this.identificacion = identificacion;
    }

    
    
}
