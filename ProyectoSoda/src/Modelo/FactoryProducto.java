
package Modelo;


public class FactoryProducto {
    
    
    public static Producto getProducto(TProducto categoria, int codigo, String nombre, boolean disponibilidad, float precio){
        Producto p = null;
        switch(categoria){
            case PLATO:
                p = new Plato(codigo,nombre,disponibilidad,precio); break;
            case COMBO:
                p = new Combo(codigo,nombre,disponibilidad,precio); break;
            default:
                p= null;
        }
        return p;
    }
    
}
