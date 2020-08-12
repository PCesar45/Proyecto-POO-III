
package Modelo;

import java.util.ArrayList;


public class Local {
    
    private String nombre;
    private int capacidad;
    private double aforo;
    private int maxOrdenes;
    private Menu menu= new Menu();
    private ArrayList<Administrador> Admins = new ArrayList<Administrador>();
    
    
    public boolean validarAdmin(long cod){
        for(Administrador unAdm: Admins){
            if(unAdm.getCodigo()==cod){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Administrador> getAdmins() {
        return Admins;
    }
    
    public Menu getMenu(){
        return menu;
    }
}
