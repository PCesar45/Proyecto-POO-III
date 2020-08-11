
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Singleton;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Andrés
 */
public class LeerAdmins implements StrategyLecturaArchivo{

    @Override
    public boolean Recuperar() {
        //Acá iría el proceso de carga de Administradores
        File archivo = null;
        FileReader fReader = null;
        BufferedReader bReader = null;
        
        try {
            archivo = new File("Administradores.txt");
            fReader = new FileReader(archivo);
            bReader = new BufferedReader(fReader);

            String linea;
            long codigo;
            String nombre;
            while ((linea=bReader.readLine())!= null) {
                //Hace el split de los codigos
                codigo = Long.parseLong(linea.substring(0, linea.indexOf(';')));
                nombre = linea.substring(linea.indexOf(';')+1);
                //Llama al local, el cual se encuentra en el singlenton
                Singleton.getInstance().getMiLocal().getAdmins().add(new Administrador(codigo,nombre));
            }

        } catch (IOException ex) {
            return false;
            
        } finally {
            try {
                if(fReader!=null){
                    fReader.close();
                }
            } catch (IOException ex2) {
                return false;
            }
        }
        return true;
    }
    
}
