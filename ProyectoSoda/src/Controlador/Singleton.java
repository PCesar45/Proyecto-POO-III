package Controlador;


public class Singleton {
    
    private static Singleton INSTANCE = null;
    
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
    
}
