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
public class LeerPlatos implements StrategyLecturaArchivo {

    @Override
    public boolean Recuperar(){
        try{
            FileInputStream arch= new FileInputStream("platillos.txt");
            Scanner scan= new Scanner(arch);
            String linea="";
            while(scan.hasNextLine()){
                linea=scan.nextLine();
                TPlato tipo=getTipoPlato(linea);
                int codplato=getCodigoPlato(linea);
                String nomplato=getNombrePlato(linea);
                boolean dispo=getDisponibilidadPlato(linea);
                float precio=getPrecioPlato(linea);
                Singleton.getInstance().getMiLocal().getMenu().RegistrarPlato(new Plato(tipo, codplato, nomplato, dispo, precio));
            }
        }
        catch(FileNotFoundException e ){
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println("Se ha terminado de leer el archivo: platillos.txt"+'\n');
        return true;
    }
    
    public int getCodigoPlato(String linea){
        String codPlato=linea.substring(0, linea.indexOf(';'));
        int cods=Integer.parseInt(codPlato);
        return cods;
    }
    public String getNombrePlato(String linea){
        String nomPlato;
        linea=linea.substring(linea.indexOf(';')+1);
        nomPlato=linea.substring(0, linea.indexOf(';'));
        return nomPlato;
    }
    public boolean getDisponibilidadPlato(String linea){
        String dispo="";
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        dispo=linea.substring(0, linea.indexOf(';'));
        if("1".equals(dispo)){
            return true;
        }
        return false;
    }
    public float getPrecioPlato(String linea){
        String precio;
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        precio=linea.substring(0, linea.indexOf(';'));
        float price=Float.parseFloat(precio);
        return price;
    }
    public TPlato getTipoPlato(String linea){
        TPlato plato;
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        linea=linea.substring(linea.indexOf(';')+1);
        switch(linea){
            case "COMIDA":
                plato=TPlato.COMIDA;
                break;
            case "POSTRE":
                plato=TPlato.POSTRE;
                break;
            case "BEBIDA":
                plato=TPlato.BEBIDA;
                break;
            case "ENTRADA":
                plato=TPlato.ENTRADA;
                break;
            default:
                plato=TPlato.COMIDA;
                break;
        }
        return plato;
    }
}
