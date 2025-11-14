package sg.modelo;

import java.util.ArrayList;

public class Deslizamiento extends Emergencia{
    private boolean bloqueaCarretera;
    private int extension;

    public Deslizamiento(boolean bloqueaCarretera, int extension) {
        this.bloqueaCarretera = bloqueaCarretera;
        this.extension = extension;
    }

    public Deslizamiento(boolean bloqueaCarretera, int extension, int id, String causa, String fecha, String tipo, String[] zonas, int severidad, ArrayList<Reporte> reportes, EntidadDeRiesgo entidadQueAtiende) {
        super(id, causa, fecha, tipo, zonas, severidad, reportes, entidadQueAtiende);
        this.bloqueaCarretera = bloqueaCarretera;
        this.extension = extension;
    }

    
    

    public Deslizamiento() {
    }

    
    /**
     * @return the bloqueaCarretera
     */
    public boolean isBloqueaCarretera() {
        return bloqueaCarretera;
    }

    /**
     * @param bloqueaCarretera the bloqueaCarretera to set
     */
    public void setBloqueaCarretera(boolean bloqueaCarretera) {
        this.bloqueaCarretera = bloqueaCarretera;
    }

    /**
     * @return the extension
     */
    public int getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(int extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "Deslizamiento{" + "bloqueaCarretera=" + bloqueaCarretera + ", extension=" + extension + '}';
    }

    @Override
    public void evaluarEmergencia() {
        if (extension < 0) {
            System.out.println("La extensión no puede ser negativa.");
            setSeveridad(0);
            return;
        }
              
        if (extension <= 50) {
            setSeveridad(1);         
        } else if (extension <= 200) {
            if (bloqueaCarretera) {
                setSeveridad(3);      
            } else {
                setSeveridad(2);      
            }
        } else {
            setSeveridad(3);          
        }
    }

    @Override
    public float porcenEmergencias() {
        int total = contarReporte();   
        float cantidad = 0;

        for (Reporte r : getReportes()) {
            if ("Deslizamiento".equalsIgnoreCase(r.getTipoEmergencia())) {
                cantidad++;
            }
        }
        float porcentaje = (cantidad / total) * 100;
        return porcentaje;
   
    }
}
