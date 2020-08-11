/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
            while(scan.hasNextLine()){
                //System.out.println(scan.nextLine());
                System.out.println(getSegundoPlatoCombo(scan.nextLine()));
            }
        }
        catch(FileNotFoundException e ){
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println("Se ha terminado de leer el archivo: Combos.txt"+'\n');
        return true;
    }
    
    public String getCodigoCombo(String linea){
        String codCombo;
        codCombo=linea.substring(0, linea.indexOf(';'));
        return codCombo;
    }
    public String getNombreCombo(String linea){
        String nomCombo;
        linea=linea.substring(linea.indexOf(';')+1);
        nomCombo=linea.substring(0, linea.indexOf(';'));
        return nomCombo;
    }
    public String getDisponibilidadCombo(String linea){
        String dispo;
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        dispo=linea.substring(0, linea.indexOf(';'));
        return dispo;
    }
    public String getPrecioCombo(String linea){
        String precio;
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        precio=linea.substring(0, linea.indexOf(';'));
        return precio;
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
    public String getPlatoCombo(String linea){
        String plato;
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        plato=linea.substring(0, linea.indexOf(';'));
        return plato;
    }
    public String getSegundoPlatoCombo(String linea){
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        return linea;
    }
}
