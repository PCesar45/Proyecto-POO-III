
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Esta clase se hace cargo del manejo de archivos de texto, en los que se alojan informacion 
 * relacionada con el Triángulo de Pascal y sus aplicaciones, que sera mostrada al usuario
 */
public class ArchivoTXT {
    
    private String nombre;

    public ArchivoTXT() {
    }
    
    /**
     * 
     * @param nombre del archivo de texto a usar
     */
    public ArchivoTXT(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Lee el contenido textual del archivo
     * @return contenido
     */
    public String leer() {

        File archivo = null;
        FileReader fReader = null;
        BufferedReader bReader = null;
        String info = "";
        
        try {
            archivo = new File(nombre);
            fReader = new FileReader(archivo);
            bReader = new BufferedReader(fReader);

            String linea;
            while ((linea=bReader.readLine())!= null) {
                info+= linea+"\n";
            }

        } catch (IOException ex) {
            info+= "Un error ha ocurrido. Verifique la dirección del archivo\n";
            
        } finally {
            try {
                if(fReader!=null){
                    fReader.close();
                }
            } catch (IOException ex2) {
                info+= "Un error ha ocurrido. Verifique la dirección del archivo\n";
            }
        }
        return info;
    }
    
    /**
     * Escribe en un archivo de texto
     * @param linea
     * @return bandera
     */
    public boolean append(String linea){
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            fichero = new FileWriter(nombre,true);
            pw = new PrintWriter(fichero);
            
            pw.println(linea);
            
        } catch (Exception e) {
            return false;
        } finally {
           try {
               if (null != fichero)
                  fichero.close();
               } catch (Exception e2) {
                  return false;
               }
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
