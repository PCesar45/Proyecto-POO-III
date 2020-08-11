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
public class LeerPlatos implements StrategyLecturaArchivo {

    @Override
    public boolean Recuperar(){
        try{
            FileInputStream arch= new FileInputStream("platillos.txt");
            Scanner scan= new Scanner(arch);
            while(scan.hasNextLine()){
                System.out.println(getTipoPlato(scan.nextLine()));
                //Aqui se hace el proceso para armar los productos
            }
        }
        catch(FileNotFoundException e ){
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println("Se ha terminado de leer el archivo: platillos.txt"+'\n');
        return true;
    }
    
    public String getCodigoPlato(String linea){
        String codPlato=linea.substring(0, linea.indexOf(';'));
        return codPlato;
    }
    public String getNombrePlato(String linea){
        String nomPlato;
        linea=linea.substring(linea.indexOf(';')+1);
        nomPlato=linea.substring(0, linea.indexOf(';'));
        return nomPlato;
    }
    public String getDisponibilidadPlato(String linea){
        String dispo="";
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        dispo=linea.substring(0, linea.indexOf(';'));
        return dispo;
    }
    public String getPrecioPlato(String linea){
        String precio;
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        precio=linea.substring(0, linea.indexOf(';'));
        return precio;
    }
    public String getTipoPlato(String linea){
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        return linea;
    }
}
