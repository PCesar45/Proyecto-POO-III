
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
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * PRUEBAS
 * 
 */
public class MainPruebas {

    public static void main(String[] args) {
        

        
        Singleton.getInstance().getMiLocal().cargarDatos(Fichero.ADMINISTRADORES);
        System.out.println(Singleton.getInstance().getMiLocal().getAdmins().toString());
        
        Singleton.getInstance().getMiLocal().cargarDatos(Fichero.PLATILLOS);
        System.out.println(Singleton.getInstance().getMiLocal().getMenu().VerPlatos().toString());
        
        Singleton.getInstance().getMiLocal().cargarDatos(Fichero.COMBOS);
        System.out.println(Singleton.getInstance().getMiLocal().getMenu().VerCombos().toString());
        
        //Despliegue de los ventanas
        
        Logeo v1 = new Logeo();
        v1.setVisible(true);
        
        VistaCliente v2 = new VistaCliente();
        v2.setVisible(true);
        
        
        
        
        
        
    }
    
}
