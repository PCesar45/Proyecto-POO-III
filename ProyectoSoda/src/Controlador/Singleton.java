package Controlador;

import Modelo.Local;


public class Singleton {
    
    private static Singleton INSTANCE = null;
    private Local miLocal = new Local();
    
    private Singleton(){}
    
    private synchronized static void createInstance(){
        if(INSTANCE==null){
            INSTANCE = new Singleton();
        }
    }
    
    public static Singleton getInstance(){
        if (INSTANCE==null){
            createInstance();
        }
        return INSTANCE;
    }

    public Local getMiLocal() {
        return miLocal;
    }

    public void setMiLocal(Local miLocal) {
        this.miLocal = miLocal;
    }
    
}
