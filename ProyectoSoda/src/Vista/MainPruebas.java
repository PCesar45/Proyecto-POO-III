
package Vista;


import Controlador.Singleton;
import Modelo.Combo;
import Modelo.FactoryProducto;
import Modelo.Fichero;
import Modelo.LeerAdmins;
import Modelo.LeerCombos;
import Modelo.LeerPlatos;
import Modelo.Plato;
import Modelo.TPlato;
import Modelo.TProducto;


/**
 *
 * PRUEBAS
 * 
 */
public class MainPruebas {

    public static void main(String[] args) {
        
        //Carga la información de los admins
        LeerAdmins adms= new LeerAdmins();
        adms.Recuperar();
        
        //Carga los platos
        LeerPlatos plts= new LeerPlatos();
        plts.Recuperar();
        
        //Carga los combos
        LeerCombos p1 = new LeerCombos();
        p1.Recuperar();
        
        System.out.println(Singleton.getInstance().getMiLocal().getMenu().VerCombos().toString());
        System.out.println();
        
        Plato unPlato= (Plato) FactoryProducto.getProducto(TProducto.PLATO, 1, "Pollo", true, 1700);
        unPlato.setTipo(TPlato.COMIDA);
        System.out.println(unPlato.toString());
        
        Plato papas= (Plato) FactoryProducto.getProducto(TProducto.PLATO, 1, "Papas", true, 1000);
        papas.setTipo(TPlato.ENTRADA);
        System.out.println(papas.toString());
        
        Combo unCombo= (Combo) FactoryProducto.getProducto(TProducto.COMBO, 100, "Combo 1", true, 2700);
        unCombo.setDescripcion("Pollo y papas");
        unCombo.getLosPlatos().add(unPlato);
        unCombo.getLosPlatos().add(papas);
        
        System.out.println(unCombo.toString());

        //Singleton.getInstance().getMiLocal().cargarDatos(Fichero.ADMINISTRADORES);
        //System.out.println(Singleton.getInstance().getMiLocal().getAdmins().toString());
        
        //Singleton.getInstance().getMiLocal().cargarDatos(Fichero.PLATILLOS);
        //System.out.println(Singleton.getInstance().getMiLocal().getMenu().VerPlatos().toString());
        
        
    }
    
}
