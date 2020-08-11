
package Vista;


import Controlador.Singleton;
import Modelo.LeerAdmins;


/**
 *
 * PRUEBAS
 * 
 */
public class MainPruebas {

    public static void main(String[] args) {
        
        //Carga la información de los admins
        LeerAdmins p1 = new LeerAdmins();
        p1.Recuperar();
        
        System.out.println(Singleton.getInstance().getMiLocal().getAdmins().toString());
        
    }
    
}
