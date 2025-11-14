package sg.modelo;

public class Vendaval extends Emergencia{
    private float velocidadViento;
    private boolean afectacionServicios;
    private boolean danosinfraEstructura;

    public Vendaval(float velocidadViento, boolean afectacionServicios, boolean danosinfraEstructura) {
        this.velocidadViento = velocidadViento;
        this.afectacionServicios = afectacionServicios;
        this.danosinfraEstructura = danosinfraEstructura;
    }

    public Vendaval(float velocidadViento, boolean afectacionServicios, boolean danosinfraEstructura, int id, String causa, String fecha, String tipo, String[] zonas, int severidad, Object entidadQueAtiende) {
        super(id, causa, fecha, tipo, zonas, severidad, entidadQueAtiende);
        this.velocidadViento = velocidadViento;
        this.afectacionServicios = afectacionServicios;
        this.danosinfraEstructura = danosinfraEstructura;
    }

    

    public Vendaval() {
    }

    
    /**
     * @return the velocidadViento
     */
    public float getVelocidadViento() {
        return velocidadViento;
    }

    /**
     * @param velocidadViento the velocidadViento to set
     */
    public void setVelocidadViento(float velocidadViento) {
        this.velocidadViento = velocidadViento;
    }

    /**
     * @return the afectacionServicios
     */
    public boolean isAfectacionServicios() {
        return afectacionServicios;
    }

    /**
     * @param afectacionServicios the afectacionServicios to set
     */
    public void setAfectacionServicios(boolean afectacionServicios) {
        this.afectacionServicios = afectacionServicios;
    }

    /**
     * @return the danosinfraEstructura
     */
    public boolean isDanosinfraEstructura() {
        return danosinfraEstructura;
    }

    /**
     * @param danosinfraEstructura the danosinfraEstructura to set
     */
    public void setDanosinfraEstructura(boolean danosinfraEstructura) {
        this.danosinfraEstructura = danosinfraEstructura;
    }

    @Override
    public String toString() {
        return "Vendaval{" + "velocidadViento=" + velocidadViento + ", afectacionServicios=" + afectacionServicios + ", danosinfraEstructura=" + danosinfraEstructura + '}';
    }

    @Override
    public void evaluarEmergencia() {
        if (velocidadViento < 40 && !afectacionServicios && !danosinfraEstructura) {
            setSeveridad(1);   
        } else if (velocidadViento < 60) {
            setSeveridad(2);   
        } else if (velocidadViento < 80) {
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
            if ("Vendaval".equalsIgnoreCase(r.getTipoEmergencia())) {
                cantidad++;
            }
        }
        float porcentaje = (cantidad / total) * 100;
        return porcentaje;
    }
    
}
