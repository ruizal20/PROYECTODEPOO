package sg.modelo;

import java.util.ArrayList;

public class Vendaval extends Emergencia{
    private float velocidadViento;
    private boolean afectacionServicios;
    private boolean danosinfraEstructura;

    public Vendaval(float velocidadViento, boolean afectacionServicios, boolean danosinfraEstructura) {
        this.velocidadViento = velocidadViento;
        this.afectacionServicios = afectacionServicios;
        this.danosinfraEstructura = danosinfraEstructura;
    }

    public Vendaval(float velocidadViento, boolean afectacionServicios, boolean danosinfraEstructura, int id, String causa, String fecha, String tipo, String[] zonas, int severidad, ArrayList<Reporte> reportes, EntidadDeRiesgo entidadQueAtiende) {
        super(id, causa, fecha, tipo, zonas, severidad, reportes, entidadQueAtiende);
        this.velocidadViento = velocidadViento;
        this.afectacionServicios = afectacionServicios;
        this.danosinfraEstructura = danosinfraEstructura;
    }

    public Vendaval() {
    }

    public float getVelocidadViento() {
        return velocidadViento;
    }

    public void setVelocidadViento(float velocidadViento) {
        this.velocidadViento = velocidadViento;
    }

    public boolean isAfectacionServicios() {
        return afectacionServicios;
    }

    public void setAfectacionServicios(boolean afectacionServicios) {
        this.afectacionServicios = afectacionServicios;
    }

    public boolean isDanosinfraEstructura() {
        return danosinfraEstructura;
    }

    public void setDanosinfraEstructura(boolean danosinfraEstructura) {
        this.danosinfraEstructura = danosinfraEstructura;
    }

    @Override
    public String toString() {
        return "Vendaval{" + "velocidadViento=" + velocidadViento + ", afectacionServicios=" + afectacionServicios + ", danosinfraEstructura=" + danosinfraEstructura + '}';
    }

    @Override
    public void evaluarEmergencia() {
        if (velocidadViento < 0) {
            System.out.println("La velocidad del viento no puede ser negativa.");
            setSeveridad(0);
            return;
        }

        if (velocidadViento < 60 && !afectacionServicios && !danosinfraEstructura) {
            setSeveridad(1);        

        } else if (velocidadViento >= 60 && velocidadViento < 100 && !danosinfraEstructura) {
            setSeveridad(2);          

        } else if (velocidadViento >= 100 && danosinfraEstructura) {
            setSeveridad(3);          

        } else {
            setSeveridad(3);
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
