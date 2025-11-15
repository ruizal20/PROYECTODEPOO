package sg.modelo;

import java.util.ArrayList;

public class Terremoto extends Emergencia{
   private float magnitud;
   private boolean esReplica;

    public Terremoto(float magnitud, boolean esReplica) {
        this.magnitud = magnitud;
        this.esReplica = esReplica;
    }

    public Terremoto(float magnitud, boolean esReplica, int id, String causa, String fecha, String tipo, String[] zonas, int severidad, ArrayList<Reporte> reportes, EntidadDeRiesgo entidadQueAtiende) {
        super(id, causa, fecha, tipo, zonas, severidad, reportes, entidadQueAtiende);
        this.magnitud = magnitud;
        this.esReplica = esReplica;
    }

    public Terremoto() {
    }

    public float getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(float magnitud) {
        this.magnitud = magnitud;
    }

    public boolean isEsReplica() {
        return esReplica;
    }

    public void setEsReplica(boolean esReplica) {
        this.esReplica = esReplica;
    }

    @Override
    public String toString() {
        return "Terremoto{" + "magnitud=" + magnitud + ", esReplica=" + esReplica + '}';
    }

    @Override
    public void evaluarEmergencia() {
        if (magnitud < 0) {
            System.out.println("La magnitud no puede ser negativa.");
            setSeveridad(0);
            return;
        }

        if (magnitud <= 4.0f) {
            setSeveridad(1);          
        } else if (magnitud <= 6.0f) {
            setSeveridad(2);          
        } else {
            setSeveridad(3);          
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
