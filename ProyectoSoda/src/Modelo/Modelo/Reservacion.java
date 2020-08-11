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
public class Reservacion extends Servicio {
    private ArrayList<Reservacion> asistentes= new ArrayList<>();

    public Reservacion(Date fecha, int telefono, long identificacion) {
        super(fecha, telefono, identificacion);
    }
    
}
