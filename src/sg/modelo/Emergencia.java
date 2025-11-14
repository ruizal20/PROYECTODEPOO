
package sg.modelo;

import java.util.ArrayList;


public abstract class Emergencia {
    
    private int id;
    private String causa;
    private String fecha;
    private String tipo;
    private String[] zonas;
    private int severidad;
    private ArrayList<Reporte> reportes;

    public Emergencia() {
    }

    public Emergencia(int id, String causa, String fecha, String tipo, String[] zonas, int severidad) {
        this.id = id;
        this.causa = causa;
        this.fecha = fecha;
        this.tipo = tipo;
        this.zonas = zonas;
        this.severidad = severidad;
        this.reportes = new ArrayList<>();
    }
    
    public void addReporte(Reporte reporte) {
         reportes.add(reporte);
        
    }
    
    ArrayList<String> listarReporte() {

        ArrayList<String> lista = new ArrayList<>();

        for (Reporte r : reportes) {
            lista.add(r.toString());
        }
        return lista;
    }
    
    public int contarReporte() {
        return reportes.size();
    }

    public abstract void evaluarEmergencia();

    public abstract float porcenEmergencias();
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the causa
     */
    public String getCausa() {
        return causa;
    }

    /**
     * @param causa the causa to set
     */
    public void setCausa(String causa) {
        this.causa = causa;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the zonas
     */
    public String[] getZonas() {
        return zonas;
    }

    /**
     * @param zonas the zonas to set
     */
    public void setZonas(String[] zonas) {
        this.zonas = zonas;
    }

    /**
     * @return the severidad
     */
    public int getSeveridad() {
        return severidad;
    }

    /**
     * @param severidad the severidad to set
     */
    public void setSeveridad(int severidad) {
        this.severidad = severidad;
    }

    /**
     * @return the reportes
     */
    public ArrayList<Reporte> getReportes() {
        return reportes;
    }

    /**
     * @param reportes the reportes to set
     */
    public void setReportes(ArrayList<Reporte> reportes) {
        this.reportes = reportes;
    }
    
    
    
    
    
    
    
    
    
    
}
