
package Modelo;


public class Administrador {
    
    private long codigo;
    private String nombre;

    public Administrador() {
    }

    public Administrador(long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Administrador{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
}
