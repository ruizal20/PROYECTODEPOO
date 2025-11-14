
package sg.modelo;

public class EntidadDeRiesgo {
    private int id;
    private String nombre;
    private boolean disponible;
    private Emergencia emergenciaQueAtiende;
    private int cantEmergAtendida;

    public EntidadDeRiesgo() {
    }

    public EntidadDeRiesgo(int id, String nombre, boolean disponible, Emergencia emergenciaQueAtiende, int cantEmergAtendida) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
        this.emergenciaQueAtiende = emergenciaQueAtiende;
        this.cantEmergAtendida = cantEmergAtendida;
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

    public int getCantEmergAtendida() {
        return cantEmergAtendida;
    }

    public void setCantEmergAtendida(int cantEmergAtendida) {
        this.cantEmergAtendida = cantEmergAtendida;
    }

    @Override
    public String toString() {
        return "EntidadDeRiesgo{" + "id = " + id + ", nombre = " + nombre + ", disponible = " + disponible + ", emergenciaQueAtiende = " + emergenciaQueAtiende + ", cantEmergAtendida = " + cantEmergAtendida + '}';
    }
    
    public boolean actualizarDatosEmergencia(){
        
    }
       
    public void actualizarEstado(){
        if (actualizarDatosEmergencia()) {
            disponible = true;
        }else{
            disponible = false;
        }
    }
    
    public void prevencionEmergencia(){
        
    }
}
