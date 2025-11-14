package sg.modelo;

public class Terremoto extends Emergencia{
   private float magnitud;
   private boolean esReplica;

    public Terremoto(float magnitud, boolean esReplica) {
        this.magnitud = magnitud;
        this.esReplica = esReplica;
    }

    public Terremoto(float magnitud, boolean esReplica, int id, String causa, String fecha, String tipo, String[] zonas, int severidad, EntidadDeRiesgo entidadQueAtiende) {
        super(id, causa, fecha, tipo, zonas, severidad, entidadQueAtiende);
        this.magnitud = magnitud;
        this.esReplica = esReplica;
    }

    
    public Terremoto() {
    }

   
    /**
     * @return the magnitud
     */
    public float getMagnitud() {
        return magnitud;
    }

    /**
     * @param magnitud the magnitud to set
     */
    public void setMagnitud(float magnitud) {
        this.magnitud = magnitud;
    }

    /**
     * @return the esReplica
     */
    public boolean isEsReplica() {
        return esReplica;
    }

    /**
     * @param esReplica the esReplica to set
     */
    public void setEsReplica(boolean esReplica) {
        this.esReplica = esReplica;
    }

    @Override
    public String toString() {
        return "Terremoto{" + "magnitud=" + magnitud + ", esReplica=" + esReplica + '}';
    }

    @Override
    public void evaluarEmergencia() {
        if (magnitud < 4.0f) {
            setSeveridad(1);     
        } else if (magnitud < 6.0f) {
            setSeveridad(2);      
        } else if (magnitud < 7.5f) {
            setSeveridad(3);      
        } else {
            setSeveridad(4);      
        }
    }

    @Override
    public float porcenEmergencias() {
        int total = contarReporte();
        float cantidad = 0;
        
        for (Reporte r : getReportes()) {
            if ("Terremoto".equalsIgnoreCase(r.getTipoEmergencia())) {
                cantidad++;
            }
        }
        float porcentaje = (cantidad / total) * 100;
        return porcentaje;
    }
 
}
