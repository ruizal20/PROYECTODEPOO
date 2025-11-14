/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sg.modelo;

import java.io.Serializable;

/**
 *
 * @author ESTUDIANTE
 */
public class Usuario implements Cloneable, Serializable{
    private int cedula;
    private String nombre;
    private String zona;
    private String ubicacion;

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
    
    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
        this.zona = zona;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", zona=" + zona + ", ubicacion=" + ubicacion + '}';
    }
    
    
}
