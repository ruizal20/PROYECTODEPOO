package sg.modelo;

import java.util.ArrayList;

public class Incendio extends Emergencia{
    private float hectareasAfectadas;

    public Incendio(float hectareasAfectadas) {
        this.hectareasAfectadas = hectareasAfectadas;
    }

    public Incendio(float hectareasAfectadas, int id, String causa, String fecha, String tipo, String[] zonas, int severidad, ArrayList<Reporte> reportes, EntidadDeRiesgo entidadQueAtiende) {
        super(id, causa, fecha, tipo, zonas, severidad, reportes, entidadQueAtiende);
        this.hectareasAfectadas = hectareasAfectadas;
    }
    
    public Incendio() {
    }

    public float getHectareasAfectadas() {
        return hectareasAfectadas;
    }

    public void setHectareasAfectadas(float hectareasAfectadas) {
        this.hectareasAfectadas = hectareasAfectadas;
    }

    @Override
    public String toString() {
        return "Incendio{" + "hectareasAfectadas=" + hectareasAfectadas + '}';
    }

    @Override
    public void evaluarEmergencia() {
        if (hectareasAfectadas < 0) {
            setSeveridad(0);
            return;
        }

        if (hectareasAfectadas <= 10) {
            setSeveridad(1);         
        } else if (hectareasAfectadas <= 100) {
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
            if ("Incendio".equalsIgnoreCase(r.getTipoEmergencia())) {
                cantidad++;
            }
        }
        float porcentaje = (cantidad / total) * 100;
        return porcentaje;
    }
    
}
