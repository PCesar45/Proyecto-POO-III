
package Modelo;

import java.util.ArrayList;


public class Local {
    
    private String nombre;
    private int capacidad;
    private double aforo;
    private int maxOrdenes;
    
    private ArrayList<Administrador> Admins = new ArrayList<Administrador>();
    

    public ArrayList<Administrador> getAdmins() {
        return Admins;
    }
    
    
    
}
