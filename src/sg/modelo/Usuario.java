
package sg.modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Cloneable, Serializable{
    private int cedula;
    private String nombre;
    private String zona;
    private String ubicacion;
    private ArrayList<Reporte> prevenciones;

    public Usuario() {
    }
    
      public Usuario(int cedula, String nombre, String zona, String ubicacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.zona = zona;
        this.ubicacion = ubicacion;
    }
      
    @Override
    protected Usuario clone()  throws CloneNotSupportedException {
        return (Usuario) super.clone();
    }
    
    public Usuario Usuario(Usuario u){
        return new Usuario(u.cedula,u.nombre,u.ubicacion,u.zona);
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", zona=" + zona + ", ubicacion=" + ubicacion + '}';
    }
    
    public void prevencionEmergencia(Reporte reporte){
        prevenciones.add(reporte);
    }
}
