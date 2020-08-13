
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
        
//        //Carga la información de los admins
//        LeerAdmins adms= new LeerAdmins();
//        adms.Recuperar();
//        
//        //Carga los platos
//        LeerPlatos plts= new LeerPlatos();
//        plts.Recuperar();
//        
//        //Carga los combos
//        LeerCombos p1 = new LeerCombos();
//        p1.Recuperar();
//        
//        System.out.println(Singleton.getInstance().getMiLocal().getMenu().VerCombos().toString());
//        System.out.println();
//        
//        Plato unPlato= (Plato) FactoryProducto.getProducto(TProducto.PLATO, 1, "Pollo", true, 1700);
//        unPlato.setTipo(TPlato.COMIDA);
//        System.out.println(unPlato.toString());
//        
//        Plato papas= (Plato) FactoryProducto.getProducto(TProducto.PLATO, 1, "Papas", true, 1000);
//        papas.setTipo(TPlato.ENTRADA);
//        System.out.println(papas.toString());
//        
//        Combo unCombo= (Combo) FactoryProducto.getProducto(TProducto.COMBO, 100, "Combo 1", true, 2700);
//        unCombo.setDescripcion("Pollo y papas");
//        unCombo.getLosPlatos().add(unPlato);
//        unCombo.getLosPlatos().add(papas);
//        
//        System.out.println(unCombo.toString());
        
        //Lectura y Carga de los Archivos
        
        Singleton.getInstance().getMiLocal().cargarDatos(Fichero.ADMINISTRADORES);
        System.out.println(Singleton.getInstance().getMiLocal().getAdmins().toString());
        
        Singleton.getInstance().getMiLocal().cargarDatos(Fichero.PLATILLOS);
        System.out.println(Singleton.getInstance().getMiLocal().getMenu().VerPlatos().toString());
        
        Singleton.getInstance().getMiLocal().cargarDatos(Fichero.COMBOS);
        System.out.println(Singleton.getInstance().getMiLocal().getMenu().VerCombos().toString());
        
        //Despliegue de los ventanas
        
        
        
        VistaCliente v2 = new VistaCliente();
        v2.setVisible(true);
        
        Logeo v1 = new Logeo();
        v1.setVisible(true);
        
        //Tabla - IMPORTANTE
      
//        boolean combos=true;
//        Menus vista=new Menus();
//        DefaultTableModel modelo=new DefaultTableModel();
//        JTable tabla=vista.DatosExcel;
//        tabla.setModel(modelo);
//        ArrayList<Plato> platos=Singleton.getInstance().getMiLocal().getMenu().VerPlatos();
//        ArrayList<Combo> combost=Singleton.getInstance().getMiLocal().getMenu().VerCombos();
//        modelo.addColumn("Codigo");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Precio");
//        modelo.addColumn("Disponibilidad");
//        if(combos)
//            modelo.addColumn("Descripcion");
//        Object[]ListaColumna=new Object[9999];
//         //int cont;
//         System.out.println(platos.size());
//        if(combos==true){
//            for(int j=0;j!=combost.size();j++){
//               /// System.out.println("1");
//                ListaColumna[0]=combost.get(j).getCodigo();
//                ListaColumna[1]=combost.get(j).getNombre();
//                ListaColumna[2]=combost.get(j).getPrecio();
//                if(combost.get(j).isDisponibilidad()==false){
//                    ListaColumna[3]="No esta disponible";
//                }
//                else{
//                    ListaColumna[3]="Disponible";
//                }
//                ListaColumna[4]=combost.get(j).getDescripcion();
//                modelo.addRow(ListaColumna);
//             }
//            
//        }
//        else{
//             for(int j=0;j!=platos.size();j++){
//             //   System.out.println("1");
//                ListaColumna[0]=platos.get(j).getCodigo();
//                ListaColumna[1]=platos.get(j).getNombre();
//                ListaColumna[2]=platos.get(j).getPrecio();
//                if(platos.get(j).isDisponibilidad()==false){
//                    ListaColumna[3]="No esta disponible";
//                }
//                else{
//                    ListaColumna[3]="Disponible";
//                }
//
//                modelo.addRow(ListaColumna);
//             }
//            
//        }
//        
//         vista.setVisible(true);
        
        
    }
    
}
