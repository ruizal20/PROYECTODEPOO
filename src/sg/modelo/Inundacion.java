package sg.modelo;

import java.util.ArrayList;

public class Inundacion extends Emergencia{
   private int nivelDelAgua; 

    public Inundacion(int nivelDelAgua) {
        this.nivelDelAgua = nivelDelAgua;
    }

    public Inundacion(int nivelDelAgua, int id, String causa, String fecha, String tipo, String[] zonas, int severidad, ArrayList<Reporte> reportes, EntidadDeRiesgo entidadQueAtiende) {
        super(id, causa, fecha, tipo, zonas, severidad, reportes, entidadQueAtiende);
        this.nivelDelAgua = nivelDelAgua;
    }

    

    

    public Inundacion() {
    }

   
    /**
     * @return the nivelDelAgua
     */
    public int getNivelDelAgua() {
        return nivelDelAgua;
    }

    /**
     * @param nivelDelAgua the nivelDelAgua to set
     */
    public void setNivelDelAgua(int nivelDelAgua) {
        this.nivelDelAgua = nivelDelAgua;
    }

    @Override
    public String toString() {
        return "Inundacion{" + "nivelDelAgua=" + nivelDelAgua + '}';
    }

    @Override
    public void evaluarEmergencia() {
        if (nivelDelAgua < 0) {
            System.out.println("El nivel del agua no puede ser negativo.");
            setSeveridad(0);
            return;
        }

        if (nivelDelAgua <= 30) {
            setSeveridad(1);         
        } else if (nivelDelAgua < 80) {
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
            if ("Inundacion".equalsIgnoreCase(r.getTipoEmergencia())) {
                cantidad++;
            }
        }
        float porcentaje = (cantidad / total) * 100;
        return porcentaje;
    }
}
