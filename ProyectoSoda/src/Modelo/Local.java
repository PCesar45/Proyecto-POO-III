
package Modelo;

import java.util.ArrayList;


public class Local {
    private int codPedido=0;
    private String nombre;
    private int capacidad;
    private double aforo;
    private int maxOrdenes;
    private Menu menu= new Menu();
    private ArrayList<Administrador> Admins = new ArrayList<Administrador>();
    private ArrayList<Pedido> pedidos= new ArrayList<Pedido>();
    private ArrayList<Reservacion> reservaciones= new ArrayList<Reservacion>();
    
    public boolean validarAdmin(long cod){
        for(Administrador unAdm: Admins){
            if(unAdm.getCodigo()==cod){
                return true;
            }
        }
        return false;
    }
    
    public boolean cargarDatos(Fichero nombre){
        StrategyLecturaArchivo strategy = null;
        switch(nombre){
            case ADMINISTRADORES:
                strategy = new LeerAdmins();
                break;
            case PLATILLOS:
                strategy = new LeerPlatos();
                break;
            case COMBOS:
                strategy = new LeerCombos();
                break;
        }
        
        return strategy.Recuperar();
    }

    public ArrayList<Administrador> getAdmins() {
        return Admins;
    }
    
    public Menu getMenu(){
        return menu;
    }
    
    public ArrayList getListPedidos(){
        return pedidos;
    }
    
    public void agregarPedido(Pedido elPedido){
        pedidos.add(elPedido);
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }
    
    
}
