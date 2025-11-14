package sg.modelo;

public class Deslizamiento extends Emergencia{
    private boolean bloqueaCarretera;
    private int extension;

    public Deslizamiento(boolean bloqueaCarretera, int extension) {
        this.bloqueaCarretera = bloqueaCarretera;
        this.extension = extension;
    }

    public Deslizamiento(boolean bloqueaCarretera, int extension, int id, String causa, String fecha, String tipo, String[] zonas, int severidad) {
        super(id, causa, fecha, tipo, zonas, severidad);
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
        if (!bloqueaCarretera && extension < 20) {
            setSeveridad(1);   
        } else if (extension < 50) {
            setSeveridad(2);   
        } else if (extension < 100) {
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
            if ("Deslizamiento".equalsIgnoreCase(r.getTipoEmergencia())) {
                cantidad++;
            }
        }
        float porcentaje = (cantidad / total) * 100;
        return porcentaje;
   
    }
}
