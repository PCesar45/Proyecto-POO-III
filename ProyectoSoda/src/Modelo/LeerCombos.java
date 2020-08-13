/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Singleton;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class LeerCombos implements StrategyLecturaArchivo{

    @Override
    public boolean Recuperar() {
        try{
            FileInputStream arch= new FileInputStream("Combos.txt");
            Scanner scan= new Scanner(arch);
            String linea;
            while(scan.hasNextLine()){
                linea=scan.nextLine();
                int cod=getCodigoCombo(linea);
                String nombre=getNombreCombo(linea);
                boolean dispo=getDisponibilidadCombo(linea);
                float precio=getPrecioCombo(linea);
                String desc=getDescripcionCombo(linea);
                int plato1=getPlatoCombo(linea);
                int plato2=getSegundoPlatoCombo(linea);
                if((Singleton.getInstance().getMiLocal().getMenu().getPlato(plato1)!=null)&&(Singleton.getInstance().getMiLocal().getMenu().getPlato(plato2)!=null)){
                    Combo cmb= (Combo) FactoryProducto.getProducto(TProducto.COMBO, cod, nombre, dispo, precio);
                    //Combo cmb= new Combo(desc, cod, nombre, dispo, precio);
                    cmb.setDescripcion(desc);
                    cmb.setLosPlatos(Singleton.getInstance().getMiLocal().getMenu().getPlato(plato1));
                    cmb.setLosPlatos(Singleton.getInstance().getMiLocal().getMenu().getPlato(plato2));
                    Singleton.getInstance().getMiLocal().getMenu().RegistrarCombo(cmb);
                }
                //
                //Singleton.getInstance().getMiLocal().getMenu().RegistrarCombo();
            }
        }
        catch(FileNotFoundException e ){
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println("Se ha terminado de leer el archivo: Combos.txt"+'\n');
        return true;
    }
    
    public int getCodigoCombo(String linea){
        String codCombo;
        codCombo=linea.substring(0, linea.indexOf(';'));
        int cod=Integer.parseInt(codCombo);
        return cod;
    }
    public String getNombreCombo(String linea){
        String nomCombo;
        linea=linea.substring(linea.indexOf(';')+1);
        nomCombo=linea.substring(0, linea.indexOf(';'));
        return nomCombo;
    }
    public boolean getDisponibilidadCombo(String linea){
        String dispo;
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        dispo=linea.substring(0, linea.indexOf(';'));
        return "1".equals(dispo);
    }
    public float getPrecioCombo(String linea){
        String precio;
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        precio=linea.substring(0, linea.indexOf(';'));
        float price=Float.parseFloat(precio);
        return price;
    }
    public String getDescripcionCombo(String linea){
        String desc;
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        desc=linea.substring(0, linea.indexOf(';'));
        return desc;
    }
    public int getPlatoCombo(String linea){
        String plato;
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        plato=linea.substring(0, linea.indexOf(';'));
        int plat1=Integer.parseInt(plato);
        return plat1;
    }
    public int getSegundoPlatoCombo(String linea){
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        int plat2=Integer.parseInt(linea);
        return plat2;
    }
}
