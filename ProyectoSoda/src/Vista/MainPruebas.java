
package Vista;


import Controlador.Singleton;
import Modelo.Combo;
import Modelo.FactoryProducto;
import Modelo.LeerAdmins;
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
        
        //Carga la información de los admins
        LeerPlatos p1 = new LeerPlatos();
        p1.Recuperar();
        
        System.out.println(Singleton.getInstance().getMiLocal().getMenu().VerPlatos().toString());
        
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
        
        
        //Tabla
      
        boolean combos=false;
        Menus vista=new Menus();
        DefaultTableModel modelo=new DefaultTableModel();
        JTable tabla=vista.DatosExcel;
        tabla.setModel(modelo);
        ArrayList<Plato> platos=Singleton.getInstance().getMiLocal().getMenu().VerPlatos();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Disponibilidad");
        if(combos)
            modelo.addColumn("Descripcion");
        Object[]ListaColumna=new Object[9999];
         //int cont;
         System.out.println(platos.size());
        if(combos==false){
            for(int j=0;j!=platos.size();j++){
                System.out.println("1");
                ListaColumna[0]=platos.get(j).getCodigo();
                ListaColumna[1]=platos.get(j).getNombre();
                ListaColumna[2]=platos.get(j).getPrecio();
                if(platos.get(j).isDisponibilidad()==false){
                    ListaColumna[3]="No esta disponible";
                }
                else{
                    ListaColumna[3]="Disponible";
                }

                modelo.addRow(ListaColumna);
             }
            
        }
        
         vista.setVisible(true);
        
        
    }
    
}
