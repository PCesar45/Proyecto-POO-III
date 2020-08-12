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
    private ArrayList<Combo> listCombo= new ArrayList<>();
    private ArrayList<Plato> listPlatillo= new ArrayList<>();

    public Menu() {
    }
    
    public ArrayList VerPlatos(){
        return listPlatillo;
    }
    
    public void VerCombos(){
    }
    
    public void ModificarPlato(Plato platillo){
        
    }
    
    public void RegistrarPlato(Plato platillo){ //tal vez no deba recibir el objeto plato
        listPlatillo.add(platillo);
    }
    
    public void RegistrarCombo(Combo unCombo){
        
    }
    
    public void ModificarCombo(){
        
    }
}

