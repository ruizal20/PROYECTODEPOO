
package sg.modelo;

import java.util.List;

public class EntidadDeRiesgo {
    private int id;
    private String nombre;
    private boolean disponible;
    private Emergencia emergenciaQueAtiende;
    private int cantEmergAtendidas;

    public EntidadDeRiesgo() {
    }

    public EntidadDeRiesgo(int id, String nombre, boolean disponible, Emergencia emergenciaQueAtiende, int cantEmergAtendidas) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
        this.emergenciaQueAtiende = emergenciaQueAtiende;
        this.cantEmergAtendidas = cantEmergAtendidas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Emergencia getEmergenciaQueAtiende() {
        return emergenciaQueAtiende;
    }

    public void setEmergenciaQueAtiende(Emergencia emergenciaQueAtiende) {
        this.emergenciaQueAtiende = emergenciaQueAtiende;
    }

    public int getCantEmergAtendidas() {
        return cantEmergAtendidas;
    }

    public void setCantEmergAtendidas(int cantEmergAtendidas) {
        this.cantEmergAtendidas = cantEmergAtendidas;
    }

    @Override
    public String toString() {
        return "EntidadDeRiesgo{" + "id = " + id + ", nombre = " + nombre + ", disponible = " + disponible + ", emergenciaQueAtiende = " + emergenciaQueAtiende + ", cantEmergAtendida = " + cantEmergAtendidas + '}';
    }
    
    public boolean actualizarDatosEmergencia(Emergencia actualizar, int idEmergencia){
        if (emergenciaQueAtiende.getId() != idEmergencia) {
            return false;
        }else{
            emergenciaQueAtiende.setCausa(actualizar.getCausa());
            cantEmergAtendidas++;
            return true;
        }
    }
       
    public void actualizarEstado(){ // Lo llamamos justo despues de que actualice datos
        emergenciaQueAtiende = null;
        disponible = true;
    }
    
    public void prevencionEmergencia(String tipo, String causa, String zona, List<Usuario> usuarios){
        Reporte reporte = new Reporte();
        
        reporte.setTipoEmergencia(tipo);
        reporte.setDescripcion(causa);
        reporte.setUbicacion(zona);
        reporte.setHeridosVisibles(false);
        reporte.setUsuarioReporta(null);
        
        for (Usuario usuario : usuarios) {
            if (usuario.getZona().equalsIgnoreCase(zona)) {
                usuario
            }
        }
    }
}
