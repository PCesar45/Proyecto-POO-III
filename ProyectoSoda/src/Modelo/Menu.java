/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Menu {
    private ArrayList<Combo> listCombo= new ArrayList<Combo>();
    private ArrayList<Plato> listPlatillo= new ArrayList<Plato>();

    public Menu() {
    }
    
    public ArrayList VerPlatos(){
        return listPlatillo;
    }
    
    public ArrayList VerCombos(){
        return listCombo;
    }
    
    public void ModificarPlato(Plato platillo){
        
    }
    
    public void RegistrarPlato(Plato platillo){ //tal vez no deba recibir el objeto plato
        listPlatillo.add(platillo);
    }
    
    public void RegistrarCombo(Combo unCombo){
        listCombo.add(unCombo);
    }
    
    public void ModificarCombo(){
        
    }
    
    public Plato getPlato(int cod){
        for(Plato Plt: listPlatillo){
            if(Plt.getCodigo()==cod){
                return Plt;
            }
        }
        return null;
    }
    public Combo getCombo(int cod){
        for(Combo cmb:listCombo){
            if(cmb.getCodigo()==cod){
                return cmb;
            }
        }
        return null;
    }
    
}

